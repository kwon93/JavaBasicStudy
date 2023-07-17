package enum_;

public class EnumRemind1 {
	public static String male = "male";
	public static String female = "female";

	public static void main(String[] args) {
		String gender1 = EnumRemind1.male;
		//이러한 경우의 문제점
		gender1 = "boy"; 
		//이런식으로 스트링 타입이기때문에 어떠한 문자가 들어와도 컴파일 오류가 발생하지 않는다.
		
		Gender gender2 = Gender.MALE;
		//이넘 자체가 타입이 됨. 해당 enum 타입외 다른 값을 들어가게되면 컴파일 오류가 발생함.
		
		
		
		
	}

}
//이럴때 enum을 사용
enum Gender{
	MALE,
	FEMALE;
}
