package day02_;

public class SuperCar extends Car{
	
	
	//SuperCar 클래스의 모든 멤버 변수를 초기화 해주는 초기화 생성자를 정의
	public SuperCar(String name, int Price, String color, boolean isOpen,int speed ) {
		super(name, Price, color);
		this.isOpen = isOpen;
		this.speed = speed;
		
	}


	boolean isOpen;
	int speed;
	
	public void openRoof() {
		System.out.println("뚜껑이 열립니다.");
	}

	@Override
	public void show() {
		super.show();
		System.out.println("지붕상태"+isOpen);
	}

	@Override
	public void go() {
		System.out.println("부아아아아아아아아아앙");
	}

	@Override
	public void engineOn() {
		System.out.println("열쇠 안씀");
	}
	
	
	
	

}
