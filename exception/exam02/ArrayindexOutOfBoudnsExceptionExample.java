package exception.exam02;

public class ArrayindexOutOfBoudnsExceptionExample {
	public static void main(String[] args) {
		if(args.length >= 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println(data1+data2);
		}else {
			System.out.println("실행 매개값이 2개 필요합니다.");
		}
		int[] arr = {1,2,3};
		
		int result = arr[0] + arr[1];
		
		
	}
}
