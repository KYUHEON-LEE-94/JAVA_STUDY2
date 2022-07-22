package day08_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReaderTask2 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		//사용자에게  인덱스 번호와 문자열을 입력 받아서
		//task.txt 파일에서 해당 인덱스 번호 다음줄에 해당 문자열을 삽입하여 출력하고 저장하기
		//ex) 5 안녕하세요
		//6번째줄에 안녕하세요가 삽입된 후 메모장에 저장되면 된다.

		
		File f = new File("..\\day08_\\test2.txt");
		
		
		
		
	
		
		//------파일 읽기---------
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
//			String line = "";
//			
//			while((line = br.readLine()) != null) {
//				
//				System.out.println(line);
//				
//			}
			
			for (String line = br.readLine(); line !=null; line=br.readLine()) {
				System.out.println(line);
				
			}
				
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null)fr.close();
				if(br !=null)br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}//main
	
}
