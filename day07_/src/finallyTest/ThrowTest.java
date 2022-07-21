package finallyTest;

import java.util.Scanner;

public class ThrowTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		
		try {
			int num = sc.nextInt();
			
			if(num == 1) {
			throw new ArrayIndexOutOfBoundsException("사용자가 1을 입력함");
			//예외 클래스의 생성자에는 문자열 값의 매개변수를 넘겨줄 수 있다.
			//해당 문자열 값이 부연설명으로 들어가도록 설계되어있다.
			}
			
		} catch (Exception e) {
			System.out.println("오류 발생함");
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료됨");
		
	}
}
