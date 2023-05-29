package interface_.exam03;
//구현(implement) 클래스
public class Audio implements RemoteControl{

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 킵니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) { //매개변수로 넣은 볼륨값이 인터페이스의 맥스값보다 큰 값을 넣는다면 맥스볼륨값으로 바꿔주는 로직
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		this.volume = volume;
		
		System.out.println("현재 오디오의 볼륨은 "+this.volume);
		
	}
	
}
