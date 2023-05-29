package interface_polymorphism.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle v = new Bus();
		
		v.run(); // 현재 상태에서는 사용할 수 있는 메소드는 run밖에 없다.
		Bus b = (Bus) v; // 다시 버스 타입으로 강제 타입 변환
		
		b.checkFare(); // 버스 타입이 가지고있는 checkFare라는 메소드를 사용 할 수 있다.
	}

}
