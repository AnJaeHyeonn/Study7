package com.ajh.s2.list.ex1;

import java.util.ArrayList;

public class Ex1Main {
	public static void main(String[] args) {

		MemberDAO memberDAO = new MemberDAO();
		ArrayList<MemberDTO> ar = memberDAO.memberInit();
		for (int i = 0; i < ar.size(); i++) {
			System.out.println("ID : " + ar.get(i).getId());
			System.out.println("PW : " + ar.get(i).getPw());
			System.out.println("AGE : " + ar.get(i).getAge());
			System.out.println("======================");
		}

		memberDAO.memberAdd(ar);
		for (int i = 0; i < ar.size(); i++) {
			System.out.println("ID : " + ar.get(i).getId());
			System.out.println("PW : " + ar.get(i).getPw());
			System.out.println("AGE : " + ar.get(i).getAge());
			System.out.println("======================");
		}
		
		ArrayList<MemberDTO> ar1 = memberDAO.memberDelete(ar);
		for (int i = 0; i < ar.size(); i++) {
			System.out.println("ID : " + ar1.get(i).getId());
			System.out.println("PW : " + ar1.get(i).getPw());
			System.out.println("AGE : " + ar1.get(i).getAge());
			System.out.println("======================");
		}

	}

}
