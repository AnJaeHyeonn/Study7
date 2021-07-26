package com.ajh.s1.object;

public class ObjectMain2 {
	public static void main(String[] args) {
		Test test = new Test();
		Test test2 = new Test();

		boolean check = test.equals(test2);

		System.out.println(check);
	}

}
