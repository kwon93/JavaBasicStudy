package java_util;

import java.nio.file.StandardWatchEventKinds;
import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = now.get(Calendar.MONTH)+1; // 0~11사이를 return하기에 +1을 해준다.
		System.out.println(month);
		
		int day = now.get(Calendar.DAY_OF_MONTH); 
		System.out.println(day);
		
		

		int week = now.get(Calendar.DAY_OF_WEEK);
		//int값으로 return되기에 switch나 if문이 필요함
		String strWeek = null;
		
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		}
		
		System.out.println(strWeek+"요일");
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		
		System.out.println(strAmPm);
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
	}

	

}
