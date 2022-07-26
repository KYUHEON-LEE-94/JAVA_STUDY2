package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DBConnection {
	//파일 입력 받아오는 메서드
		public static BufferedReader read() throws IOException {
			
			File f = new File("movie.txt");
			
			FileReader fr = new FileReader(f);
			
			BufferedReader br = new BufferedReader(fr);
			
			return br;
			
		}
		
		
		//파일 쓰는 메서드
		
		public static BufferedWriter write() throws IOException {
			
			File f = new File("movie.txt");
			
			FileWriter fr = new FileWriter(f);
			
			BufferedWriter bw = new BufferedWriter(fr);
			
			return bw;
		}
			
}
