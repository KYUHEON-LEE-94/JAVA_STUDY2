package GameTest;

public class Dealer extends Character {
	
	public Dealer() {
		super();
	}
	
	int HP = 200;
	int atCnt = 100;
	String name = "딜러";
	
	public void attack(Tanker someone) {

		someone.HP -= 50;
		this.atCnt -= 10;
		System.out.println(someone.name+"을 공격했습니다"+"공격횟수 10 감소");
		}
	
	public void attack(Healer someone) {
		someone.HP -= 50;
		this.atCnt -= 10;
		System.out.println(someone.name+"을 공격했습니다"+"공격횟수 10 감소");
		
		}
	
	public void attack(Dealer someone) {
		someone.HP -= 50;
		this.atCnt -= 10;
		System.out.println(someone.name+"을 공격했습니다"+"공격횟수 10 감소");
	
		}


	


	@Override
	public void skill() {
		System.out.println("딜러의 스킬 사용");
		for (int i = 0; i < 3; i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println("쿨타임..");
				
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
			
		}
		
		System.out.println("쿨타임 종료");
	}
	
	
	
	
	
}
