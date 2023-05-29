package polymorphism.exam06;
//instanceof 연산자 : 객체가 어떤 타입인지 조사할때 사용함.
public class InstanceOfExample {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		if(p instanceof Child) { //p라는 객체가 차일드 클래스로부터 만들어진 객체라면 트루 
			Child c = (Child)p;
		}
		
	//	Child c = (Child)p;  ClassCastException 예외 발생 . 강제 타입 변환할 수 없음.
		
		Parent p1 = new Child();
		method1(p1); // 여기서의 매개변수는 차일드 클래스의 객체  
		
		Parent p2 = new Parent();
		method1(p2);
		
		
		
				
	}
	
	public static void method1(Parent p) {
		if(p instanceof Child) { // 매개변수의 타입이 만약 child라면 true;
			Child c = (Child)p;
			System.out.println("method1 - Child로 변환 성공.");
		}else {
			System.out.println("method1 - Child로 변환되지 않았음.");
		}
	}
}
 