package com.ajh.s4.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite1 {
	Scanner sc;

	public FileWrite1() {
		sc = new Scanner(System.in);
	}

	public void write() {
		File file = new File("c:\\test", "test.txt");
		System.out.println("메세지 입력");
		String message = sc.nextLine();

		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(message + "\r\n");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void write2() {
		// id,pw,age 입력받기 스캐너로

		// c -> -> test -> member.txt

		File file = new File("c:\\test", "member.txt");
		System.out.println("ID 입력");
		String message = sc.next();
		System.out.println("PW 입력");
		String message1 = sc.next();
		System.out.println("AGE 입력");
		String message2 = sc.next();

		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(message + "-" + message1 + "-" + message2 + "\r\n");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
