package throwsTest;

import java.util.InputMismatchException;

public class Method {

	public void f2() throws InterruptedException, ArrayIndexOutOfBoundsException, InputMismatchException {
		
		Thread.sleep(1000);
		
	}
	
	public void setNickName(String NikcName) throws BadWordException {
		
		if(NikcName.equals("바보")) {
			throw new BadWordException("바보로는 설정 불가");
		}
		
		
		System.out.println("당신의 닉네임은: "+NikcName+"으로 설정 되었습니다.");
	}
}
