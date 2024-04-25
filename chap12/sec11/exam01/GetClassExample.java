package chap12.sec11.exam01;

public class GetClassExample {

	public static void main(String[] args) throws Exception{
		//프로그램에서 Class 객체 정보를 얻으려면 3가지 방법 중 하나를 이용함
		//how1(클래스 이름만 가지고 Class 객체를 얻는 방법)
		Class clazz = Car.class;
		//Class clazz1 = String.class;
		
		//how2(클래스 이름만 가지고 Class 객체를 얻는 방법)
		//Class clazz = Class.forName("ch12.sec11.exam01.Car");
		//Class clazz1 = Class.forName("java.lang.String");
		
		//how3(객체로부터 Class 객체를 얻는 방법
		Car car = new Car();
		Class clazz1 = car.getClass();
		
		String str = "감자바";
		Class clazz11 = str.getClass();
		
		System.out.println("패키지:" + clazz11.getPackage().getName());
		//getPackage():패키지 정보를읽기
		//getName():패키지를 포함한 전체 타입 이름
		System.out.println("클래스 간단 이름: " + clazz11.getSimpleName());
		//getSimpleName():패키지를 제외한 타입 이름
		System.out.println("클래스 전체 이름: " + clazz11.getName());
		System.out.println();
		

	}

}
