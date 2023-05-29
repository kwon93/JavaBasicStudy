package interface_.exam03;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc;
		rc = new Audio(); // 대입하는 객체의 메소드를 호출
		
		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();
	}

}
