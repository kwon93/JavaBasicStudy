package polymorphism.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child c = new Child();
		
		Parent p = c;
		p.method1();
		p.mehtod2(); // 타입 변환이 이뤄져도 자식클래스의 오버라이딩한 메소드가 출력된다.
//		p.mehtod3(); 자식클래스의 메소드3은 호출할 수 없다 중요한 성질 
	}
}
