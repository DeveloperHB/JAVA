package org.zerock.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCTest {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		try(Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/jspbookdb",
				"root",
				"1234")){
			System.out.println(conn + "\n연결 성공입니다.!!!");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
