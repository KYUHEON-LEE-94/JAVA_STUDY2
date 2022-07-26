package view;

import java.util.Scanner;

import dao.MovieDelete;
import dao.MoviePlus;
import dao.Reset;
import dao.Reset2;
import dao.Search;
import dto.Dto;

public class View {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/**
		 * 아래 2개의 기능은 승권님이 한것.
		 * 프로젝트여서 받았는데.. 에러 뜨고.. 어떻게 수정해야할지..
		 * 
		 */
		dao.Search s = new dao.Search();
		dao.Edit e = new dao.Edit(); 
		//================
		
		Dto dto = new Dto();
		 
		  while(true) {
			  System.out.println("원하시는 목록을 선택해주세요");
			  System.out.println("1.영화추가하기\r\n"
			  		+ "	2.영화 정보 수정하기\r\n"
			  		+ "	3.영화 검색하기\r\n"
			  		+ "	4.영화 삭제하기\r\n"
			  		+ "	5.모든 영화목록 보기\r\n"
			  		+ "	6.종료하기");
			  
	          int choice = sc.nextInt();
	          sc.nextLine();
	          
	          if(choice == 1) {
	        	System.out.println("영화 정보를 입력해주세요 순위, 영화제목,날짜 흥행수입, 관객수, 극장수");
	        	System.out.println("순위");
	        	int rank = sc.nextInt();
	        	
	        	
	        	System.out.println("제목");
	        	String title = sc.nextLine();
	        	
	        	System.out.println("날짜");
	        	String date = sc.nextLine();
	        	
	        	System.out.println("흥행수입");
	        	String mon = sc.nextLine();
	        	
	        	System.out.println("관객수");
	        	String aud = sc.nextLine();
	        	
	        	System.out.println("관객수");
	        	String thet = sc.nextLine();
	        	
	        	MoviePlus mvp = new MoviePlus();
	        	mvp.Movieadd(rank, title, date, mon, aud, thet);

	        	 
	          }if(choice == 2) {
	        	  s.main();
	        	  
	          }if(choice == 3) {
	        	  s.main();
	        	  
	          }if(choice == 4) {
	        	  System.out.println("삭제하기 원하는 영화 제목을 입력해주세요");
	        	  
	        	  String select = sc.nextLine();
	        	  
	        	  MovieDelete mvd = new MovieDelete();
	        	  
	        	  mvd.DeleteTitle(select);
	        	  
	        	  
	          }if(choice == 5) {
	        	  
	          }if(choice == 6) {
	        	  System.out.println("시스템을 종료합니다.");
	        	  break;
	          }
	          
	          
	          
	          
	          
			  
			  
	         }//while
		
		
	}

}



