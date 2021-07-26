package com.ajh.s1.string;

import java.util.Scanner;

public class StringMain5 {
	public static void main(String[] args) {
		String n = "Hello World";

		String n2 = n.replace('l', 'k');
		System.out.println(n2);

		String n3 = n.substring(n.indexOf('W'));
		System.out.println(n3);
		System.out.println("========================");

		Scanner sc = new Scanner(System.in);
		System.out.println("저장 할 파일명 입력");
		// a.txt, ajh.jpg ...

		String[] files = { "jpg", "gif", "png", "svg" };

		String file = sc.next();
		String file2 = file.substring(file.lastIndexOf('.') + 1);
		boolean check = false;

		for (int i = 0; i < files.length; i++) {
			if (file2.equals(files[i])) {
				check = true;
				break;
			}
		}

		if (check == true) {
			System.out.println("이미지 파일입니다.");
		} else {
			System.out.println("이미지 파일이 아닙니다.");
		}
	}

}
