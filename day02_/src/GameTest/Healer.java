package GameTest;

public class Healer extends Character{

	
	public Healer() {	}
	
	int HP = 200;
	int atCnt = 30;
	String name = "힐러";
	
	public void attack(Tanker someone) {
		someone.HP -= 10;
		this.atCnt -= 10;
		System.out.println(someone.name+"을 공격했습니다"+"공격횟수 10 감소");
		}
	
	public void attack(Healer someone) {
		someone.HP -= 10;
		this.atCnt -= 10;
		System.out.println(someone.name+"을 공격했습니다"+"공격횟수 10 감소");
		}
	
	public void attack(Dealer someone) {
		someone.HP -= 10;
		this.atCnt -= 10;
		System.out.println(someone.name+"을 공격했습니다"+"공격횟수 10 감소");
		}
	

	@Override
	public void heal() {
		
		super.heal();
		this.HP = HP+50;
		System.out.println("HP가 50, 공격회수 10 회복했습니다.");
	}

	

}
