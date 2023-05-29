package abstract_.exam01;
//추상(abstract) 클래스
public class PhoneExample {

	public static void main(String[] args) {
//		Phone p = new Phone();  추상 클래스는 객체를 생성할 수 없다.
		SmartPhone smartPhone = new SmartPhone("이재용");
		smartPhone.turnOn(); //추상클래스를 통해 사용할 수 있는 메소드
		smartPhone.internetSearch(); // smartPhone이 가지고있는 고유 메소드
		smartPhone.turnOff();
	}
}