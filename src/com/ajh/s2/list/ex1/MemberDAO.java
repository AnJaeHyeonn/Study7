package com.ajh.s2.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberDAO {

	private String info;
	private Scanner sc;

	// memberInit
	// info에 있는 정보를 파싱해서 MemberDTO 객체생성해서 대입
	// ArrayList에 각각 추가하고 리턴
	public MemberDAO() {
		info = "ajh,pw1,25,iu,pw2,27,choa,pw3,30";
		sc = new Scanner(System.in);
	}

	public ArrayList<MemberDTO> memberInit() {

		StringTokenizer st = new StringTokenizer(info, ",");

		ArrayList<MemberDTO> ar = new ArrayList<MemberDTO>();

		while (st.hasMoreTokens()) {
			MemberDTO memberDTO = new MemberDTO();

			String id = st.nextToken();
			memberDTO.setId(id);
			String pw = st.nextToken();
			memberDTO.setPw(pw);
			String age = st.nextToken();
			int age2 = Integer.parseInt(age);
			memberDTO.setAge(age2);

			ar.add(memberDTO); // ArrayList에 추가

		}

		return ar;

	}

	// memberAdd
	// scanner로 id, pw, age 입력받아서 MemberDTO 멤버변수
	// 매개변수로 ArrayList를 받아서 생성한 MemberDTO 추가
	public ArrayList<MemberDTO> memberAdd(ArrayList<MemberDTO> ar) {
		MemberDTO memberDTO = new MemberDTO();

		System.out.println("ID를 입력하세요.");
		memberDTO.setId(sc.next());
		System.out.println("PW를 입력하세요.");
		memberDTO.setPw(sc.next());
		System.out.println("Age를 입력하세요.");
		memberDTO.setAge(sc.nextInt());

		ar.add(memberDTO);

		return ar;

	}

	// memberDelete
	// scanner로 id,pw를 입력받아서 MemberDTO 멤버변수에 추가
	// 매개변수로 ArrayList를 받아서 입력받은 id,pw가 둘다 일치하는 애를 찾아서 삭제
	public int memberDelete(ArrayList<MemberDTO> ar) {
		MemberDTO memberDTO = new MemberDTO();

		System.out.println("ID를 입력하세요.");
		memberDTO.setId(sc.next());
		System.out.println("PW를 입력하세요.");
		memberDTO.setPw(sc.next());
		int result = 0;

		for (int i = 0; i < ar.size(); i++) {
			if (memberDTO.getId().equals(ar.get(i).getId()) && memberDTO.getPw().equals(ar.get(i).getPw())) {
				ar.remove(i);
				result = 1;
				break;
			}
		}
		return result;
	}

	// memberLogin
	// scanner로 id,pw를 입력받아서 MemberDTO 멤버변수에 추가
	// 매개변수로 ArrayList를 받아서 입력받은 id,pw가 둘다 일치하는 애를 찾아서 해당 DTO를 리턴
	public MemberDTO memberLogin(ArrayList<MemberDTO> ar) {
		MemberDTO memberDTO = new MemberDTO();

		System.out.println("ID를 입력하세요.");
		memberDTO.setId(sc.next());
		System.out.println("PW를 입력하세요.");
		memberDTO.setPw(sc.next());
		MemberDTO result = null;

		for (int i = 0; i < ar.size(); i++) {
			if (memberDTO.getId().equals(ar.get(i).getId()) && memberDTO.getPw().equals(ar.get(i).getPw())) {
				result = ar.get(i);
				break;
			}
		}
		return result;
	}

}
