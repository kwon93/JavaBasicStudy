package anonymousClass.exam02;

public class AnonymousExample {

	public static void main(String[] args) {
		
		Anonymous a = new Anonymous();
		a.field.turnOn(); //익명객체를 필드값에 적용했을때 호출하는 방법.
		a.field.turnOff(); //field를 통해 재정의 메소드가 호출됨.
		
		a.method1();
		
		a.method2(new RemoteControl(){
			
			@Override
			public void turnOn() {
				System.out.println("에어콘을 킵니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("에어콘을 끕니다.");
				
			}
		});
	}

}
