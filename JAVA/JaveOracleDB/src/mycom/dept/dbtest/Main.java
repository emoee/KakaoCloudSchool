package mycom.dept.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		
		try {
			// 1. jdbc driver loading
			Class.forName("oracle.jdbc.driver.OracleDriver"); // tcp/ip 커넥션, 소켓 등등 해당 절차를 해결하기 위해 드라이버 연결
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			String sql = "SELECT * FROM EMP";
			
			// 2. 계정 연결
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. query 준비
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			// 4. query 실행 및 리턴
			while(rs.next()) {
				// 가져올 데이터의 유형을 알아야한다. 인덱스는 몰라도 됨.
				System.out.printf("%5d %11s %9s %5d %10s %8.2f %8.2f %2d \n",
				rs.getInt(1), rs.getString(2), rs.getString("JOB"), rs.getInt(4), 
				rs.getDate(5), rs.getDouble("SAL"), rs.getDouble(7), rs.getInt(8));
			}
			System.out.println("--DB종료--");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// 5. db 종료 close 생성 순서 반대로 정리해야한다.
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
			if (conn != null) conn.close();
		}
	}

}
