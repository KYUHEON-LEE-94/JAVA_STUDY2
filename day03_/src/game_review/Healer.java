package game_review;

public class Healer extends Character{

	public Healer(String name, int HP, int atCnt) {
		super(name, HP, atCnt);
		
		
	}
	


	@Override
	void show() {
		
		super.show();
	}



	@Override
	public void attack() {
		System.out.println(this.name+"공격!!");
		super.attack();
	}

	@Override
	public void heal() {
		
		HP  +=40;
		super.heal();
	}

	@Override
	public void ability() {
		
		System.out.println(this.name+"특수능력");
		for (int i = 0; i < 5; i++) {
			
			try {
				Thread.sleep(10000);
				System.out.println("힐~힐~");
				
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		

	}
		
		
		super.ability();
	}
	
	public void onlyHealer() {
		System.out.println("힐러는 죽지 않아요");
	}
	
	
}
