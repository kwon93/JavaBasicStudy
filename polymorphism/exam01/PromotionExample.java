package polymorphism.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b; // 자동 타입 변환 , 부모 자식간에만 가능
		A a2 = c;
		A a3 = d;
		A a4 = e; 
		
		B b1 = d;
		C c1 = e;
		
		/*
		B b2 = e; // 관련없는 부모 클래스이기때문에 자동 타입 	변환되지 않는다.
		C c2 = d;
		*/
	}
}
