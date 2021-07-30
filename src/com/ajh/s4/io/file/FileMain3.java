package com.ajh.s4.io.file;

import java.io.File;

public class FileMain3 {
	public static void main(String[] args) {

		File file = new File("c:\\");
		String[] names = file.list();
		File[] files = file.listFiles();

		for (int i = 0; i < names.length; i++) {
			File file2 = new File(file, names[i]);
			System.out.println(names[i]);
			

			if (file2.isFile()) {
				System.out.println("파일");
			} else {
				System.out.println("폴더");
			}
		}
	}

}
