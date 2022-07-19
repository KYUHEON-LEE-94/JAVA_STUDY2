package objectClass;

public class Main {
	public static void main(String[] args) {
		
		Car c1 = new Car(1234);
		Car c2 = new Car(1234);
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		
		Integer i1 = new Integer(10);
//		System.out.println(c1.hashCode());
//		System.out.println(c1);
		System.out.println(c2.hashCode() == c1.hashCode());
		
		System.out.println(c1.toString());
		Integer i3 = 10;
		System.out.println(c1);
		
		System.out.println(i3);
		System.out.println(i3.toString());
		
		
		//equals메소드
		//Integer 클래스에 있는 equals 메소드를 참고하여
		//Caㄱ 클래스에서 CarNum을 비교하는  메소드 오버라이딩 하기
		
	}
}
