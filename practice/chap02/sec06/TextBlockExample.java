package practice.chap02.sec06;

public class TextBlockExample {

	public static void main(String[] args) {
		String str1 = "" +
	"\n" +
				"\t\"id\":\"winter\",\n" +
	"\t\"name\":\"눈송이\"\n" +
				"";
		
		String str2 = """
				
				     "ID": "Fall in Love"
				 
				""";
		
		System.out.println(str1);
		System.out.println(str2);

	}

}
