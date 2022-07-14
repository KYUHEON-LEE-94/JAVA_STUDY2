package GameTest;

public class Game {
	public static void main(String[] args) {
		Tanker Tank = new Tanker();
		Dealer Deal = new Dealer();
		Healer Heal = new Healer();
		
		System.out.println(Tank.name);
		
		
		Deal.attack(Heal);
		System.out.println(Heal.HP);
		Heal.show();
		
		
		
	}
}
