package com.ajh.s3.exception;

public class Exception_3 {
	public static void main(String[] args) {
		Test3 test3 = new Test3();

		try {
			test3.t3();
		} catch (Exception e) {
			System.out.println("예외처리");
			System.out.println(e.getMessage());
			System.out.println("예외처리끝");
		}
	}

}
