package article.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import article.dao.ArticleContentDao;
import article.dao.ArticleDao;
import article.dao.IArticleDao;
import article.model.Article;
import article.model.ArticleContent;
import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;

public class WriteArticleService {
	/* 필드에서는 제목 & 작성자. 실질적으로 클릭 했을 때만 내용이 하나씩 보일 수 있도록 한다.
	   *list:제목, 작성자, count
	*/
	   
	// Writing에서 묶여서 가야하기 떄문에 Article Dao 가 아닌 IArticleDao가 되는거다( transaction)

	private IArticleDao adao= new ArticleDao();
	private ArticleContentDao contentDao= new ArticleContentDao();
	
	//@Transaction 처리를 나중에 spring에서 해준다
	public Integer write(WriteRequest req) {
		Connection conn= null;
		try {
			// transcation 처리
			conn= ConnectionProvider.getConnection();
			conn.setAutoCommit(false); // 한줄씩 커밋하는거 취소, 트랜젝션 처리하기 위함
			
			Article article= toArticle(req);
			 // Article로 바꿔주는 파라미터가 필요하다.
	        Article savedArticle =adao.insert(conn,article);
			if (savedArticle == null) {
				throw new RuntimeException("fail to insert article");  //명령 자체의 실행 오류
			}
	
			ArticleContent content= new ArticleContent(
					savedArticle.getNumber(),
					req.getContent());
			ArticleContent savedContent= contentDao.insert(conn, content);
			if (savedContent == null) {
				throw new RuntimeException("fail to insert article_content");
			}
			
			conn.commit(); // 처리할 명령 다 끝나면 커밋
			return savedArticle.getNumber();
		} catch (SQLException e) {
			JdbcUtil.rollback(conn);
			throw new RuntimeException(e);
		} catch (RuntimeException e) {
			JdbcUtil.rollback(conn);
			throw e;
		} finally {
			JdbcUtil.close(conn);
		}
	}

	private Article toArticle(WriteRequest req) {
		Date now= new Date();
		return new Article(null, req.getWriter(), req.getTitle(), now, now, 0);
	}
}
