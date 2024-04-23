package chap11.sec04;

public class MyResource implements AutoCloseable{
	/* try-with-resource 블록을 사용하기 위한 조건
	 * 리소스는 java.lang.AutoCloseable 인터페이스를 구현해서
	 * AutoCloseable 인터페이스의 close() 메소드를 재정의해야 함 
	 */
	private String name;
	
	public MyResource(String name) {
		this.name = name;
		System.out.println("[MyResource(" + name + ") 열기]");
	}
	
	public String read1() {
		System.out.println("[MyResource(" + name + ") 읽기]");
		return "100";
	}
	
	public String read2() {
		System.out.println("[MyResource(" + name + ") 읽기]");
		return "adc";
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("[MyResource(" + name + ") 닫기]");
		/* try 블록에서 예외 발생 여부와 상관없이 안전하게
		 * close() 메소드가 실행되도록 재정의함
		 */
	}

}
