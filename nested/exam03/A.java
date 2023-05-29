package nested.exam03;
//중첩 클래스의 접근 제한
public class A {
	int field1;
	void method1() {
		
	}
	
	static int field2;
	static void method2() {
		
	}
	
	class B{
		void methodB() {
			field1 = 1; 
			method1();
			
			field2 = 10;
			method2();
		}
		
	}
	
	static class C{
		void method() {
//			field1 = 1;  스태틱 클래스는 a객체가 없어도 사용가능해야 하기때문에
//			method1();  		인스턴스 필드와 메소드는 사용할 수 없다.
//			
			field2 = 10;
			method2();
			
		}
	}
}
