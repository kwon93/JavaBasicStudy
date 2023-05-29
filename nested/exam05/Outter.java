package nested.exam05;

public class Outter {
	String field = "Outter - field";
	void method() {
		System.out.println("Outter - method");
	}
	
	class Nested{
		String field = "Nested - field";
		
		void method() {
			System.out.println("Nested - method");
		}
		
		void print() {
			System.out.println(this.field); // 여기서 this는 Nested Class 를 참조
			this.method();
			
			System.out.println(Outter.this.field); // 여기서 this는 Outter class 참조
			Outter.this.method();
		}
	}
}
