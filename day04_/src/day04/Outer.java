package day04;

public class Outer {
	int ov = 10;
	
	//내부 인스턴스 클래스
	class InnerInstanceClass{
		
		int iiv = 20;
		
		public void innerInstanceFunction() {
			System.out.println("인스턴스 클래스 메소드 호출됨");
		}
		
	}
	
	static class InnerStatic{
		int isv = 30;
		static int issv = 40;
			
		public void InnerStaticFunction() {
			System.out.println("스태틱 클래스 메소드 호출됨");
		}
	}//static
	
	
	//outer클래스 메소드

	public void outerFuntcion(){
		
		System.out.println(InnerStatic.issv);
		// System.out.println(InnerStatic.isv); 불가능
		
		class InnerLocal{
			int ilv = 50;
			public void InnerLoclaFuntion() {
				System.out.println("지역클래스 메소드 호출됨");
			}
			
			
			
			
		}//InnerLocal
		
		
		InnerLocal li = new InnerLocal();
		
		
		
	}//outerFunction()

	
	
	public void show() {
		InnerInstanceClass il = new InnerInstanceClass();
		System.out.println(il.iiv);
		il.innerInstanceFunction();
		
		InnerStatic is = new InnerStatic();
		System.out.println(is.isv);
		
	}
	
	
	
	
}

