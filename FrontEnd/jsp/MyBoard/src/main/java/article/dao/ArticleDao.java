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
import jdbc.JdbcUtil;

public class ArticleDao implements IArticleDao {

	@Override
	public Article insert(Connection conn, Article article) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount(Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Article> select(Connection conn, int startRow, int size) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article selectById(Connection conn, int no) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void increaseReadCount(Connection conn, int no) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int update(Connection conn, int no, String title) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

};