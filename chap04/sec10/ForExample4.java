package chap04.sec10;

public class ForExample4 {

	public static void main(String[] args) {
		//Exam.For 문을 이용해서 다음과 같은 실행 결과가 나오는 코드를 작성해 보세요.
		//*
		//**
		//***
		//****
		//*****
		
		for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
	
		}

		}

}
