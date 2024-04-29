package chap14.sec07.exam03;

public class PrintThread extends Thread {
	public void run() {
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				break;   //interrupt()메소드가 호출되었다면 while 문을 빠져나감
			}
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}

}
