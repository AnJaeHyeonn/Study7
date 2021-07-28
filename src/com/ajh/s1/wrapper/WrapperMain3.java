package com.ajh.s1.wrapper;

public class WrapperMain3 {
	public static void main(String[] args) {
		String jumin = "980126-1059521";
		// 9  8  0  1  2  6 - 1  0  5  9  5  2 : 1 (마지막 번호 1은 검증번호)
	  // * 2  3  4  5  6  7   8  9  2  3  4  5 (곱하기)
	   // 18 24  0 5  12 42   8  0 10 27 20 10(결과를 다 더하기)
		// 176(a)
		// a를 11로 나누어서 나머지 구하기
		// 11에서 나온 나머지를 빼기
		// 11에서 나온 나머지를 뺐을때 2자리 이상이면 다시 10으로 나누어서 그 나머지를 구한다
		// 나머지 숫자랑 검증번호가 같으면 올바른 번호

		String year1 = jumin.substring(0, 6);
		String[] s1 = year1.split("");
		int result1 = 0;

		String year2 = jumin.substring(7, 13);
		String[] s2 = year2.split("");

		String check = jumin.substring(13);
		int checknum = Integer.parseInt(check);

		for (int i = 0; i < s1.length; i++) {

			int y1 = Integer.parseInt(s1[i]);
			result1 = result1 + y1 * (i + 2);
			System.out.println(result1);

		}

		int result2 = result1;

		for (int i = 0; i < s2.length; i++) {

			int y2 = Integer.parseInt(s2[i]);

			if (i == 0) {
				result2 = result2 + y2 * 8;
			} else if (i == 1) {
				result2 = result2 + y2 * 9;
			} else {
				result2 = result2 + y2 * i;
			}

			System.out.println(result2);
		}

		int x = 11 - (result2 % 11);

		if (x / 10 >= 1) {
			x = x % 10;
		}

		if (x == checknum) {
			System.out.println("올바른 번호");
		} else {
			System.out.println("올바르지 못한 번호");
		}
		
		
		System.out.println("============Math==============");
		
		double d = Math.random();
		System.out.println(d);
		
	}
}
