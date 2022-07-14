package inheritanceTest;

public class Main {
	public static void main(String[] args) {
	
		Car momCar = new Car("아","어",100);
		
		momCar.name ="엄마";
		momCar.color = "파랑";
		momCar.price = 100;
		
		momCar.go();
		momCar.engineOn();
		momCar.show();
		
		SuperCar myCar = new SuperCar();
		myCar.color = "red";
		myCar.name = "나";
		myCar.price = 1000;
		
		myCar.go();
		myCar.engineOn();
		myCar.show();
		
	
		
	}
	
}
