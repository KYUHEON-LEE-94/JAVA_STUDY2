package student;

public class Main {
	public static void main(String[] args) {

		
		//hong이라는 객체 내부의
		//인스턴스 변수들의 값을 출력해서 확인
		//?
		

	
		
		//학생이 3명이 있다.
		//김철수 국어 점수: 100점, 영어: 70점, 수학:50;
		//박영희 국어 점수:100점, 영어: 100, 수학:100;
		//홍길동 국어: 50, 영어 70, 수학 60;
		
			//해당 값들을 각각 kim, park,  hong이라는 객체에 저장하고
			//해당 학생의 성적 정보(국어,영어,수학 점수, 평균 점수) 출력하는 메소드 만들기
		
//		Student kim = new Student("김철수",100,70,50);
//		Student park = new Student("박영희",100, 100,100);
//		Student hong = new Student("홍길동",50,70,60);
		
//		System.out.println("--"+kim.getName()+"성적 정보");
//		System.out.println("국어 점수: "+kim.getKor());
//		System.out.println("영어 점수: "+kim.getEng());
//		System.out.println("수학 점수: "+kim.getMath());
//		
//		System.out.println("평균 점수" + (kim.getKor()+kim.getEng()+kim.getMath()));
		
		
		Student[] students = {
				new Student("김철수", 100,70,50),
				new Student("박영희", 100, 100,100),
				new Student("홍길동", 50,70,60)
				};
		
		students[0].show();
		students[1].show();
		students[2].show();
		
		
		
	}
	
	
}
