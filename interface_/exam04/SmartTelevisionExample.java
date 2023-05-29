package interface_.exam04;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable search = tv;
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(12);
		search.search("www.daum.net");
		
		tv.search("www.naver.com");
	
	}

}
