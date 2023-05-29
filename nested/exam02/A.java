package nested.exam02;
//중첩클래스 접근 제어
public class A {
	
	class B{}
	
	static class C{}
	
	B field1 = new B();
	C field2 = new C();
	
	void method1() { // A클래스의 메소드
		
		B var1 = new B();
		C var2 = new C();
	}
	
//	static B field3 = new B(); 컴파일 오류 발생 : B는 인스턴스 멤버기때문에 A객체 없이 사용 할 수 없기 때문
	static C field4 = new C(); // 정적 클래스기 때문에 사용가능.
	
	static void method2() {
//		B var3 = new B(); 마찬가지로 컴파일 오류 발생 포함하는 메소드가 스태틱이기때문.
		C var4 = new C();
	}
}
