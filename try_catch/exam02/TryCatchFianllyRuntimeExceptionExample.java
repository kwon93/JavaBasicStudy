package try_catch.exam02;

public class TryCatchFianllyRuntimeExceptionExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];	
			System.out.println("코드 실행 성공");
		}catch(Exception e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			return;
		}finally {
			System.out.println("finally는 눈이오나 비가오나 실행됩니다.");
		}
		
		System.out.println("------------------");
		
		try {
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		System.out.println("코드 실행 성공");
		}catch(NumberFormatException e) {
			System.out.println("삑- 숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시 실행하세용.");
		}
	}

}
