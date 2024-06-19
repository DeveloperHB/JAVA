import java.util.Scanner;

abstract class AbstractMenu implements Menu {
	
	protected String menuText; // 기본 문구
	protected Menu prevMenu; // 이전 메뉴
	protected static final Scanner scanner = new Scanner(System.in);
	
	public AbstractMenu(String menuText, Menu prevMenu) { //생성자
		this.menuText = menuText;
		this.prevMenu = prevMenu;
		
	}
	
    public void print() {
    	System.out.println("\n" + menuText); //메뉴 출력
    }
    
    public void setPrevMenu(Menu prevMenu) { //메뉴를 종료한 후 돌아갈 이전메뉴 설정
    	this.prevMenu = prevMenu;
    }
	
	

}
