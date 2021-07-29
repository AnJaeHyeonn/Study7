package com.ajh.s2.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain_1 {
	public static void main(String[] args) {

		// 현재 날짜와 시간의 정보
		Calendar ca = Calendar.getInstance(); // new GrogorianCalendar
		System.out.println(ca); // toString()

		int year = ca.get(Calendar.YEAR);
		System.out.println(year);

		int month = ca.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		int date = ca.get(Calendar.DATE);
		System.out.println(date);
		
		int hour = ca.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		
		int min = ca.get(Calendar.MINUTE);
		System.out.println(min);
		
		int sec = ca.get(Calendar.SECOND);
		System.out.println(sec);
		
		Date d = ca.getTime();
		System.out.println(d);


	}

}
