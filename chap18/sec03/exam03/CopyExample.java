package chap18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
	
	public static void main(String[] args) throws Exception {
		String originalFileName = "C:/Temp/d.jpg";
		String targetFileName = "C:/Temp/d2.jpg";
		
		InputStream is = new FileInputStream(originalFileName);
		
		OutputStream os = new FileOutputStream(originalFileName);
		
		byte[] data = new byte[1024]; //읽은 바이트를 저장할 배열 생성
	    while(true) {
	    	int num = is.read(data);
	    	//최대 1024바이트를 읽고 data배열에 저장, 읽은 바이트수는 num에 리턴
	    	if(num == -1) break; //파일을 다 읽으면 while문 종료
	    	os.write(data, 0, num);// 읽은 바이트 수만큼 출력
	    }
	    
	    os.flush();//내부 버퍼 잔류 바이트를 출력하고, 버퍼를 비움
	    os.close();
	    
	    is.close();
		
	    System.out.println("복사가 잘 되었습니다.");
	}
}
