package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test1 {
	
	public static void reset() {
		
		File f = new File("\\test1.txt");
		
		//읽어오기
		FileReader fr = null;
		BufferedReader br = null;
		
	
		
		//쓰기
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		ArrayList<String> list = new ArrayList<>();
		
		
		//초기화 단계 1. 원본 파일 읽어오기
		try {
			
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			
			String line = "";
			//읽기로 f파일을 한줄씩 읽어오면 아래에서 list 컬렉션에 한줄씩 넣어서 전 정보를 저장한다.
			while((line = br.readLine()) != null) {
				
				System.out.println(line);
				
				list.add(line);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//초기화 단계2. 원본파일을 다른 파일에 쓰기
		File f1 = new File("\\test2.txt");
		//시험을 위해서 다른 파일에 작성함
		
		try {
			fw = new FileWriter(f1);
			bw = new BufferedWriter(fw);
			
			//한줄씩 읽어온 파일을 다른 파일에 작성하며 인덱스 구분을 위하여 \n사용
			for (int i = 0; i < list.size(); i++) {
				bw.write(list.get(i)+"\n");
				
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				if(bw != null) bw.close();
				if(fw != null) fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}