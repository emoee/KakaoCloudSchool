package article.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import article.model.Article;
import article.model.Writer;
import jdbc.JdbcUtil;

public class ArticleDao implements IArticleDao {

	@Override
	public Article insert(Connection conn, Article article) throws SQLException {
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		// pstmt는 insert 실행 stmt는 select 실행. 단방향이므로 각각 다른 스트림을 사용해야한다. 안그러면 비워야함(null).
		try {
			pstmt = conn.prepareStatement("insert into article "
					+ "(writer_id, writer_name, title, regdate, moddate, read_cnt) "
					+ "values (?,?,?,?,?,0)");
			pstmt.setString(1, article.getWriter().getId());
			pstmt.setString(2, article.getWriter().getName());
			pstmt.setString(3, article.getTitle());
			pstmt.setTimestamp(4, toTimestamp(article.getRegDate()));
			pstmt.setTimestamp(5, toTimestamp(article.getModifiedDate()));
			int insertedCount = pstmt.executeUpdate(); // insert이므로 string이나 int로 반환된다.

			if (insertedCount > 0) {
				stmt = conn.createStatement();
				rs = stmt.executeQuery("select last_insert_id() from article");
				if (rs.next()) {
					Integer newNo = rs.getInt(1);
					return new Article(newNo,
							article.getWriter(),
							article.getTitle(),
							article.getRegDate(),
							article.getModifiedDate(),
							0);
				}
			}
			return null;
		} finally { 
			// conn은 닫으면 안된다. 서비스에서 닫아야하므로. 
			//여러명령어 실행하지만 그것이 하나의 명령어로 수행되도록 구현하기 위해서.
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
			JdbcUtil.close(pstmt);
		}
	}
	
	private Timestamp toTimestamp(Date date) {
		return new Timestamp(date.getTime());
	}

	@Override
	public int selectCount(Connection conn) throws SQLException {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select count(*) from article"); 
			if (rs.next()) {
				return rs.getInt(1); // count함수 결과값은 0에는 키 값 1에는 실제 값이라, 1을 가져옴.
			}
			return 0;
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
		}
	}

	@Override
	public List<Article> select(Connection conn, int startRow, int size) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("select * from article " +
					"order by article_no desc limit ?, ?"); 
			// limt 10, 5은 10번부터 5개 뽑는다는 의미다. 
			// 오라클의 경우는 x부터 y까지로 되기때문에 연산 동작이 필요하다.
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, size);
			rs = pstmt.executeQuery();
			List<Article> result = new ArrayList<>();
			while (rs.next()) {
				result.add(convertArticle(rs)); 
				// tuple --> Model(Data) 객체 형식으로 변환 : ⭐ORM 기술⭐ JPA
			}
			return result;
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
	}
	
	private Article convertArticle(ResultSet rs) throws SQLException {
		return new Article(rs.getInt("article_no"),
				new Writer(
						rs.getString("writer_id"),
						rs.getString("writer_name")),
				rs.getString("title"),
				toDate(rs.getTimestamp("regdate")),
				toDate(rs.getTimestamp("moddate")),
				rs.getInt("read_cnt"));
	}
	
	private Date toDate(Timestamp timestamp) {
		return new Date(timestamp.getTime());
	}

	@Override
	public Article selectById(Connection conn, int no) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(
					"select * from article where article_no = ?");
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			Article article = null;
			if (rs.next()) {
				article = convertArticle(rs);
			}
			return article;
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
	}

	@Override
	public void increaseReadCount(Connection conn, int no) throws SQLException {
		try (PreparedStatement pstmt = 
				conn.prepareStatement(
						"update article set read_cnt = read_cnt + 1 "+
						"where article_no = ?")) {
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
		}
	}

	@Override
	public int update(Connection conn, int no, String title) throws SQLException {
		try (PreparedStatement pstmt = 
				conn.prepareStatement(
						"update article set title = ?, moddate = now() "+
						"where article_no = ?")) {
			pstmt.setString(1, title);
			pstmt.setInt(2, no);
			return pstmt.executeUpdate();
		}
	}

};