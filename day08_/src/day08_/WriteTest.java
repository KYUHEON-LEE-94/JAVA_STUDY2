package day08_;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTest {
	public static void main(String[] args) {
		
//		1. 파일 객체 만들기
		
		File f = new File("..\\..\\memo\\test.txt");
//		File f = new File("C:\\Users\\Administrator\\eclipse-workspace\\test.txt");
//		File f = new File("..\\test.txt");
		//절대 경로: 처음부터 끝까지 파일의 경로를 알려주는 방식 ex)D:\\폴더명\\폴더명\\파일명.확장자
		//상대 경로: 상대적인 경로(현재 위치를 기준으로 한 상대 경로)
					//해당 프로젝트 폴더
		// ..: 상위 폴더 의미
		//해당파일이 없다면 파일을 생성
		
//		2.스트림 열기
		
		//FileWriter
		//IOException 을 처리해야만 사용할 수 있다(컴파일 에러)
		FileWriter fw = null;
				
//			2-1. 버퍼를 생성
		BufferedWriter bw = null;
		
		try {
			//스트림 생성자의 매개변수로는 사용할 파일 객체를 넘겨준다.
			fw = new FileWriter(f);
			
			//버퍼 생성자의 매개변수로는 만든 스트링을 넘겨준다.
			bw = new BufferedWriter(fw);
			
//		3.파일 입력/출력
			//Write(): 괄호안에 있는 문자열을 파일에 출력해주는 메서드
			bw.write("안녕하세요\n");
			bw.write("오늘은 금요일입니다");
			bw.write("상대 경로를 활용해 출력해봄");
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				//4-0.버퍼 닫기
				if(bw != null)bw.close();
				
				//4.스트림 닫기
				if(fw !=null)fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
//		
		
		
		
	}

}
