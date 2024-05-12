package practice.chap02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//정밀도 확인
		float var1 = 0.1221412515215125f;
		double var2 = 0.125939593992092;
		System.out.println("var1:" + var1);
		System.out.println("var2:" + var2);
		
		//10의 거듭제곱 리터럴
		double var3 = 3e4;
		float var4 = 3e6F;
		double var5 = 4e-3;
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4);
		System.out.println("var5:" + var5);

	}

}
