package com.ajh.s1.string;

public class StringMain3 {
	public static void main(String[] args) {
		String name = "Hello World";

//		int i = name.indexOf('W');
//		int j = name.indexOf('o', 4);
//		int k = name.indexOf("lo");
//		System.out.println(i);
//		System.out.println(j);
//		System.out.println(k);

		// 'o'문자가 몇 개 있습니까?
		int num3 = 0;

		for (int num = 0; num < name.length(); num++) {
			int num2 = name.indexOf('o', num);
			if (num2 == num) {
				num3 = num3 + 1;
			}
		}
		System.out.println(num3);

		// 'o'문자가 몇 개 있습니까?
		boolean check = true;
		int num = 0;
		int count = 0;
		while (check) {
			num = name.indexOf('o', num);

			if (num > 0) {
				num++;
				count++;

			} else {
				System.out.println("검색 종료");
				break;
			}
		}
		
		System.out.println(count);
	}

}
