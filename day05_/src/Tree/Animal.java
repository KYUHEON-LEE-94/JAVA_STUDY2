package Tree;

public abstract class Animal extends Creature {

	@Override
	public void talk() {
		System.out.println("말 못함");
		
	}
	

	public abstract void doSomething();
	
}
