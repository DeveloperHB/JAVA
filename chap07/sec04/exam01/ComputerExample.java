package chap07.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
					
		Calculator calculator = new Calculator();//부모 클래스 객체 생성
		System.out.println("원 면적:" + calculator.areaCircle(r)); 
		System.out.println();
		
		Computer computer = new Computer(); //자식 클래스 객체생성
		System.out.println("원 면적:" + computer.areaCircle(r));

	}

}
