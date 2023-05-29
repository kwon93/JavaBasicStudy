package java_lang.toString;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Date obj2  = new Date();
		
		System.out.println(obj1.toString()); //클래스이름과 해쉬코드값 출력
		System.out.println(obj2.toString()); // 현재 날짜와 시간 출력
		
				
	}

}
