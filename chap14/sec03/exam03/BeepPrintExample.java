package chap14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			//명시적인 자식 클래스를 정의하지 않고,Thread 익명 자식 객체를 사용
			//Thread()익명 자식 객체로 작업 스레드를 정의함
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500); } catch(Exception e) {}
				}
			}
		};
		
		thread.start();//생성된 작업 스레드의 run()메소드를 실행
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}

	}

}
