package abstract_.exam01;

public abstract class Phone {
	public String owner;
	
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	public void turnOff() {
		System.out.println("전원이 꺼졌습니다.");
	}
}
