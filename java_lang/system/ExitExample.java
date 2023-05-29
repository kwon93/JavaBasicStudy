package java_lang.system;

public class ExitExample {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
				if(i == 5) {
				System.exit(0); //프로그램이 완전 종료되버림.
			}
		}
		System.out.println("마무리 코드");
	}

}
