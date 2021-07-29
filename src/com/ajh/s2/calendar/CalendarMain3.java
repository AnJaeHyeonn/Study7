package com.ajh.s2.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain3 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();

		Date d1 = ca.getTime();
		System.out.println(d1);
		long l = ca.getTimeInMillis();
		long t = 1000 * 60 * 60 * 8;
		l = l + t;

		ca.setTimeInMillis(l);
		d1 = ca.getTime();
		System.out.println(d1);

		System.out.println("-----------------");
		ca = Calendar.getInstance();
		d1 = ca.getTime();
		System.out.println(d1);

		ca.roll(Calendar.HOUR_OF_DAY, 8);
		d1 = ca.getTime();
		System.out.println(d1);

		System.out.println("-----------------");
		ca = Calendar.getInstance();
		d1 = ca.getTime();
		System.out.println(d1);

		ca.add(Calendar.HOUR_OF_DAY, 8);
		d1 = ca.getTime();
		System.out.println(d1);

	}
}
