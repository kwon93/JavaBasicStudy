package wrapperClass;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		/*
		 * Wrapper Class란: 
		 * Primitive type의 원시 타입 변수를 참조타입 변수로 감싸주는 것. 
		 * */
		
		
		Integer obj = new Integer(100);
		System.out.println(obj);
		
		Integer obj2 = new Integer("200"); //문자열로 줘도 wrapperClass로 Boxing이 된다.
		System.out.println(obj2);
		
		int value1 = obj.valueOf(100); // 다시 데이터타입을 원시타입으로 되돌리는 unBoxing과정.
		System.out.println(value1);
		
		Integer obj3 = 100; //이런식으로 자동으로 boxing이 될 수 있다. 
		int value2 = obj3; // 마찬가지로 unBoxing도 자동으로 
		int value3 = obj3 + 100; 
		System.out.println(value3); // int type의 정수 200 출력됨.
		
		Integer obj4 = 100;
		Integer obj5 = 100;
		System.out.println(obj4 == obj5);
		// int type의 범위인 -127~127 사이의 값은 동일하게 캐시된 객체를 참조해 true가 나오지만
		
		Integer obj6 = 300;
		Integer obj7 = 300;
		System.out.println(obj6 == obj7);
		// 범위를 넘어갈 경우 캐시된 객체를 사용하지않고 새로운 객체를 만들어 참조하기때문에 false가 나온다.
		// equals() 메소드를 사용해 비교하는것이 권장됨. 
		System.out.println("equals() 결과: "+obj4.equals(obj5));
		System.out.println("equals() 결과: "+obj6.equals(obj7));
		
		
	}

}
