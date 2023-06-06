package lamdaExpression;


@FunctionalInterface
interface MyFunction2{
	void run();
}

public class LamdaExpression2 {
	
	static void execute(MyFunction2 f) { // 매개 변수가 함수형 인터페이스
		f.run();
	}
	
	static MyFunction2 getMyFunction2() { // return type이 함수형 인터페이스.
		MyFunction2 f = () -> System.out.println("f3.run()");
		return f;
		
	}
	
	public static void main(String[] args) {
		// lamda식으로 구현
		MyFunction2 f1 = ()->System.out.println("f1.run()");
		f1.run();
		
		// 익명 클래스로 구현
		MyFunction2 f2 = new MyFunction2() {
			
			@Override
			public void run() {
				System.out.println("f2.run()");
			}
		};
		
		f2.run();
		
		//
		MyFunction2 f3 = getMyFunction2();
		f3.run();
		
		execute(f3);
		
		
		
	}
}
