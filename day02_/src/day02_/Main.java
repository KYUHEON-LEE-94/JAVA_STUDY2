package day02_;

public class Main {
	public static void main(String[] args) {
		
//		SuperCar suCar = new SuperCar("name", 100, null, false, 0)
//		
//		System.out.println(suCar.isOpen);
//		suCar.openRoof();
//		
//		System.out.println(suCar.name);
//		suCar.show();
		
		
		Car car = new Car("엄마",100,"blue");
		SuperCar suCar = new SuperCar("나",1000,"red", false, 300);
		
//		Car up = (Car)suCar;
		Car up = suCar;
		
//		System.out.println(up.speed);
//		System.out.println(up.isOpen);
//		up.openRoof();
		up.go(); //오버라이딩 된대로 실행
		up.show();
		
//		SuperCar down = (SuperCar)car;
		SuperCar down = (SuperCar)up;
		
		System.out.println(down.isOpen);
		System.out.println(down.speed);
		
		
	}
}
