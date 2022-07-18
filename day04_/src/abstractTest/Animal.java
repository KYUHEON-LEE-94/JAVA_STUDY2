package abstractTest;

public abstract class Animal {

	String name;
	static int num;
	static final int num2 = 0;
	
	public void eat() {
		System.out.println("부모에서 정의된 eat()");
	}
	
	public abstract void play();
	
	public void run() {}
	
//	
	
	
}
