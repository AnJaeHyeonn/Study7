package com.ajh.s3.exception;

public class Exception_2 {
	public static void main(String[] args) {

//		int[] ar = { 1, 2, 3 };
//		
//		int [] ar1 = null;
//		Test2 test2 = new Test2();
//		try {
//			test2.t2(ar1);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		Test1 test1 = new Test1();
		try {
			test1.t1();
		} catch (Exception e) {
			System.out.println("예외 처리 시작");
			//e.printStackTrace();
			e.getMessage();
			System.out.println("예외 처리 끝");
		}
	}

}
