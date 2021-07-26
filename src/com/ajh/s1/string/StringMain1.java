package com.ajh.s1.string;

public class StringMain1 {
	public static void main(String[] args) {
		System.out.println(String.CASE_INSENSITIVE_ORDER);

		String t1 = "tset";
		String t2 = new String("test");

		System.out.println(t1);
		System.out.println(t1.toString());
		System.out.println(t2);
		System.out.println(t2.toString());

		Test test = new Test();
		System.out.println(test);
		System.out.println(test.toString());
	}

}
