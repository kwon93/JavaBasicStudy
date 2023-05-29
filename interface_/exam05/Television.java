package interface_.exam05;
//구현(implement) 클래스
public class Television implements RemoteControl{

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("텔레비전을 킵니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("텔레비전을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) { //매개변수로 넣은 볼륨값이 인터페이스의 맥스값보다 큰 값을 넣는다면 맥스볼륨값으로 바꿔주는 로직
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		this.volume = volume;
		
		System.out.println("현재 텔레비전의 볼륨은 "+this.volume);
		
	}
	
}
