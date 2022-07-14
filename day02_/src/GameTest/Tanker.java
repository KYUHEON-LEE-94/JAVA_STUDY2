package GameTest;

public class Tanker extends Character{
	
	
	
	public Tanker() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	int HP = 500;
	int atCnt = 50;
	String name = "탱커";
	
	public void attack(Tanker someone) {
		someone.HP -= 20;
		this.atCnt -= 10;
		System.out.println(someone.name+"을 공격했습니다"+"공격횟수 10 감소");
		}
	
	public void attack(Healer someone) {
		someone.HP -= 20;
		this.atCnt -= 10;
		System.out.println(someone.name+"을 공격했습니다"+"공격횟수 10 감소");
		}
	
	public void attack(Dealer someone) {
		someone.HP -= 20;
		this.atCnt -= 10;
		System.out.println(someone.name+"을 공격했습니다"+"공격횟수 10 감소");
		}


	@Override
	public void skill() {
		
		System.out.println("탱커의 스킬 사용");
		for (int i = 0; i < 10; i++) {
			
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
