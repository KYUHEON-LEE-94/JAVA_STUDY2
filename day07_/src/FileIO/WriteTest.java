package FileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTest {
	
	
	public static void main(String[] args) {
//	1.파일객체 만들기
		//File이라는 클래스
		
		
//		File f = new File(); File 클래스 내부에는 기본 생성자가 없음 - >에러
//		생성자의 매개변수로는 내가 사용할 파일의 경로와 확장자를 써준다.

//		절대 경로: 처음부터 끝까지 경로를 알려주는 방식		
//		상대 경로:
		
		File f = new File("C:\\Users\\Administrator\\eclipse-workspace\\test.txt");
		
		
//	2.스트림열기
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			 fw = new FileWriter(f);

//		2-1)버퍼를 생성(버퍼라는 공간에 담아뒀다가 필요한 애들만 받아오는 방식을 사용)
			

			bw = new BufferedWriter(fw);
			
//	3.파일 입력 / 출력
			
			bw.write("파일을 출력해봄");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			
try {
	//		4-0 버퍼 닫기
			if(bw != null) bw.close();
	//		4.스트림 닫기
			if(bw != null) 	fw.close();
} catch (IOException e) {
	
	e.printStackTrace();
}
		}
		
		
	}
	
	
	
}
