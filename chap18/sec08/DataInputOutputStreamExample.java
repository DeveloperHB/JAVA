package chap18.sec08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception{
		//DataOutputStream 생성
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		//기본 타입 값을 출력하기 위해 DataOutputStream(보조 스트림) 연결
		
		//기본타입 (int, long, float, double, char, short, boolean, string)
		
		dos.writeUTF("홍길서");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("누가바");
		dos.writeDouble(90.5);
		dos.writeInt(2);
		
		dos.writeUTF("이자바");
		dos.writeDouble(99.6);
		dos.writeInt(3);
		
		dos.flush();
		dos.close();
		fos.close();
				
				//DataInputStream 생성
				FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
				DataInputStream dis = new DataInputStream(fis);
		
				for(int i=0; i<3; i++) {
					String name = dis.readUTF();
					double score = dis.readDouble();
					int order = dis.readInt();
					System.out.println(name + ": " + score+ ": "+ order);
				}
				
				dis.close(); fis.close();
				
		

	}

}
