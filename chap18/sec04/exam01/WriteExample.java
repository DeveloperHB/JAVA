package chap18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("C:/Temp/test.txt");
			//문자 기반의 출력 스트림 생성
			
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b); //1문자씩 출력
			//char 배열 출력
			char[] arr = {'C','D','E','F'};
			writer.write(arr);
			writer.write("GHK"); //문자열 출력
			
			writer.flush(); // 버퍼를 비워줌
			writer.close(); //출력 스트림을 닫고 메모리 해제
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
