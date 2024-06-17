package chap20.sec10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {

	public static void main(String[] args) {
		Connection conn = null;
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 연결하기
            conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/thisisjava",
                            "root",
                            "1234"
                            );
            //트랜잭션 시작
            conn.setAutoCommit(false);
            //출금 작업
            String sql1="update accounts set balance=balance-? where ano=?";
		    PreparedStatement pstmt1 = conn.prepareStatement(sql1);
		    pstmt1.setInt(1, 100000);
		    pstmt1.setString(2, "111-111-1111");
		    int rows1 = pstmt1.executeUpdate();
		    if(rows1 == 0)throw new Exception("출금되지 않았음");
		    pstmt1.close();
		    
		    //입금
		    String sql2 = "update accounts set balance=balance+? where ano=?";
		    PreparedStatement pstmt2 = conn.prepareStatement(sql2);
		    pstmt2.setInt(1, 10000);
		    pstmt2.setString(2, "222-222-2222");
		    int rows2 = pstmt2.executeUpdate();
		    if(rows2 == 0) throw new Exception("입금되지 않았음");
		    pstmt2.close();
		    
		    //커밋
		    conn.commit();
		    System.out.println("계좌 이체 성공");
		}catch(Exception e) {
			try {
			 conn.rollback();//실패 처리
			 conn.setAutoCommit(true); //원래대로 자동커밋 켜기
			} catch (SQLException e1){}
			System.out.println("계좌 이체 실패");
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.setAutoCommit(true);
					conn.close();
				} catch (SQLException e1) {}
				
			}
		}

	}

}
