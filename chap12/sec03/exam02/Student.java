package chap12.sec03.exam02;

public class Student {
	private int no;
	private String name;
	
	 public Student(int no, String name) {
		 this.no = no;
		 this.name = name;
		 
	 }
	 
	 public int getNo() {return no; }
	 public String getName() {return name;}
	 
	 @Override
	 public int hashCode() {
		 int hashCode = no + name.hashCode();
		 return hashCode;
	 }
	 
	 @Override
	 public boolean equals(Object obj) {
		 if(obj instanceof Student target) {
			 if(no == target.getNo() && name.equals(target.getName())) {
				 return true;
			 }
		 }
		 return false;
	 }
	 /*Object의 equals 메소드를 재정의해서 Student 객체인지 확인하고,
	  * 학생번호와 이름이 같으면 true를 리턴함
	  */

}
