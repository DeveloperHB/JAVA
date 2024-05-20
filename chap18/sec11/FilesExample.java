package chap18.sec11;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.sql.rowset.serial.SQLOutputImpl;

public class FilesExample {

	public static void main(String[] args) {
		try {
			String data = ""+
		                  "id : winter \n"+
					      "email: winter@mycompany.com \n"+
		                  "tel: 010-2222-4444";
			
			Path path = Paths.get("C:/Temp/user.txt");
			
			Files.writeString(Paths.get("C:/Temp/user.txt"), data, Charset.forName("UTF-8"));
			
			System.out.println("파일 유형: "+ Files.probeContentType(path));
		    System.out.println("파일 크기: "+ Files.size(path) + " bytes");
		    
		    String content = Files.readString(path, Charset.forName("UTF-8"));
		    System.out.println(content);
		
		}catch (IOException e) {
			e.printStackTrace();
		    	
		}
		//probeContentType():파일 확장명에 따른 파일 유형을 리턴함
		//==> (txt파일은 text/plain   , jpg 파일은 image.jpeg 리턴함
		//writeString() : 문자열을 파일에 저장
		//readString() : 텍스트 파일의 내용을 전부 읽고 String 으로 리턴 

	}

}
