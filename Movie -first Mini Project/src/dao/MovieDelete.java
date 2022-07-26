package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MovieDelete {

	
	
	
	public void  DeleteTitle(String title) {
		
		String title1 = title;
		
		File f = new File("C:\\Users\\LEE KYUHEON\\eclipse-workspace\\Movie\\src\\movie.txt");
		File f2 = new File("C:\\Users\\LEE KYUHEON\\eclipse-workspace\\Movie\\src\\movie2.txt");
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		FileReader fr = null;
		BufferedReader br = null;
		

		
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			fw = new FileWriter(f2);
			bw = new BufferedWriter(fw);
					
			String line = "";		
			
			while((line = br.readLine()) != null) {
				
				
				//읽어오는 열을 각각 랭크,제목 순서로 분리
				String[] movieDB = line.split("\t");
				
				
				//영화 제목기준으로 검색해서, 일치한다면 브레이크
				 if(movieDB[1].equals(title1)) {

					continue;
				}
				 if(Integer.parseInt(movieDB[0]) == 1) {
					 if(movieDB[1].equals(title1)) {
						 bw.write(line);
					 }
					 
					 if(movieDB[1].equals(title1) == false) {
						 bw.write(line+"\n");

					 }
				 }
				 if(Integer.parseInt(movieDB[0])>1) {
					 bw.write((Integer.parseInt(movieDB[0])-1)+"\t"+movieDB[1]+"\t"+movieDB[2]+"\t"+movieDB[3]+"\t"+movieDB[4]+"\t"+movieDB[5]+"\t"+"\n");
					 
				 }
			
			
	
			
			
			
			
			
			
			
		}
		}catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
				
				if(bw != null) bw.close();
				if(fw != null) fw.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
		
	}
	
	
}
