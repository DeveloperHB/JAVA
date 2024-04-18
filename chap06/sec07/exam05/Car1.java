package chap06.sec07.exam05;

public class Car1 {
	String model;
	String color;
	int maxSpeed;
	
	Car1(String model){
		this(model,"은색",250);
		this.model = model;
		this.color = "은색";
		this.maxSpeed = 250;
	}
	
	Car1(String model, String color){
		this(model, color, 250); //생성자 첫줄에 위치해야 에러가 안남
		//this.model = model;
		//this.color = color;
		//this.maxSpeed = 250;
	}
	
	
	Car1(String model, String color, int maxSpeed){ //공통 초기화코드
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}

}
