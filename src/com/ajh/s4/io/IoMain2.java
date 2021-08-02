package com.ajh.s4.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Calendar;
import java.util.UUID;

public class IoMain2 {
	public static void main(String[] args) {
		String fileName = "";

		// fileName 생성하는 코드
		// 중복 X

		File file = new File("c:\\test", "name.txt");
		FileReader fr = null;
		BufferedReader br = null;

		Calendar calendar = Calendar.getInstance();
		long t = calendar.getTimeInMillis();

		fileName = String.valueOf("fileName : " + t);

		System.out.println(fileName);

		fileName = UUID.randomUUID().toString();
		System.out.println(fileName);
	}

}
