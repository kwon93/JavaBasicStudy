package java_util;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateExample {

	public static void main(String[] args) {
		//운영체제 기준의 시간
		Date date = new Date();
		System.out.println(date); // 자동으로 tostring()이 실행됨. 
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 yy일 hh시 mm분 ss초");
		String now = sdf.format(date);
		System.out.println(now);
		
		
		
	}

}
