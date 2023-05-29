package polymorphism.exam05;
//강제 형변환의 조건 :자식 타입이 부모타입으로 자동 타입  변환한 후 다시 반대로 변환할 때 가능.
public class ChildExample {
	public static void main(String[] args) {
		
		Parent p = new Child();
		p.method1();
		p.method2();
//		p.method3(); 페어런츠 클래스 타입 메소드만 사용가능 , 형변환이됬기 때문.
		
		Child c = (Child)p;
		c.method1();
		c.method2();
		c.method3(); // 차일드 타입으로 다시 강제 형변환 됬기때문에 차일드 클래스 메소드 사용가능.
	}
}
