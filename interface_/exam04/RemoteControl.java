package interface_.exam04;
//인터페이스에서 추상메소드 선언
public interface RemoteControl {
	
	int MAX_VOLUME = 10; //인터페이스에서는 public static final을 생략해도 상수의 성격을 띈다.
	int MIN_VOLUME = 0;
	
	void turnOn(); // public abstract를 생략해도 그 성격을 가진다. 실행부는 x 
	void turnOff();
	void setVolume(int volume);
	
}
