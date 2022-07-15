package game_review;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Character ch = null;
		
		int choice;
		
		while(true) {
			
			System.out.println("--캐릭터 선택");
			System.out.println("1.탱커");
			System.out.println("2.딜러");
			System.out.println("3.힐러");
		
			System.out.println("입력");
			choice = Integer.parseInt(sc.nextLine());
			
			System.out.println("캐릭터 이름 설정>>");
			String name = sc.nextLine();

			if(choice !=1 && choice !=2 && choice !=3) {
				continue;
			}
			
			
			if(choice == 1) {
				//업캐스팅
				ch = new Tanker(name, 500, 50);
				
			}else if(choice == 2) {
				
				ch = new Dealer(name, 200, 100);
				
			}else if(choice == 3) {
				
				ch = new Healer(name, 200, 30);
				
			}
			
			break;
			
		}//전체 while
		
		while(true) {
			System.out.println("1. 공격하기");
			System.out.println("2. 회복하기");
			System.out.println("3. 특수능력");
			System.out.println("4. 나가기");
			
			System.out.println("입력>>");
			choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 1) {
				
				ch.attack();
				
			}else if(choice == 2) {
				
				ch.heal();
				
			}else if(choice == 3) {
				
				ch.ability();
				
			}else if(choice == 4){
				System.out.println("게임 종료");
				
				if(ch instanceof Healer) {
					((Healer)ch).onlyHealer();
				}
				
				
				break;
				
			}else {
				System.out.println("다시 입력하시오");
			}
			
			
			
			
		}
				
	}
}
