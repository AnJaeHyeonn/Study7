package com.ajh.s1.string;

public class StringMain2 {
	public static void main(String[] args) {
		// String name = new String("hello world");
		String name = "hello world";

		char ch = name.charAt(1);

		System.out.println(ch);

		String name2 = "980126-1059521";
		char ch2 = name2.charAt(7);

		if (ch2 == '1' || ch2 == '3') {
			System.out.println("남성");
		} else if (ch2 == '2' || ch2 == '4') {
			System.out.println("여성");
		} else {
			System.out.println("오류");
		}
		
		ch = name.charAt(200);
	}

}
