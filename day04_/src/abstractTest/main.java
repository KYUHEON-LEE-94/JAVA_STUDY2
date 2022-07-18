package abstractTest;

public class main {
	public static void main(String[] args) {
		
		Animal anim = null; //추상메서드 타입에 null을 담아주는건 가능
//		Animal ani = new Animal(); 추상 클래스는 객체화가 불가능하다.
		
		
		System.out.println(Animal.num); //static 멤버에 접근 가능
		
		AbstractTest abst = new AbstractTest();

		System.out.println(abst.name);
		System.out.println(abst.num);
		System.out.println(abst.num2);
		abst.eat();
		abst.play();
		
		Animal up = abst; //자식의 오버라이딩된 메서드 그대로 사용가능해서, 추상클래스인 부모 클래스로 업캐스팅 가능
		
		
		

		
		
	}
		
	
}
