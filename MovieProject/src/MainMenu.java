import java.io.IOException;
import java.util.ArrayList;

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
	case "1" :Reserve();
	return this;
	
	case "2" :checkReservation();
	return this;
	
	case "3" :cancelReservation();
	return this;
	
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
 private void checkReservation() {
	 System.out.println("발급번호를 입력하세요.");
	 try {
		 Reservation r = Reservation.findById(scanner.nextLine()); //예매 확인
		 if(r != null) {
			 System.out.printf(">> [확인 완료] %s\n", r.toString());
		 }else {
			 System.out.println(">> 예매 내역이 없습니다.");
		 }
	 }catch (IOException e) {
		 System.out.println(">> 파일 입출력에 문제가 생겼습니다.");
		 e.printStackTrace();
	 }
 }
 
 private void cancelReservation() {
	 System.out.println("발급번호를 입력하세요: ");
	 try {
		 Reservation canceled = Reservation.cancel(scanner.nextLine());
		 if(canceled != null) {
			 System.out.printf(">> [취소 완료] %s의 예매가 취소되었습니다.\n",
					 canceled.toString());
		 }else {
			 System.out.println(">> 예매 내역이 없습니다.");
		 }
	 } catch (IOException e) {
		 System.out.println(">> 파일 입출력에 문제가 생겼습니다.");
	 }
 }
 private void Reserve() {
	 try {
		 //영화 목록 출력
		 ArrayList<Movie> movies = Movie.findAll();
		 for(int i=0; i<movies.size(); i++) {
			 System.out.printf("%s\n", movies.get(i).toString());
		 }
		 //예매 영화 선택
		 System.out.print("예매할 영화를 선택하세요: ");
		 String movieIdStr = scanner.nextLine();
		 Movie m = Movie.findById(movieIdStr);
		 ArrayList<Reservation> reservation =
				 Reservation.findByMovieId(movieIdStr);
		 Seats seats = new Seats(reservation);
		 seats.show(); // 예매 영화의 좌석 현황 출력
		 System.out.print("좌석을 선택하세요(예: E-9): ");
		 String seatName = scanner.nextLine();
		 seats.mark(seatName);
		 Reservation r = new Reservation(
				 Long.parseLong(movieIdStr), //영화 대표값
				 m.getTitle(), // 영화제목
				 seatName      // 좌석명
				 );
		 r.save();
		 System.out.println(">> 예매가 완료되었습니다.");
		 System.out.printf(">> 발급번호 %d\n", r.getId());
		 
		 
	 }catch(IOException e) {
		 System.out.println(">>파일 입출력에 문제가 생겼습니다..");
	 }catch(Exception e) {
		 System.out.printf(">> 예매에 실패하였습니다: %s\n", e.getMessage());
	 }
 }
}
