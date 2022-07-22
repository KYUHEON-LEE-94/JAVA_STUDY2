package day08_;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTask {
	public static void main(String[] args) {
		
		//해당 프로젝트 폴더 내에 task.txt 파일을 만들어서
		//해당 파일에
		//1번째 줄입니다.
		//2번재 줄입니다.
		//..
		//9번째 줄입니다.
		//출력하기
		
		File f = new File("..\\day08_\\test2.txt");



		FileWriter fw = null;
				
		BufferedWriter bw = null;
		
		try {
			//생성자에 boolean 타입의 자료를 매개변수로 전달할 수 있도록 오버로딩이 되어있다.
			//true: 덧붙이기 모드(기존 내용은 유지, 유지 뒤에 덧붙임)
			//false: (기본값) 기존 내용 전체 덮어쓰기
			fw = new FileWriter(f);
			
			//버퍼 생성
			bw = new BufferedWriter(fw);
			
			//	3.파일 입력/출력
			for (int i = 1; i <= 10; i++) {
				bw.write(i+"번째 줄입니다.\n");
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				//버퍼 닫기
				if(bw != null)bw.close();
				 
				//스트림 닫기
				if(fw !=null)fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
	

}
