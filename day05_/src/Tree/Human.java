package Tree;

public abstract class Human extends Creature {

	@Override
	public void talk() {
		System.out.println("나는 말을 할 수 있습니다.");
		
	}

	public abstract void job();

	
	public abstract void doSomething();
	
}
