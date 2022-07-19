package objectClass;

public class Car{

	int carNum;

	public Car(int carNum) {
		super(); //object클래스의 생성자
		this.carNum = carNum;
	}
	
	public boolean equals(Object obj){
		if (obj instanceof Car) {
			return this.carNum == ((Car)obj).carNum;
		}
		return false;
	}

	@Override
	public int hashCode() {
		
		return this.carNum;
	}

	@Override
	public String toString() {

		return "자동차 번호: " + carNum;
	}


	
	
	
	
	
}
