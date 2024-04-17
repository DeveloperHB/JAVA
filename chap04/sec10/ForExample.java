package chap04.sec10;

public class ForExample {

	public static void main(String[] args) {
		
				for(int x=1; x<=10; x++) {
				for(int y=1; y<=10;y++) {
				if ((4*x+5*y) == 60)		{
					System.out.print("("+ x +", "+y+")");  //X와Y는 10이하의 자연수, 4x+5y=60일 때의
					                                       //해를 구해라.
					System.out.print(x +", "+y);
				}
           	}
		}
}
}