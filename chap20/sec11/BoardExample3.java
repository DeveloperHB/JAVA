package chap20.sec11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class BoardExample3 {

    //필드
	
	private Scanner scanner = new Scanner(System.in);
	private Connection conn;
	
	//생성자
	public BoardExample3() {
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
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer","date","title");
		System.out.println("------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "winter","2024.06.17","welcome");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "21", "winter","2024.06.17","this winter is so cold");
		
		//boards 테이블에서 게시물 정보를 가져와서 출력하기
		
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
		System.out.println("*** create 메소드 실행됨 ");
		list();
	}
	public void read() {
		System.out.println("*** read 메소드 실행됨 ");
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
			BoardExample2 boardExample = new BoardExample2();
			boardExample.list();
					

	}

}
