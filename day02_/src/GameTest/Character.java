package GameTest;

public class Character {
	int HP, atCnt;
	String name = this.name;
	
	public Character(int HP, int atCnt) {
		this.HP = HP;
		this.atCnt = atCnt;
	
	}
	
	public Character() {}
	
	public void show() {
		System.out.println("HP: "+this.HP);
		System.out.println("공격횟수: "+this.atCnt);
	}
	
	public void attack(Tanker someone) {
		if(someone.HP <=0) {
			System.out.println(this.name+"은 죽었습니다.");
		}
		}

	
	
	public void heal() {
		this.HP += 10;
		this.atCnt += 10;
		System.out.println("HP가 10, 공격회수 10 회복했습니다.");
		
	}
	
	public void skill() {
		
		System.out.println("힐러 스킬 사용");
		for (int i = 0; i < 5; i++) {
			
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
	
	
	
	

