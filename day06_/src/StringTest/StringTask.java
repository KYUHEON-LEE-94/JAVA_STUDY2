package StringTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. 사용자에게 문자열을 입력받아서 대문자는 소문자로, 소문자는 대문자로, 나머지는 그대로 변경하여 출력하시오
		
//		System.out.println("문자열을 입력해주세요");
//		String sentence = sc.nextLine();
//		
//		String res = "";
//		for (int i = 0; i < sentence.length(); i++) {	
//			char ch = sentence.charAt(i);
//			if(ch >= 'a' && ch<='z') {
//				res +=(char)(ch-32);
//			}else if(ch >= 'A' && ch<='Z') {
//				res +=(char)(ch+32);
//			}else {res += ch;}
//			
//		}
//		
//		System.out.println(res);
		
		
		//2. 사용자에게 이름, 나이, 주소를 각각 따로 입력받아서
		//콤마(,)로 연결된 하나의 문자열로 출력하시오
		
//		System.out.println("이름을 입력해주세요");
//		String name = sc.nextLine();
//		System.out.println("나이 입력해주세요");
//		String age = sc.nextLine();
//		System.out.println("주소 입력해주세요");
//		String address = sc.nextLine();
//		
//		String[] array = {name, age, address};
//		
//		System.out.println(String.join(",", array));
		
		//3. 사용자에게 휴대폰 번호를 입력받아서 대쉬를 제거하여 출력하시오
		//010-0000-0000
		//->01000000000
		
//		System.out.println("-를 포함하여 번호를 입력해주세요");
//		String number = sc.nextLine();
//		
//		String[] temp = number.split("-");
//		for (int i = 0; i < temp.length; i++) {
//			System.out.print(temp[i]);
//			
//		}
		
		//--------------다른 방법-------------------//
		
		String numberRes = "";
//		for (int i = 0; i < number.length(); i++) {
//			if(number.charAt(i) !=  '-') {
//				numberRes += number.charAt(i);
//			}
//			
//		}
//		
//		numberRes += number.substring(0,3);
//		numberRes += number.substring(4,8);
//		numberRes += number.substring(9,13);
		
		//-------다른 방법---------------
		
//		numberRes = number.replaceAll("-", "");
//		System.out.println(numberRes);
//			
//		
//		//4.사용자에게 영화 순위, 제목, 이름을 콤마가 포함된 하나의 문자열로 입력받아서
//		//해당 순위를 1증가하여 출력하시오
//		
//		System.out.println("영화 순위, 제목, 이름 순서로 입력해주세요");
//		String movie = sc.nextLine();
//		
//		String[] what = movie.split(",");
//		
//		int rank = Integer.parseInt(what[0]);
//		
//		what[0] = rank+1+"";
//				
//		System.out.println(String.join(",", what));
//		
//		//---------다른 답-----------------
//		
//		String movieRes = Integer.parseInt(movie.substring(0, movie.indexOf(",")))+1 + movie.substring(movie.indexOf(","));
//		
		
		//5.사용자에게 한글로 숫자를 입력받아서
		//숫자로 변경하여 출력하시오
		//일공이사
		//1024
		
		System.out.println("숫자를 한글로 입력");
		String koNumber = sc.nextLine();
		
		String hangeul = "공일이삼사오육칠팔구";
		String changeNum= "";
		
		for (int i = 0; i < koNumber.length(); i++) {
			changeNum += hangeul.indexOf(koNumber.charAt(i));
			
		}
		System.out.println(changeNum);
		
	
		
	}
}
