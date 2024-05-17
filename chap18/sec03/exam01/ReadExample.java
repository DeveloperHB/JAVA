package chap18.sec03.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ReadExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test3.db");
			//데이터 도착지를 test3.db 파일로 하는 바이트 출력 스트림 생성
			
			byte[ ] array = {10, 20, 30, 40, 50, 60, 70};
			
			os.write(array, 1, 3); //1번 인덱스부터 3개 까지만 출력함
			os.flush(); //버퍼 비움
			os.close(); //메모리 해제
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
