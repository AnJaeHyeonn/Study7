package com.ajh.s4.io.file;

import java.io.File;

public class FileMain {
	public static void main(String[] args) {
//		File file = new File("C:\\test\\study1.txt");
		File file = new File("C:\\\\test");

		boolean result = file.exists();
		result = file.isFile(); // test가 파일 입니까?
		System.out.println(result);
		result = file.isDirectory(); // test가 폴더입니까?
		System.out.println(result);

		// ========================================== 폴더 경로

		file = new File(file, "study1.txt");

		result = file.exists(); // 그 폴더 안에 파일이 존재 합니까?

		System.out.println(result);
	}

}
