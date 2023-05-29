package polymorphism.exam03;
//필드의 다형성
public class Tire {
	public int maxRotaiton; // 최대회전수(최대수명)
	public int accumulatorRotation; // 누적 회전수
	public String location; // 타이어의 위치
	
	public Tire(String loacation, int maxRotation) {
		this.location = loacation;
		this.maxRotaiton = maxRotation;
	}
	
	public boolean roll() {
		++accumulatorRotation;
		if(accumulatorRotation < maxRotaiton) {
			System.out.println(location+"Tire 수명: "+(maxRotaiton - accumulatorRotation)+ "회");
			return true;
		}else {
			System.out.println("*** "+location+"Tire 펑크 ****");
			return false;
		}
	}
}
