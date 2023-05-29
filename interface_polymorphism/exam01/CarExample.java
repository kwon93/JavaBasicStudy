package interface_polymorphism.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		System.out.println();
		
		myCar.frontLefTire = new KumhoTire();
		myCar.frontRighTire = new KumhoTire();
		
		myCar.run();
	}

}
