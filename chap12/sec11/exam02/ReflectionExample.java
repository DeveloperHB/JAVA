package chap12.sec11.exam02;

import java.lang.reflect.*;
/* 리플렉션
 * Class 객체로 관리하는 클래스와 인터페이스의 메타 정보를 프로그램에서 
 * 읽고 수정하는 것
 * 메타 정보 : 패키지정보, 타입정보, 멤버(생성자, 필드, 메소드)정보 말함
 */
//생성자, 필드, 메소드, 클래스는 모두 java.lang.reflect 패키지에 있음

public class ReflectionExample {

	public static void main(String[] args) throws Exception {
		Class clazz = Car.class; //방법1:Class 객체 정보를 얻음
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		//getDeclaredConstructors():생성자 정보 읽기
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName()+"(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
			
		}
		System.out.println();
		
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getName() + " " + field.getName());
		}
		System.out.println();
		
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		//getDeclaredMethods():메소드 정보 읽기
		for(Method method : methods) {
			System.out.println(method.getName()+ "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}

	}
	
	private static void printParameters(Class[] parameters) {
		for(int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i<(parameters.length-1)) {
				System.out.println(",");
				
			}
		}
	}

}
