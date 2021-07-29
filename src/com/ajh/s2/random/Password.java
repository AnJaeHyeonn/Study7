package com.ajh.s2.random;

import java.util.ArrayList;
import java.util.Random;

public class Password {

	Random random;
	ArrayList<Character> ar;

	public Password() {
		random = new Random();
		ar = new ArrayList<Character>();
	}

	// makePassword
	// 랜덤한 패스워드 생성
	// 대문자, 소문자, 숫자 조합
	// 8자리
	// 1. 대문자 소문자 숫자 결정 (123 랜덤) random.nextInt(3)+1
	// 2. 글자 랜덤 아스키코드

	public ArrayList<Character> makePassword() {

		int i = 0;
		System.out.println("1. 대문자 \t 2. 소문자 \t 3. 숫자");

		while (ar.size() < 8) {

			int num = random.nextInt(3) + 1;

			if (num == 1) {
				System.out.println("대문자");
				i = random.nextInt(16) + 65;
				ar.add((char) i);
			} else if (num == 2) {
				System.out.println("소문자");
				i = random.nextInt(16) + 97;
				ar.add((char) i);
			} else {
				System.out.println("숫자");
				i = random.nextInt(10) + 48;
				ar.add((char) i);
			}

		}

		return ar;
	}

}
