package com.ajh.s1.string;

public class StringMain7 {
	public static void main(String[] args) {
		int num = 10; // "10"으로바꾸기

		String i = String.valueOf(num);
		System.out.println(i+1);
		
		String a = "abc";
		String b = "def";

		
		StringBuffer sb = new StringBuffer();
		
		sb.append(a);
		sb.append(b);
		sb.append(3);
		System.out.println(sb);
		
		String str = sb.toString();
		
		System.out.println(str);
		
	}

}
