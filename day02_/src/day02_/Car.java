package day02_;

public class Car {
	
	public Car(String name, int Price, String color) {
		this.name =name;
		this.price = Price;
		this.color = color;
		
	}
	
	public Car() {
		System.out.println("Car클래스 생성됨");
	}
	
	
	
	String name;
	int price;
	String color;
	
	public  void go() {
		System.out.println("앞으로 갑니다. 부르릉");
	}
	
	public void engineOn() {
		System.out.println("열쇠로 시동을 켭니다.");
	}
	
	public void show() {
		System.out.println("--차량정보--");
		System.out.println("차주 이름: "+name);
		System.out.println("차량 가격: "+price);
		System.out.println("차량 색상: "+color);
		
	}

}
