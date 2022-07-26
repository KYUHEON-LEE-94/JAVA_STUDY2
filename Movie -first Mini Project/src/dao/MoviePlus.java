package dao;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import dto.Dto;

public class MoviePlus {
	
	private String title, date, mon, aud, thet, rank;

	public MoviePlus(String title, String date, String mon, String aud, String thet, String rank) {
		
		this.title = title;
		this.date = date;
		this.mon = mon;
		this.aud = aud;
		this.thet = thet;
		this.rank = rank;
	}
	
	
	
	public MoviePlus() {
	}



	//영화 추가 메서드
	public void Movieadd(int rank, String title, String date, String mon, String aud, String thet){
		
		
		
		
		//받은 rank를 인덱스 번호로 변수(헷갈려서 인덱스 변수이름으로 재정의)
		int idx = rank;
		
		String Line = rank +"\t"+title+"\t"+date+"\t"+mon+"\t"+aud+"\t"+thet;
		
		File f = new File("C:\\Users\\LEE KYUHEON\\eclipse-workspace\\Movie\\src\\movie.txt");
		File f2 = new File("C:\\Users\\LEE KYUHEON\\eclipse-workspace\\Movie\\src\\movie2.txt");
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		FileReader fr = null;
		BufferedReader br = null;
		
		ArrayList<String> list = new ArrayList<>();

		
		try {
			fw = new FileWriter(f2);
			bw = new BufferedWriter(fw);
			
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String line = "";
			
			while((line = br.readLine()) != null) {
				
				
				//읽어오는 열을 각각 랭크,제목 순서로 분리
				String[] movieDB = line.split("\t");
				
				//만약 rank를 index화한 int값이 movie[0](랭크값)과 일치한다면 입력받은 영화정보값을 입력한다.
				if(Integer.parseInt(movieDB[0]) == idx) {				
					
					bw.write(Line+"\n");
					
				}
				
				//단,  movie[0](랭크값)이 idx와 일치하지 않을 경우만 읽어드린 파일에서 덧붙여쓴다.
				//*일치한 값을 쓸경우 위의 if문과 중복된 rank값이 작성되기때문에
				if(Integer.parseInt(movieDB[0]) != idx) {	
				
				bw.write(line+"\n");
				
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

