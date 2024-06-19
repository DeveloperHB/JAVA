
public class MainApp {

	public static void main(String[] args) {
		System.out.println("프로그램을 시작합니다.");
		Menu menu = MainMenu.getInstance(); //메인 메뉴 객체 생성
		
		while(menu != null) {
		    menu.print();
		    menu=menu.next();
		}
		
		System.out.println("프로그램이 종료됩니다.");
		

	}

}

interface Menu { //메뉴의 역할을 인터페이스로 정의
	void print();
	Menu next();
}