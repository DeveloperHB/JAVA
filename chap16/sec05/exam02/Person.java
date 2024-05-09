package chap16.sec05.exam02;

public class Person {
	public void ordering(Comparable comparable) {
		String a = "비에고";
		String b = "가렌";
		
		int result = comparable.compare(a, b);
		
		if(result < 0) {
			System.out.println(a + "는 " + b + "보다 앞에 옵니다.");
		}else if(result == 0) {
			System.out.println(a + "는 " + b + "과 같습니다.");
		}else {
			System.out.println(a + "는 " + b + "보다 뒤에 옵니다.");
		}
	}

}
