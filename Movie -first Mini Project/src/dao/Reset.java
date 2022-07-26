package dao;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Reset {
	
	
	public static void resetRead() {
		
		File f = new File("C:\\Users\\LEE KYUHEON\\eclipse-workspace\\Movie\\src\\movie.txt");
		
		//읽어오기
		FileReader fr = null;
		BufferedReader br = null;
		
	
		
		
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
		
	}
	
	
		
		
		public static void resetWrite() {
			
		File f = new File("C:\\Users\\LEE KYUHEON\\eclipse-workspace\\Movie\\src\\movie.txt");
		
		ArrayList<String> list = new ArrayList<>();
		
		//쓰기
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(f);
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

