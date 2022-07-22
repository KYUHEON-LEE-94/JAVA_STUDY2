package day08_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
			//사용자에게  인덱스 번호와 문자열을 입력 받아서
			//task.txt 파일에서 해당 인덱스 번호 다음줄에 해당 문자열을 삽입하여 출력하고 저장하기
			//ex) 5 안녕하세요
			//6번째줄에 안녕하세요가 삽입된 후 메모장에 저장되면 된다.
		
	Scanner sc  = new Scanner(System.in);
	
	System.out.println("인덱스 번호 입력");
	int idx = sc.nextInt();
	System.out.println("문자열 입력");
	sc.nextLine();
	String str = sc.nextLine();
		
		
		File f = new File("..\\day08_\\test3.txt");
		
		
	
		
		FileWriter fw = null;
		BufferedWriter bw = null;

		
		try {
			fw = new FileWriter(f,true);
			bw = new BufferedWriter(fw);
			
			//idx가 1이라면 idx2에 아래의 문구를 넣어야한다.
			//idx = i일때?
			for (int i = 1; i < 10; i++) {
				bw.write(i+"번재입니다.");
				if(i == idx) {	
					bw.write(str+"\n");
				}
				
			}	
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				if(bw != null) bw.close();
				if(fw != null) fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
