package day04;

import day04.Outer.InnerInstanceClass;

public class Main {
	public static void main(String[] args) {
		
		//InnerLocal il = new InnerLocal(); 불가능
		
		Outer o = new Outer();
		
		o.outerFuntcion();
		
		//o.outerFuntcion();
		
		//InnerStatic 객체화
		
		Outer.InnerStatic is = new Outer.InnerStatic();
		
		System.out.println(is.isv);
		
		//InnerInstance 객체화
		//내부클래스를 객체화하는 과정
		//인스턴스 클래스는 인스턴스 멤버이기떄문에 객체 내부에 있는 생성자를 사용해야한다.
		Outer.InnerInstanceClass fe = o.new InnerInstanceClass();
		fe.
		
		
		
		
		
	}
}
