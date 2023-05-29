package polymorphism.exam04;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver d = new Driver();
		Vehicle v = new Vehicle();
		Bus b = new Bus(); // 비히클 클래스를 상속함.
		Taxi t = new Taxi();
		
		
		
		d.drive(v);
		d.drive(b); // 드라이브 메소드에 버스 객체와 택시 객체를 대입
		d.drive(t);
	}

}
