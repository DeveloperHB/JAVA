package chap06.sec07.exam05;

public class Car {//라이브러리 클래스
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	Car(String model){
		this(model, "은색" , 250 );
		System.out.println("생성자 1");
		
				
	}
	
	Car(String model, String color){
		this(model, color, 250);
		System.out.println("생성자 2");
	}
	
	Car(String model, String color, int maxSpeed){
		System.out.println("생성자 3");
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
