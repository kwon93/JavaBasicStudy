package polymorphism.exam03;

public class HanKookTire extends Tire {

	public HanKookTire(String loacation, int maxRotation) {
		super(loacation, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatorRotation;
		if(accumulatorRotation<maxRotaiton) {
			System.out.println(location+"한국타이어 수명: "+ (maxRotaiton - accumulatorRotation)+"");
			return false;
			
		}else {
			System.out.println("*** "+location+"한국타이어 펑크 ***");
			return false;
		}
		
	}
	
}
