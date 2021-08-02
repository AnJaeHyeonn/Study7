package com.ajh.s4.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileReader1 {
	public static void main(String[] args) {
		File file = new File("c:\\test", "name.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			ArrayList<FileMember> ar = new ArrayList<FileMember>();
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				FileMember fileMember = new FileMember();
				// 파싱 작업
				// 1. split
				String[] ar2 = str.split(",");

				fileMember.setId(ar2[0].toString());
				fileMember.setPw(ar2[1].toString());
				fileMember.setAge(Integer.parseInt(ar2[2]));

				// 2.StringTokenzier
				StringTokenizer st = new StringTokenizer(str, ",");
				fileMember.setId(st.nextToken());
				fileMember.setPw(st.nextToken());
				fileMember.setAge(Integer.parseInt(st.nextToken()));

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
		} finally {
			// 자원 해재
			// 자원과 연결된 역순으로 해제
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
