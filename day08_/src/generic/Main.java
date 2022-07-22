package generic;

public class Main {
	public static void main(String[] args) {
		
		Method<Integer,String> m = new Method(2,"안녕");
		
		System.out.println(m.a);
		System.out.println(m.b);
		
		
	}
}
