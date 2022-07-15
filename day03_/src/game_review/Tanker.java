package game_review;

public class Tanker extends Character {

	public Tanker(String name, int HP, int atCnt) {
		super(name, HP, atCnt);
		
		
	}
	


	@Override
	void show() {
		
		super.show();
	}



	@Override
	public void attack() {
		System.out.println(this.name+"공격!!");
		this.HP -= 10;
		super.attack();
	}

	@Override
	public void heal() {
		
		
		super.heal();
	}

	@Override
	public void ability() {
		
		System.out.println(this.name+"특수능력");
		for (int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(10000);
				System.out.println("폭탄받아라~");
				
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
			
	}
		
		
		super.ability();
	}
	
	
	
}
