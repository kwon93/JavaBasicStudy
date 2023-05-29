package interface_polymorphism.exam04;

public class DriverExample {

	public static void main(String[] args) {
		Driver d = new Driver();
		
		Bus bus = new Bus();
		
		d.drive(bus);
	}

}
