package com.ajh.s2.list;

import java.util.ArrayList;

public class ArrayList_1 {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		String[] str = new String[2];
		String s = "First";
		Object o = s;

		ar.add("First");
		str[0] = "First";

		ar.add("Second");
		str[1] = "Second";

		ar.add("Third");

		ar.add(5);

		ar.add('a');
		ar.add(true);

		ar.add(1, "add"); // 인덱스 번호 1에다가 add추가 (나머진 뒤로 밀림)
		ar.set(0, 1);
		ar.remove(0);
		ar.clear();
		System.out.println(ar.size());
		System.out.println(ar.isEmpty());

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		System.out.println("========================");
		ar.add("first");
		ar.add(2);
		ar.add(3.333);
		ar.add('4');
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		String s0 = (String)ar.get(0);
		int s1 = (Integer)ar.get(1);
	}

}
