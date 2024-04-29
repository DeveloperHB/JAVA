package chap14.sec07.exam01;

public class SafeStopExample {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {

	}
		
		System.out.println(true); //PrintThread를 종료하기위해 stop 필드값 변경
	}

}
