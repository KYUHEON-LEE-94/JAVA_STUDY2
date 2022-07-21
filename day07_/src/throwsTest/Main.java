package throwsTest;

import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		//main 메서드도 예외를 떠넘길 수 있지만
		//절대로 바람직하지 않다.
		//main 메서드는 컴퓨터가 사용하는데
		//컴퓨터가 스스로 예외처리를 할 수 없기 때문에
		//main 메서드에서 예외를 넘기면 바람직하지 않다.
		
		
		Method ff = new Method();
		
//		try {
//			ff.f2();
//			System.out.println("....");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			
//			e.printStackTrace();
//		} catch (InputMismatchException e) {
//			
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		
		try {
			ff.setNickName("바보");
		} catch (BadWordException e) {
			
			e.printStackTrace();
		}

	}

}
