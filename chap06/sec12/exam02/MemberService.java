package chap06.sec12.exam02;

public class MemberService { //Member Service 라이브러리 클래스
	/*login()메소드를 호출할 때에는 매개값으로 id와 password를 제공하고, logout()메소드는
	id만 매개값으로 제공하려고 합니다. 다음 조건과 예제 코드를 보고 memberService클래스에서 login(),
	logout()메소드를 선언해보세요.
	1.login()메소드는 매개값 id가 "hong", 매개값 password가 "12345"일 경우에만 true로 리턴
	2.logout()메소드는 id+"님이 로그아웃 되었습니다"가 출력되도록 할 것
	리턴타입: boolean , void
	메소드 이름 : login, logout
	매개변수(타입): id(String), password(String)        id(String)*/
		
	//메소드 선언
	public boolean login(String id, String password) {
	        if (id.equals("hong") && password.equals("12345")) {
            return true; //id가 "hong"이고, password가 "12345" 이면 true 리턴
        } else {
            return false;
        }
    }

    public void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다");
    }
}