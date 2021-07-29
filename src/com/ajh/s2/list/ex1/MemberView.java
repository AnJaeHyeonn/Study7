package com.ajh.s2.list.ex1;

public class MemberView {

	public MemberView() {

	}

	public void view() {
		// myPage 선택 시 실행
		// id,pw,age 출력
		// 단, 메서드의 head는 변경 X
		// 멤버변수 선언 X
		System.out.println("ID : " + MemberSession.SESSION.get("member").getId());
		System.out.println("PW : " + MemberSession.SESSION.get("member").getPw());
		System.out.println("AGE : " + MemberSession.SESSION.get("member").getAge());
		
//		MemberDTO memberDTO = MemberSession.SESSION.get("member");
//		System.out.println("ID : " + memberDTO.getId());
//		System.out.println("PW : " + memberDTO.getPw());
//		System.out.println("AGE : " + memberDTO.getAge());
		
		
	}

}
