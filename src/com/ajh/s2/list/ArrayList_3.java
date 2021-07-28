package com.ajh.s2.list;

import java.util.ArrayList;

public class ArrayList_3 {
	public static void main(String[] args) {

		// Member 타입을 모으려고 하는 리스트 선언
		ArrayList<Member> ar = new ArrayList<>();
		Member member = new Member();
		member.setId("ajh");
		member.setPw("pw");
		ar.add(member);
		
		ar.add(new Member());
		ar.get(1).setId("id"); //Member 주소가 꺼내와짐
		ar.get(1).setPw("pw1");
		
		Member member2 = ar.get(0);		
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i).getId());
			System.out.println(ar.get(i).getPw());
		}
		
	}
}
