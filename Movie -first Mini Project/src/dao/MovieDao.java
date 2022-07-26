package dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import dto.Dto;

public class MovieDao {

	//모든 영화 정보를 갖다 주는 메서드
	//selectAll
	
	public ArrayList<Dto> selectAll() throws IOException{
		
		//파일입력 받아오기
		BufferedReader br = DBConnection.read();
		
		ArrayList<Dto> list = new ArrayList<>();
		
		Dto dto = new Dto();
		
		//읽어오기
		
		for(String line = br.readLine(); line !=null; line=br.readLine()) {
			//line에는 영화 한편에 대한 6개의 값들이 한줄로 들어있다.
			String[] temp = line.split("\t");
			dto.setRank(Integer.parseInt(temp[0]));
			dto.setTitle(temp[1]);
			
			//........
			
			list.add(dto);
		}
		
		br.close();
		
		return list;
		
		
	}
	
	
	
}
