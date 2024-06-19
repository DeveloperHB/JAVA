
public class MainMenu extends AbstractMenu {
	private static final MainMenu instance = new MainMenu(null);
	private static final String MAIN_MENU_TEXT = // 기본 문구
			"1: 영화 예매하기\n" +
			"2: 예매 확인하기\n" +
			"3: 예매 취소하기\n" +
			"4: 관리자 메뉴로 이동\n" +
			"q: 종료\n\n" +
			"메뉴를 선택하세요: " ;
	
	
	/* 생성자가 private으로 선언되어 외부에 노출되지 않아 생성자 호출 불가함. 즉, 객체를 생성할 수 없음
	 * 오직 클래스 변수 초기화 시 단 한번 호출되어 하나의 객체만을 생성함.
	 * 이러한 패턴을 싱글턴(singleton)이라 함.
	 */
	private MainMenu(Menu prevMenu) {
		super(MAIN_MENU_TEXT, prevMenu); //부모 생성자 호출
	}
	
	public static MainMenu getInstance() {
		return instance; // 메뉴 객체 반환
	}
		
 public Menu next() {
	switch (scanner.nextLine()) {
	case "4" :
		if(! checkAdminPassword()) { // 관리자 비밀번호 확인
			System.out.println(">> 비밀번호가 틀렸습니다.");
			return this;
		}
		AdminMenu adminMenu = AdminMenu.getInstance();
		adminMenu.setPrevMenu(this); // 메인메뉴를 이전메뉴로 등록
		return adminMenu;
		
	case "q" : return prevMenu; //prevMenu 는 null이므로 종료
	default: return this;//자기 자신 반환
	}
 }
 private boolean checkAdminPassword() {
	 System.out.println("관리자 비밀번호를 입력하세요:");
	 return "8888".equals(scanner.nextLine());
		
	}
}
