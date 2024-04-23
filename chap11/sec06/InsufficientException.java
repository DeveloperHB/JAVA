package chap11.sec06;

//extends Exception (일반예외로 선언함) : 컴파일러가 체크
public class InsufficientException extends Exception{
	//두개의 생성자를 선언함
	public InsufficientException() {

}
	
	public InsufficientException(String message) {
		super(message);
	}
	
}	
	
