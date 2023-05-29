package interface_polymorphism.exam04;

public class Driver {
	
	public void drive(Vehicle v) {
		if(v instanceof Bus) { // 데이터 타입이 Bus일 경우에만 작동
			Bus b = (Bus) v;
			b.checkFare();
		}
		v.run();
	}
}
