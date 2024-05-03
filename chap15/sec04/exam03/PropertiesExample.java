package chap15.sec04.exam03;

import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception{
		//Properties 컬렉션 생성
		//확장자가 *.properties 인 프로퍼티 파일을 읽을 때 사용함
		//프로퍼티 파일은 키와 값이 = 기호로 연결된 텍스트 파일
		Properties properties = new Properties();
		
		//PropertiesExample.class와 동일한 ClassPath에 있는 database.properties
		//파일로드
		properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));
		//load()메소드로 프로퍼티 파일의 내용을 메모리로 로드함
		
		//주어진 키에 대한 값 읽ㄱ
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		
		//값 출력
		System.out.println("driver :" + driver);
		System.out.println("url : "+ url);
		System.out.println("username : " +  username);
		System.out.println("password :" + password);
		System.out.println("admin : " + admin);
		

	}

}
