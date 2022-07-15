package game_review;

public class Dealer extends Character {

	
	public Dealer(String name, int HP, int atCnt) {
		super(name, HP, atCnt);
		
	}

	@Override
	void show() {

		super.show();
	}

	@Override
	public void attack() {
		
		HP -= 40;
		super.attack();
	}

	@Override
	public void heal() {
		
		super.heal();
	}

	@Override
	public void ability() {
		
		System.out.println(this.name+"특수능력");
		for (int i = 0; i < 3; i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println("목표를 포착했다!");
				
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
			
	}
		
		super.ability();
	}
	
	
	
	

}
