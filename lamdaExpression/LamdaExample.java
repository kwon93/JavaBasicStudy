package lamdaExpression;

public class LamdaExample {

	public static void main(String[] args) {
//		Object obj = (a,b) -> a > b ? a : b 람다식은 익명 객체
		
		MyFunction obj =  new MyFunction() { // 익명 객체
			public int max( int a, int b) { // 함수형 인터페이스 오버라이딩 
				return a > b ? a: b;
			}
		};
		
		int value = obj.max(3,5); 
		System.out.println(value);
		
		// 람다식을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
		// 위처럼 익명 객체를 이용해 적는거보다 람다식을 이용해 적는것이 더 효율적이다. 
		MyFunction obj2 = (a,b) -> a > b ? a : b; // 이렇게 인터페이스 기능 구현
		int value2 = obj2.max(9, 2);
		// 람다식에는 이름이 없으니 함수형 인터페이스에서 붙인 이름을 호출한다.
		System.out.println(value2);
	}

}

@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함.
// 애너테이션 붙이면 함수가 두 개 일시 컴파일 오류 발생함.
interface MyFunction{
	public abstract int max(int a, int b);
	// 함수형 인터페이스에서 익명 함수에 이름을 붙여야 호출가능.
}
