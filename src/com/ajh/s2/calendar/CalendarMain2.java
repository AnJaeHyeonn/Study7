package com.ajh.s2.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {
	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		Date d1 = ca.getTime();
		System.out.println(d1);

		long l1 = ca.getTimeInMillis();// 밀리세컨즈
		System.out.println(l1);

		// 1980-11-15
		ca.set(1980, 10, 15);
		d1 = ca.getTime();
		long l2 = ca.getTimeInMillis();
		System.out.println(d1);
		System.out.println(l2);

		long l3 = l1 - l2;
		System.out.println(l3);

		System.out.println("초 : " + l3 / 1000L);
		System.out.println("분 : " + l3 / (1000L * 60));
		System.out.println("시 : " + l3 / (1000L * 60 * 60));
		System.out.println("일 : " + l3 / (1000L * 60 * 60 * 24));
		System.out.println("년 : " + l3 / (1000L * 60 * 60 * 24 * 365));

	}

}