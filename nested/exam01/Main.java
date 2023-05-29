package nested.exam01;
//중첩 클래스 활용
public class Main {

	public static void main(String[] args) {
		A a = new A(); // 인스턴스 클래스는 우선 A라는 객체를 먼저 생성 후
		
		A.B b = a.new B(); // 이런식으로 B객체를 생성한다.
		
		b.methodB(); // B객체가 가진 필드 , 메소드 사용 가능.
		b.field1 = 1;
		
		A.C c = new A.C(); // 정적 클래스의 경우 이런식으로 바로 객체 생성 가능.
		
		c.field1 = 1; // 인스턴스,스태틱 필드 메소드 전부 사용 가능.
		c.field2 = 2;
		c.method1();
		c.method2();
		
		a.method(); // 메소드 내부에서 생성한 D객체의 메소드가 실행됨.
	}

}
