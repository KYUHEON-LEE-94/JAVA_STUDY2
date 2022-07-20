package exceptionTest;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] ar = {10,20,30};
		
		
		try {
			System.out.println("인덱스 입력>>");
			int idx = sc.nextInt();
			
			System.out.println("나눌 값");
			int num = sc.nextInt();
		System.out.println("결과: " +ar[idx]/num);
		
		}catch(Exception e) {
			//getMessage(): 오류 발생시 부연설명 부분을 return하는 메시지
			System.out.println(e.getMessage());
			//printStackTrace(): 발생한 예외의 정보를 출력하는 메서드
			e.printStackTrace();
			
		}
		
		
		
		
		System.out.println("프로그램이 정상 종료됨");
	}
	

}
