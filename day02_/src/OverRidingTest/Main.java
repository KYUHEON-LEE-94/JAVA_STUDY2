package OverRidingTest;

public class Main {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child c = new Child();
		
		p.f1();
		c.f1();
	}
}
