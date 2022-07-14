package OverRidingTest;

public class Child extends Parent {

	@Override
	void f1() {
		super.f1();
		System.out.println("추가했어요");
	}

	
	void f2() {
		super.f2();
	}

		
}
