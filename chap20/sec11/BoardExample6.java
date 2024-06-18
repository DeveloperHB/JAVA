package chap20.sec11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample6 {

    //필드
	
	private Scanner scanner = new Scanner(System.in);
	private Connection conn;
	
	//생성자
	public BoardExample6() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/thisisjava";
			conn = DriverManager.getConnection(url,"root","1234");
		}catch(Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s \n", "no", "writer","date","title");
		System.out.println("------------------------------------------------------");
				
		//boards 테이블에서 게시물 정보를 가져와서 출력하기
		
		try {
			String sql = ""+
		            "select bno, btitle, bcontent, bwriter, bdate " +
					"from boards " +
		            "order by bno desc";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.printf("%-6s%-12s%-16s%-40s \n",board.getBno(),
						board.getBwriter(),board.getBdate(),board.getBtitle());
			}
			rs.close();
			pstmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
			exit();
		}
		
				mainMenu();

	}


public void mainMenu() {
	System.out.println();
	System.out.println("-------------------------------");
	System.out.println("메인메뉴: 1.create | 2.Read | 3.Clear | 4.Exit");
	System.out.println("메뉴선택: ");
	String menuNo = scanner.nextLine();
	System.out.println();
	
	switch(menuNo) {
	case "1" -> create();
	case "2" -> read();
	case "3" -> clear();
	case "4" -> exit();
	}
}

public void create() {
	//입력
	Board board = new Board();
	System.out.println("[새 게시물 입력]");
	System.out.print("제목: ");
	board.setBtitle(scanner.nextLine());
	System.out.print("내용: ");
	board.setBcontent(scanner.nextLine());
	System.out.println("글쓴이: ");
	board.setBwriter(scanner.nextLine());
	
	//보조메뉴 출력
	System.out.println("-----------------------------");
	System.out.println("보조메뉴: 1.Ok  |  2.Cancel");
	System.out.println("메뉴선택: ");
	String menuNo = scanner.nextLine();
	if(menuNo.equals("1")) {
		//boards 테이블에 게시물 정보 저장
		try {
			String sql = ""+
		"insert into boards (bno, btitle, bcontent, bwriter, bdate) " +
		"values (null, ?, ?, ?, now())" ;
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			pstmt.executeUpdate();
			pstmt.close();
		} catch(Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	
	list();
}
public void read() {
	System.out.println("[게시물 읽기]");
	System.out.println("bno: ");
	int bno = Integer.parseInt(scanner.nextLine());
	
    try {
    String sql = "" +
    "select bno, btitle, bcontetn, bwriter, bdate " +
    		"from boards " +
    "where bno=?";
    		PreparedStatement pstmt = conn.prepareStatement(sql);
    		pstmt.setInt(1, bno);
    		ResultSet rs = pstmt.executeQuery();
    		if(rs.next()) {
    			Board board = new Board();
    			board.setBno(rs.getInt("bno"));
    			board.setBtitle(rs.getString("btitle"));
    			board.setBcontent(rs.getString("bcontent"));
    			board.setBwriter(rs.getString("bwriter"));
    			board.setBdate(rs.getDate("bdate"));
    			System.out.println("##########");
    			System.out.println("번호: " + board.getBno());
    			System.out.println("제목: " + board.getBtitle());
    			System.out.println("내용: " + board.getBcontent());
    			System.out.println("작성자:" + board.getBwriter());
    			System.out.println("날짜: " + board.getBdate());
    			System.out.println("##########");
    			
    			
    		}
    		rs.close();
    		pstmt.close();
    }catch (Exception e) {
    	e.printStackTrace();
    	exit();
    }
	
    list();
}
public void clear() {
	System.out.println("*** clear 메소드 실행됨 ");
	list();
}	
public void exit() {
	System.exit(0);
}
	
public static void main(String[] args) {
	BoardExample5 boardExample = new BoardExample5();
	boardExample.list();
			
}
}