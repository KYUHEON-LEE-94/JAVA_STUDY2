package loginTest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//로그인 회원가입 기능 구현하기
		//프로그램은
		//1.회원가입
		//2.로그인
		//3.나가기
		
		//1.을 누르면 이름, id, pw를 입력받고
		//(한번에 모든 유저의 정보를 입력 받는 것이 아니라 한번에 한 유저의 정보만 입력 받도록),
		//최대 길이 4명
		
		//2.를 누르면 아이디와 패스워드를 입력하여 확인한 후 로그인
		//000님 환영합니다.
		
		//3.나가기
		
		User[] Users = new User[4];
		User ur = new User();
		
		
		while(true) {
			System.out.println("원하는 절차 입력");
			int choice = sc.nextInt();
			
			if(choice==1) {
				
				sc.nextLine();
				System.out.println("회원 가입을 시작합니다.");
				
				System.out.println("이름");
				ur.setName(sc.nextLine());
				
				System.out.println("사용할 아이디");
				ur.setId(sc.nextLine());
				
				System.out.println("사용할 비밀번호");
				ur.setPw(sc.nextLine());
				
				for(int i =0; i<Users.length; i++) {
					if(Users[i] == null) {
						Users[i]  = ur;
						break;
					}
					
				}
				
			}else if(choice ==2) {
				sc.nextLine();
				System.out.println("아이디  입력");
				String check_id = sc.nextLine();
				System.out.println("비밀번호 입력");
				String check_pw = sc.nextLine();
				
				boolean check = true;
				
				

				for(User i : Users){
					
				
					if(i == null) {
						break;
					}
					
					if(check_id.equals(i.getId())&& check_pw.equals(i.getPw())) {
						System.out.println("로그인 성공!");
						System.out.println(i.getName()+"님 환영합니다.");
						check = false;
					}
					
					if(check) {
						System.out.println("아이디 또는 비밀번호를 학인하세요");
					}
					
				}
			
				
				
				
				
				
				
				
				
				
				
				
//			for (int j = 0; j < Users.length; j++) {
//				
//				if(Users[j] == null) {
//					break;
//				}
//				
//				if(check_id.equals(Users[j].getId())&& check_pw.equals(Users[j].getPw())) {
//					System.out.println("로그인 성공!");
//					System.out.println(Users[j].getName()+"님 환영합니다.");
//					check = false;
//				}
//				
//				if(check) {
//					System.out.println("아이디 또는 비밀번호를 학인하세요");
//				}
//				
//				
//			}
				
			
			}else if(choice ==3) {
				System.out.println("프로그램 종료");
				break;
				
			}else {
				System.out.println("1~3사이의 숫자를 다시 눌러주세요");
				continue;
			}
		}
		
	}
}
