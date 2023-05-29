package nested.exam01;

import javax.sql.rowset.serial.SQLOutputImpl;

//중첩 클래스
public class A {
	
	A(){
		System.out.println("A객체가 생성됨.");
	}
	
	class B{
		B(){
			System.out.println("B객체가 생성됨.");
		}
		int field1;
		//static int field2; 인스턴스 클래스에서는 정적필드를 사용할 수 없다.
		//A라는 전제 조건이 없는이상 정적 필드 또는 정적 메소드를 사용 할 수 없다.
		
		void methodB() {}
	}
	
	static class C{
		C(){
			System.out.println("C객체가 생성됨.");
		}
		
		int field1;
		static int field2;
		
		void method1() {
			
		}
		
		static void method2() {
			
		}
	}
	
	void method() {
//	 	메소드 내부에서 선언 할 수 있는 로컬 클래스.
		class D{
			D(){
				System.out.println("D객체가 생성됨.");
			}
			int field1;
				
//			static int field2 인스턴스 클래스와 같이 static은 불가능하다.
			void method1() {
					
				}
			}
			// 메소드내에서 객체를 생성하고 호출 가능. 메소드 호출시 객체도 호출됨.
			D d = new D();
			d.field1 = 3;
			d.method1();
		}

}
