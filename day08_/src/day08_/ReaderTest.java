package day08_;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
	public static void main(String[] args) {
		
		
		File f = new File("..\\day08_\\test2.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
	
			String line;
			
			line = br.readLine();
			line += br.readLine();
			
			System.out.println(line);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			
			try {
				if(fr !=null)fr.close();
				
				if(br != null)br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
}
