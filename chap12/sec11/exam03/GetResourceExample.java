package chap12.sec11.exam03;

public class GetResourceExample {

	public static void main(String[] args) {
		Class clazz = Car.class;//방법1: Class 객체 정보를 얻음
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		//getResource()는 경로 정보가 담긴 URL 객체를 리턴함
		System.out.println(photo1Path);
		String photo1Path2 = clazz.getResource("images/photo1.jpg").getPath();
		System.out.println(photo1Path2);

	}

}
