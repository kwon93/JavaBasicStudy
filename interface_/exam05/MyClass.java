package interface_.exam05;

public class MyClass {
	RemoteControl rc = new Television(); //필드의 타입으로도 인터페이스가 사용된다.
	
	MyClass(){
		
	}
	
	MyClass(RemoteControl rc){
		this.rc = rc; 
		rc.turnOn();
		rc.setVolume(5);
		
	}
	
	void methodB(RemoteControl rc) { // 인터페이스를 메소드의 매개변수로도 사용가능하다.
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodA() {
		RemoteControl rc = new Audio(); // 인터페이스를 로컬변수의 타입으로도 사용가능하다.
		rc.turnOn();
		rc.setVolume(5);
	}
}
