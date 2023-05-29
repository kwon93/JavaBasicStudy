package anonymousClass.exam02;

public class Anonymous {
	//필드를 사용할 때 인터페이스를 사용 할 수 있고
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 킵니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	}; 
	
	void method1() {
		// 로컬 변수 역시
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 킵니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		}; 
		localVar.turnOn();
		localVar.turnOff();
	}
	
	void method2(RemoteControl rc) { // 매개변수로도 사용 할 수 있다.
		rc.turnOn();
		rc.turnOff();
		
	}
}
