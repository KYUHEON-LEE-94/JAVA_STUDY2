package finallyTest;

import java.util.Scanner;

public class FinallyTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			int[] arr = {10,20,30};
			
			System.out.println("인덱스 입력>>");
			int idx = sc.nextInt();
			
			System.out.println("나눌 값 입력>>");
			int num = sc.nextInt();
			
			System.out.println("결과는: " + arr[idx]/num);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 벗어남");
//			e.printStackTrace();
		}finally {
			System.out.println("얘외가 발생하든 안하든 실행되는 영역");
		}
		
		System.out.println("프로그램 종료됨");
		
	}
}
