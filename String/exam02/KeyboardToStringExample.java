package String.exam02;

public class KeyboardToStringExample {

	public static void main(String[] args) throws Exception {
		
		byte[] bytes = new byte[100];
		
		System.out.println("입력: ");
		int needByteNo = System.in.read(bytes);
		
		String str = new String(bytes,0,needByteNo-1);
		System.out.println(str);
		
		
	}

}
