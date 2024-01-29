package article.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import article.model.Article;

public interface IArticleDao {
	public Article insert(Connection conn, Article article) throws SQLException;
	public int selectCount(Connection conn) throws SQLException;
	public List<Article> select(Connection conn, int startRow, int size) throws SQLException;
	public Article selectById(Connection conn, int no) throws SQLException;
	public void increaseReadCount(Connection conn, int no) throws SQLException;
	public int update(Connection conn, int no, String title) throws SQLException;
	
}
