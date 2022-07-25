package day09_;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		
		HashSet<String> fruits = new HashSet<>();
		
		fruits.add("바나나");
		fruits.add("사과");
		fruits.add("포도");
		fruits.add("파인애플");
		fruits.add("바나나");
		fruits.add("바나나");
		
		System.out.println(fruits);
		//중복된 값은 하나만 들어갔으며, 넣어준 순서와는 상관없이 들어가있음. -> 순서가 없다는 것 
		//-> 인데스 번호를 사용할 수 없다.
//		fruits.get();
		
		fruits.remove("파인애플");
		System.out.println(fruits);
		
		fruits.remove("무화과"); //없는 요소를 삭제한다고 해도 아무일도 일어나지 않음
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("-----");
		Iterator<String> it = fruits.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
