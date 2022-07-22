package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		//리스트: 크기가 가변적으로 변하는 배열
		
		ArrayList<String> names = new ArrayList<>();
		
		System.out.println(names);
		
		//add(요소)
		
		names.add("김철수");
		names.add("이철수");
		names.add("나구리");
		names.add("너구리?");
		names.add("신라면");
		names.add("신");
		names.add("제우스");
		names.add("번개");
		
		System.out.println(names);
		
		names.remove(1);
		names.remove("제우스");
		names.add(2,"짜파게티");
		
		System.out.println(names);
		
		System.out.println(names.get(3));
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i)+"이게 바로");
			
		}
		
		for (String string : names) {
			System.out.println(string);
			
		}
		
		
		
		Car c1 = new Car("김영희",100);
		Car c2 = new Car("김철수", 200);
		Car c3 = new Car("김철수", 400);
		
		ArrayList<Car> info = new ArrayList<>();
		
		info.add(c1);
		info.add(c2);
		info.add(c3);
		System.out.println(info.get(0).name);
		
		for (Car car : info) {
			System.out.println(car.price);
		}
		
		List<String> list1 = new LinkedList<>();
		List<String> list2 = new ArrayList<>();		
		
	}
}
