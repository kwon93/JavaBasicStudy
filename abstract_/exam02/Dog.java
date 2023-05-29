package abstract_.exam02;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	
	public void sound() { //추상클래스에서 정의해놓은 추상 메소드를 구현하지 않을경우 컴파일에러가 난다.
		System.out.println("댕댕");
	}
}
