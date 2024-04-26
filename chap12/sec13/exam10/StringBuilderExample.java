package chap12.sec13.exam10;

public class StringBuilderExample {

	/*public static void main(String[] args) {
		String str = "";
		for(int i = 1; i<=100; i++) {
			str += i;
		}
		System.out.println(str); */
		
	     	 public static void main(String[] args) {
			 String str = "";
			 StringBuilder sb = new StringBuilder();
			 for(int i=1; i<= 100; i++) {
			 sb.append(i); //StringBuilder 객체에 i 값 추가
			 }
			 str = sb.toString();
			 System.out.println(str); 
			}
			

	}


