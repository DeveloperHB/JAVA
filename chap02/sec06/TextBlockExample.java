package chap02.sec06;

public class TextBlockExample {

	public static void main(String[] args) {
		String str1 = "" +
	                  "{\n" + 
				      "\t\"id\":\"winter\",\n" +
	                  "\t\"name\":\"눈송이\"\n" +
				      "}";
		String str2 = """
				{
				"id" : "winter",
				"name" : "눈송이"
				}
				""";
		System.out.println(str1);
		System.out.println("------------------------");
		System.out.println(str2);
		System.out.println("------------------------");
		String str3 = """
				교수님은 자바를 \
				가르칩니다.
				교수님은 자바 고수 입니다.
				""";
		System.out.println(str3);
		String str4 = """
				"자바"는 꽤 어렵습니다.\t 그러나 충분히 시도할 만합니다.\n굉장히 졸립습니다.
			
				""";
		System.out.println(str4);
		
		String str5 = """
				{
				 \t"id":"winter",
				\t"name":"눈송이"
				}
				""";
		System.out.println(str5);
		
	}
	
				
				
				
	}


