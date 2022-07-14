package OverRidingTest;

public class SleepTest {
	public static void main(String[] args) {
		
		System.out.println("스킬 사용");
		for (int i = 0; i < 5; i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println("쿨타임..");
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
			
		}
		
		
		System.out.println("쿨타임 종료");
		
		
		
		
	}
	
	

}
