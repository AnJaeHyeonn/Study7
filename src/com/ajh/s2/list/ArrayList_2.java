package com.ajh.s2.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2 {

	public static void main(String[] args) {
		// type이 안전하지 않다
		
		ArrayList<String> ar = new ArrayList<>(); //뒤에 <>안에 자동으로 String
		ar.add("1");
		ArrayList<Integer> ar2 = new ArrayList<>();
		
		String s = ar.get(0);
		
		
//		List<Integer> list = ar;
//		List는 ArrayList 의 super class(Interface)
//		단, generic type 도 같아야함
//		List<Ojbect> list = ar;
		
	
		List<Integer> list2 = ar2;

	}

}
