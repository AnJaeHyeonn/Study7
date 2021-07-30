package com.ajh.s3.exception;

public class Test3 {

	public void t3() throws Exception {

//		 유치원생 = 두자릿수
//		try {
//			int num1 = 40;
//			int num2 = 70;
//
//			int num3 = num1 + num2;
//			int num4 = num1 - num2;
//
//			if (num3 > 99) {
//				throw new MyException();
//			}
//
//			System.out.println(num3);
//		} catch (MyException e) {
//
//		} catch (Exception e) {
//
//		}

		int num1 = 20;
		int num2 = 70;

		int num3 = num1 + num2;
		int num4 = num1 - num2;

		if (num3 > 99) {
			throw new MyException("세자리 수 금지!");
		}

		if (num4 < 0) {
			throw new MyException("음수 금지!!");
		}

		System.out.println(num3);
		System.out.println(num4);

	}
}
