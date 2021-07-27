package com.ajh.s2.token;

import java.util.StringTokenizer;

public class TokenMain2 {

	public static void main(String[] args) {

		String str = "korea  -USA-china*france*UK-canada-germany";
		
		// 나라별로 파싱
		// 모든 나라이름은 대문자로 출력

		str = str.replace("*", "-").toUpperCase().trim();
		StringTokenizer st = new StringTokenizer(str, "-");

		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.println(s);
		}
	}

}
