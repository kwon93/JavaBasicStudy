package java_lang.toString;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone iphone = new SmartPhone("Apple", "IOS");
		
		String strObj = iphone.toString();
		
		System.out.println(strObj);
		System.out.println(iphone); //자동으로 프린트엘엔이 가지고있는 메소드 toString진행.
	}

}
