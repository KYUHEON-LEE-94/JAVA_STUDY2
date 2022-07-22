package day08_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReaderTask {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		
		File f = new File("..\\day08_\\test2.txt");
		
		
		
		System.out.println("인덱스 번호 입력");
		int choice = sc.nextInt();
		
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String Line = br.readLine();
			for (int i = 1; i < choice; i++) {
						
				Line += br.readLine();
				
			}
			System.out.println(Line);
			
			
		} catch (Exception e) {
		
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
