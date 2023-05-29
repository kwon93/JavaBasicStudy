package String.exam01;

public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		String str1 = new String(bytes);
		System.out.println(str1); //Hello Java 출력됨.
		
		String str2 = new String(bytes,6,4); //6인덱스를 시작해 4글자만 변환하라능
		System.out.println(str2); //Java만출력
	}

}
