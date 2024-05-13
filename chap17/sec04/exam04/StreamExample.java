package chap17.sec04.exam04;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) throws Exception {
		//java.nio.file.files의 lines() 메소드로 텍스트 파일의 행 단위 스트림을 얻을 수 있음
		//텍스트 파일에서 한 행씩 읽고 처리할 때 유용하게 사용함
		Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
		                                    //data.txt파일의 경로(Path) 객체 얻기
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		//Path 로부터 파일을 열고 한 행씩 읽으면서 문자열 스트림 생성
		//기본 UTF-8 문자셋으로 읽음
		stream.forEach(line -> System.out.println(line));
		stream.close();
	}
}
