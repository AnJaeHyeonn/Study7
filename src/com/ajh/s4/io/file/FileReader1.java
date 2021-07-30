package com.ajh.s4.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class FileReader1 {
	public static void main(String[] args) {
		File file = new File("c:\\test", "name.txt");

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			ArrayList<FileMember> ar = new ArrayList<FileMember>();
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				FileMember fileMember = new FileMember();
				// 파싱 작업
				String[] s = str.split(",");

				fileMember.setId(s[0].toString());
				fileMember.setPw(s[1].toString());
				fileMember.setAge(Integer.parseInt(s[2]));

				ar.add(fileMember);

			}

			for (int i = 0; i < ar.size(); i++) {
				System.out.println("아이디 : " + ar.get(i).getId());
				System.out.println("패스워드 : " + ar.get(i).getPw());
				System.out.println("나이 : " + ar.get(i).getAge());
				System.out.println("==========================");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
