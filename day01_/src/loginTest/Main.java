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
		User u = new User();
		
		while(true) {
			System.out.println("원하는 절차 입력");
			int choice = sc.nextInt();
			
			if(choice==1) {
				
				sc.nextLine();
				System.out.println("회원 가입을 시작합니다.");
				
				System.out.println("이름");
				u.setName(sc.nextLine());
				
				System.out.println("사용할 아이디");
				u.setId(sc.nextLine());
				
				System.out.println("사용할 비밀번호");
				u.setPw(sc.nextLine());
				
				
				
				for(int i =0; i<Users.length; i++) {
					if(Users[i] == null) {
						Users[i]  = u;
						break;
					}
					
				}
				
			}else if(choice ==2) {
				sc.nextLine();
				System.out.println("아이디  입력");
				String check_id = sc.nextLine();
				System.out.println("비밀번호 입력");
				String check_pw = sc.nextLine();
				
				
				int i = 0;
				
				while(i<Users.length) {
					if(Users[i].getId().equals(check_id)) {
						if(Users[i].getPw().equals(check_pw)) {
							System.out.println("로그인 성공");
							break;
						}
						
					}else if (!(Users[i].getId().equals(check_id))) {
						if(!(Users[i].getPw().equals(check_pw)))
						i++;
					}
				}
		
		
				
				
//					if(u.getId().equals(check_id)  && u.getPw().equals(check_pw)) {
//						System.out.println("로그인 완료" + u.getName()+"님 환영합니다.");
//					}else if(!(u.getId().equals(check_id)  && u.getPw().equals(check_pw)))	{
//						System.out.println("로그인 실패");}
					
				
			
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
