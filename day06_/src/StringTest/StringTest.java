package StringTest;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "mango juice is delicious";
		
		System.out.println(str1.substring(6,8));
		System.out.println(str1.length());
		
		System.out.println(str1.charAt(1));
		System.out.println(str1.indexOf("ui"));
		
		String[] temp = str1.split(" ");
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);

			
		}
		//join(): 스태틱 메서드
		System.out.println(String.join(" ", temp));
		
	}
}
