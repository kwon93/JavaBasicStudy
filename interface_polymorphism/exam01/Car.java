package interface_polymorphism.exam01;

public class Car {
	Tire frontLefTire = new HankookTire();
	Tire frontRighTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRighTire = new HankookTire();
	
	void run() {
		frontLefTire.roll();
		frontRighTire.roll();
		backLeftTire.roll();
		backRighTire.roll();
	}
	
}
