package chap20.sec11;

public class BoardExample1 {

	//메소드
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer","date","title");
		System.out.println("------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "winter","2024.06.17","welcome");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "21", "winter","2024.06.17","this winter is so cold");
		
		mainMenu();
		
	}
	
	public void mainMenu() {
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("메인메뉴: 1.create | 2.Read | 3.Clear | 4.Exit");
		System.out.println("메뉴선택: ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		BoardExample1 boardExample = new BoardExample1();
		boardExample.list();
		
	}

}
