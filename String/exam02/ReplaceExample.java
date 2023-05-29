package String.exam02;

public class ReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바 Progaming";
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(newStr); //원본 문자열을 변경하지않고 새로운 문자열을 만듬.
		System.out.println(oldStr); // 스트링은 원본이 바뀌지 않는다. 
	}

}
