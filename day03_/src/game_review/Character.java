package game_review;

public class Character {

		String name;
		int HP;
		int atCnt;
		
		
		public Character(String name, int HP, int atCnt) {
			this.name = name;
			this.HP = HP;
			this.atCnt = atCnt;
		}
		
		

		
		
		//캐릭터의 정보를 보여주는 메소드

		void show() {
			System.out.println(name+"의 현재 체력: " +HP);
			System.out.println("남은 공격 횟수: "+ atCnt);
			
		}
		
		
		//공격하기
		public void attack() {
			HP -= 10;
			atCnt -= 10;
			show();
		}
		
		//회복하기
		public void heal() {
			HP += 10;
			atCnt += 10;
			show();
		}
		
		//특수능력
		public void ability() {
			
			atCnt +=20;
			show();
			
		}
		
		
}
