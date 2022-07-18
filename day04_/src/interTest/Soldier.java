package interTest;

public interface Soldier {

		
		//인터페이스에서는 static final 변수만 넣을 수 있다. // 그냥 int로 해도 JVM으로 자동 컴파일링된다.
		int num = 10;
		
		public void method();
		
		public void eat();
		
		
}
