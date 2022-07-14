package inheritanceTest;

public class Car {
	String name, color;
	int price;
	
	
	
	public Car(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public Car() {}
	

	public void go() {
		System.out.println("앞으로 갑니다.");
	}
	
	public void engineOn() {
		System.out.println("시동을 겁니다.");
	}
	
	public void show() {
		System.out.println("--차량정보-");
		System.out.println("차주: " + name);
		System.out.println("가격: " + price);
		System.out.println("색상: " + color);
	}
}
