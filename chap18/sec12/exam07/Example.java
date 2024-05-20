package chap18.sec12.exam07;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {

	public static void main(String[] args) throws Exception {
		String filePath = "C:/Thisisjava/workspace/thisisjava/src/chap02/exam01/VariableExample.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData;
		while(true) {
			
			rowData = br.readLine();
			if(rowData == null) {
				break;
			}
			
			System.out.println(++rowNumber + ": " + rowData);
		}
		
		br.close(); fr.close();

	}

}
