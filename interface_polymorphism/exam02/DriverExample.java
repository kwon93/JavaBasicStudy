package interface_polymorphism.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver d = new Driver();
		
		Bus bus = new Bus();
		
		d.drive(bus);// 어떤 객체를 매개변수에 대입하느냐에 따라 값이 달라지는것. 매개변수의 다형성
		d.drive(new Taxi());
	}

}
