package chap14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() { //작업 스레드 생성
			//익명 구현 객체를 아규먼트 개체로 받음
			@Override //작업 스레드가 실행할 코드 부분
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		});
		
		thread.start();//생성된 작업 스레드의 run()메소드를 실행
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}

	}

}
