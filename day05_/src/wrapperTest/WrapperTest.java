package wrapperTest;

public class WrapperTest {
	public static void main(String[] args) {
		
		int li = 10;
		Integer i2 = new Integer(10);
		
		//"안녕",10,, 2.5, true
		//값들을 담아놓은 배열만들기
		
		
		
		ArrTest[] ar = new ArrTest[];
		
	
		
		Object[] arr1 = {"안녕",10,2.5,true};
		
		for (Object object : arr1) {
			System.out.println(object);
		}
		
		
		String i3 = "a";
		String i4 = new String("a");
		
		System.out.println(i3 == i4);
		
		

		
		
	}
}
