package com.ajh.s2.random;

import java.util.ArrayList;

public class PasswordMain {

	public static void main(String[] args) {
		Password pw = new Password();
		ArrayList<Character> ar = pw.makePassword();

		for (int i = 0; i < ar.size(); i++) {
			System.out.print(ar.get(i));
		}
	}

}
