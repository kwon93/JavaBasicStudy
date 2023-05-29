package polymorphism.exam03;

public class KumhoTire extends Tire{

	public KumhoTire(String loacation, int maxRotation) {
		super(loacation, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatorRotation;
		if(accumulatorRotation<maxRotaiton) {
			System.out.println(location+"금호타이어 수명: "+ (maxRotaiton - accumulatorRotation)+"");
			return false;
			
		}else {
			System.out.println("*** "+location+"금호타이어 펑크 ***");
			return false;
		}
	}
	
}
