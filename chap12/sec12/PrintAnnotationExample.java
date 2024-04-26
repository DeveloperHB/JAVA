package chap12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	/*Service 클래스에 선언된 메소드를 리플렉션해서
	 * @PrintAnnotation 설정 정보를 얻어낸 후 
	 * 구분선을 출력하고 해당 메서드를 호출함
	 */

	public static void main(String[] args)  throws Exception {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			//PrintAnnotation 얻기
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			//지정한 어노테이션이 적용되어 있으면 어노테이션을 리턴함. 그렇지 않으면 NULL을 리턴
			
			//설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
			
			//메소드 호출
			method.invoke(new Service());
			//invoke : 메소드를 동적으로 실행시켜줌
			
			//설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
		}
	}
		public static void printLine(PrintAnnotation printAnnotation) {
			if(printAnnotation != null) {
				//number 속성값 얻기
				int number = printAnnotation.number();
				for(int i=0; i<number; i++) {
					//value 속상값 얻기
					String value = printAnnotation.value();
					System.out.print(value);
				}
				System.out.println();
			
		}

	}

}
