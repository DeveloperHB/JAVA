package chap14.sec06.exam01;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
		
	}
	//동기화 메소드
	public synchronized void setMemory1(int memory) {
		this.memory = memory;   //메모리값 저장
		try {
		 Thread.sleep(2000); //2초간 일시정지
		} catch(InterruptedException e)  {}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		//메모리 값을 읽기
	}
	
	public void setMemory2(int memory) {
		synchronized(this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}

}
