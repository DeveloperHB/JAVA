package chap13.sec02.exam03;

public class Box<T> {
	public T content;//필드
	
	//Box 의 내용물이 같은지 비교
	public boolean compare(Box<T> other) {
		boolean result = content.equals(other.content);
		//Object 의 equals() 메소드로 content 필드값 비교
		return result;
	}

}
