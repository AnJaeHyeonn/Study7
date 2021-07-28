package com.ajh.s2.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {

	private Scanner sc;
	private MemberDAO memberDAO;
	private ArrayList<MemberDTO> ar;

	public MemberController() {
		sc = new Scanner(System.in);
		memberDAO = new MemberDAO();
		ar = memberDAO.memberInit();
	}

	public void start() {

		boolean check = true;

		while (check) {
			check = beforeLogin();
		}

	} // start

	private boolean beforeLogin() {
		System.out.println("1. 회원가입 \t 2. 로그인 \t 3. 종료");
		int select = sc.nextInt();
		boolean flag = true;

		switch (select) {
		case 1:
			memberDAO.memberAdd(ar);
			break;

		case 2:
			MemberDTO memberDTO = memberDAO.memberLogin(ar);
			if (memberDTO != null) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
			break;

		default:
			flag = !flag;
		}
		return flag;
	}

}
