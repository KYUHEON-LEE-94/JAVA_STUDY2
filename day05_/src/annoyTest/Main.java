package annoyTest;

public class Main {
	public static void main(String[] args) {
		
		Car c = new Car() {
			//클래스
			//Car 클래스를 상속받는 클래스 -> Car클래스가 아닌 그 뒤의 (익명){}의 클래스가 상속받아서 객체화됨
			//사실상 업캐스팅
			public void go() {
				System.out.println("override된 go");
			}

			@Override
			public void engineOn() {
				System.out.println("부르릉");
				
			}
			
			
				
//			public void openRoof() {
//				System.out.println("뚜겅 열어~");
//			}//upcasting 됬기 떄문에 자식에서 새롭게 정의한 메소드 사용 불가
			
		};
		
		c.go();
		
		Soldier s = new Soldier() {
			//추상클래스나 인터페이스가 1회적으로 사용될 때
			//익명 클래스가 사용된다.
			@Override
			public void work() {
				System.out.println("두두두ㅜ두두");
				
			}
			
			@Override
			public void eat() {
				System.out.println("전식 맛없음");
				
			}
		};
		
		s.eat();
		
	}
}
