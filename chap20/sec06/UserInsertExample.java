package chap20.sec06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//연결하기
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/thisisjava",
					"root",
					"1234");
			//sql 문 작성
			String sql = "" + 
			"INSERT INTO users (userid, username, userpassword, userage, useremail)" +
					"VALUES(?,?,?,?,?)";
			
			// preparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"winter");
			pstmt.setString(2,"한겨울");
			pstmt.setString(3,"54321");
			pstmt.setInt(4, 31);
			pstmt.setString(5, "winter@naver.com");
			
			//sql문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수 :" + rows);
			
			//preparedStatement 닫기
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
	 	}
	}

}
