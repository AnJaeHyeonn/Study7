package com.ajh.s4.io.file;

import java.io.File;
import java.util.Scanner;

public class FileMain2 {
	public static void main(String[] args) {

		File file = new File("C:\\test");
		Scanner sc = new Scanner(System.in);

		System.out.println("폴더명 입력");
		String name = sc.next();

		file = new File(file, name);

//		if (file.exists()) {
//			System.out.println("존재하는 폴더입니다.");
//		} else {
//			System.out.println("존재하지 않는 폴더입니다.");
//		}

//		if (!file.exists()) {
//			file.mkdirs();
//		}

		if (file.exists()) {
			file.delete();
		} else {
			file.mkdirs();
		}

	}

}
