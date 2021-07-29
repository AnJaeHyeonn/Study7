package com.ajh.s2.list.ex2;

import java.util.ArrayList;

public class Ex2Main {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();

		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);

		MyList myList = new MyList();

		myList.add(ar, 3);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("=====================");
		myList.remove(ar);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}

}
