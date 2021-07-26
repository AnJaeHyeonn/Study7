package com.ajh.s1.string;

public class StringMain4 {
	public static void main(String[] args) {
		String n1 = "ajh";
		String n2 = "ajh";
		String n3 = new String("ajh");
		String n4 = new String("ajh");
		
		System.out.println(n1==n2);
		System.out.println(n3==n4);
		System.out.println(n1==n3);
		
		System.out.println(n1.equals(n2));
		System.out.println(n3.equals(n4));
		System.out.println(n1.equals(n3));
	}

}
