package com.ajh.s3.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_1 {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		boolean check = true;

		while (check) {
			try {
				System.out.println("숫자를 입력");
				int num = sc.nextInt(); // InputMismatchException e
				int num2 = 20;
				int num3 = num2 / num; // ArithmeticException e
				// 예외가 발생하면 예외 객체 생성 -> new ArithmeticException();
//			ArithmeticException ar = new ArithmeticException();
//			catch(ar);
//			throw ar;
				System.out.println(num3);
				check = !check;
			} catch (ArithmeticException e) {
				// 예외가 발생 했을 때 실행
				// 예외 처리
				System.out.println("예외처리");

			} catch (RuntimeException e) {
				System.out.println("숫자만 입력");
				sc.next();
			}

		}
		System.out.println("Finish");
	}

}
