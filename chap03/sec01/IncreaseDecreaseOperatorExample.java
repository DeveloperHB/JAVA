package chap03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; //1씩 증가 
		++x;
		System.out.println("x=" +x);
		System.out.println("-----------------");
		y--; //1씩 감소
		--y;
		System.out.println("y=" +y);
		System.out.println("-----------------");
		z = x++; //x값을 먼저 z에 대입하고 나중에 x값을 1증가시킴
		System.out.println("z=" +z);
		System.out.println("x=" +x);
		System.out.println("-----------------");
		z = ++x; //x값을 먼저 z에 1증가시킨후에 그 값을 z에 대입함
		System.out.println("z=" +z);
		System.out.println("x=" +x);
		System.out.println("-----------------");
		z = ++x + y++;//x값 1증가시켜서 연산, y값은 +연산을 수행한 후에 1증가
		System.out.println("z=" +z);
		System.out.println("x=" +x);
		System.out.println("y=" +y);
		
	

	}

}
