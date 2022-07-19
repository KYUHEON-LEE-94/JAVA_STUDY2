package wrapperTest;

public class BoxingUnBoxing {
	public static void main(String[] args) {
		
		int il = 10;
		//Boxing -> 기본 자료형이 래퍼클래스로 들어감
		Integer wi = new Integer(il);
		
		//UnBoxing
		int i2 = wi;
		
		//auto UnBoxing
		System.out.println(wi + 10);
		System.out.println(wi.intValue()+10);
		
		//auto boxing
		Integer w12 = 10;
		
		Object[] ar = {10, 10.5, "안녕"};
	}
}
