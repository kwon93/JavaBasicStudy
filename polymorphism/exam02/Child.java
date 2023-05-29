package polymorphism.exam02;

public class Child extends Parent {
	@Override
	public void mehtod2() {
		System.out.println("child-method2()"); // 오버라이딩한 메소드
	}
	
	public void method3() {
		System.out.println("child-method3()");
	}
}
