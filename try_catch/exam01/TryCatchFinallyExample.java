package try_catch.exam01;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		
		try {
			Class clazz = Class.forName("java.lang.Strin2g");
			System.out.println("정상 실행");
		} catch (ClassNotFoundException e) {
			System.out.println("Class가 존재하지 않습니다.");
		}finally {
			System.out.println("finally는 항상 실행됩니다.");
		}
	}

}
