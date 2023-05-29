package math;

public class MathExample {

	public static void main(String[] args) {
		
		int v1 = Math.abs(-5);
		System.out.println(v1); // 절대값 출력
		double v2 = Math.ceil(6.3); // 올림값 출력
		System.out.println(v2); 
		double v3 = Math.floor(5.3); // 내림값 출력
		System.out.println(v3);
		
		int v4 = Math.max(5, 9); // 두 매개변수 중 큰 값을 변수에 저장함.
		System.out.println(v4);
		int v5 = Math.min(5, 9); // 최소값
		
		double v6 = Math.random(); // 0.0 ~ 0.999... 값을 랜덤하게 출력
		System.out.println(v6);
		
		double v7 = Math.rint(5.5); // 가장 가까운 실수값을 return함.
		double v8 = Math.rint(5.7);
		System.out.println(v7);
		
		long v9 = Math.round(5.3); // 반올림 메소드
		System.out.println(v9);
		
		int rand = (int) (Math.random()*10)+1; //1~10의 임의 정수를 얻는 방법
		System.out.println("RandomNumber: "+rand);
		
		
		
	}

}
