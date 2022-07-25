package day09_;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;;


public class MapTest {
	public static void main(String[] args) {
		
		Map<String, Integer> scores = new HashMap<>();
		
		scores.put("국어", 80);
		scores.put("수학", 90);
		scores.put("영어", 70);
		scores.put("과학", 100);
		System.out.println(scores);
		
		
		scores.put("국어", 70);
		System.out.println(scores);
		//key는 중복이 안됨
		
		System.out.println(scores.get("국어"));
		scores.remove("국어");
		System.out.println(scores);
		
//		for (String string : scores) {
//			
//		}
		
		for (String key : scores.keySet()) {
			System.out.println(key+":"+scores.get(key));
		}
		
		//entrtySet() : 맵에서 entry 들이 요소로 들어있는 set를 return
		for(Entry<String, Integer>entry: scores.entrySet()) {
			System.out.println("--안녕--");
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
