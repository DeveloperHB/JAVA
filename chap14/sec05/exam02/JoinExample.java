package chap14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
			//sumThread 가 종료할 때까지 main 스레드는 일시 정지함
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("1~100 합: " + sumThread.getSum());

	}
		

}
