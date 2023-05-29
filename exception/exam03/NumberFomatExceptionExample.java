package exception.exam03;

public class NumberFomatExceptionExample {
	//문자열을 숫자로 변환하려는 경우에 발생하는 예외
	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "a200";
		
		int value1 = Integer.parseInt(data1);
		System.out.println(value1);
		

		int value2 = Integer.parseInt(data2);
		System.out.println(value2);
	}

}
