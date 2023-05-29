package java_lang.system;

public class SystemTimeExample {
	public static void main(String[] args) {
		
		long time1 = System.nanoTime(); //시작 시간
		
		int sum = 0;
		
		for(int i = 0; i <= 1000000; i++ ) {
			sum += i;
		}
		
		long time2 = System.nanoTime(); // 끝 시간
		

		System.out.println(time2 - time1); // 나노 초
		
		
		
	}
}
