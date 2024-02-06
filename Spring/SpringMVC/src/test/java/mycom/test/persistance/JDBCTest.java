package mycom.test.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "book_ex";
		String pw = "book_ex";
		try {
			Connection con=  DriverManager.getConnection(url, user, pw);
			log.info("Connection Test..");
			log.info(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
