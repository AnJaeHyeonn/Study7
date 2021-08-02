package com.ajh.s5.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Server2 {
	public static void main(String[] args) {

		ArrayList<String> lunch = new ArrayList<String>();
		lunch.add("김치찌개");
		lunch.add("오므라이스");
		lunch.add("샌드위치");
		lunch.add("치즈라면");
		lunch.add("먹다남은 치킨");
		lunch.add("비빔밥");

		ArrayList<String> dinner = new ArrayList<String>();
		dinner.add("치킨");
		dinner.add("피자");
		dinner.add("족발");
		dinner.add("수육");
		dinner.add("보쌈");
		dinner.add("집밥");

		// 1. 클라이언트 접속 준비
		// 2. 클라이언트와 접속 성공
		// 3. 클라이언트로 메세지 수신
		// 1이면 점심메뉴 중에서 하나를 전송
		// 2이면 저녁메뉴 중에서 하나를 전송
		// 3이면 프로그램 종료

		ServerSocket ss = null;
		Socket sc = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Random rd = null;

		try {
			ss = new ServerSocket(8282);
			System.out.println("Client 접속 기다리는 중");

			sc = ss.accept();
			System.out.println("Client와 연결 성공");

			boolean check = true;

			while (check) {

				Calendar calendar = Calendar.getInstance();
				rd = new Random(calendar.getTimeInMillis());

				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);

				String select = br.readLine();
				int num = Integer.parseInt(select);
//				int num = Character.getNumericValue(br.read());
//				System.out.println(num);

				System.out.println(num);

				if (num == 1) {
					os = sc.getOutputStream();
					ow = new OutputStreamWriter(os);
					bw = new BufferedWriter(ow);
					bw.write(lunch.get(rd.nextInt(lunch.size())) + "\r\n");
					bw.flush();
				} else if (num == 2) {
					os = sc.getOutputStream();
					ow = new OutputStreamWriter(os);
					bw = new BufferedWriter(ow);
					bw.write(dinner.get(rd.nextInt(dinner.size())) + "\r\n");
					bw.flush();
				} else {
					System.out.println("종료");
					break;
				}

			} // while의 끝

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();

				bw.close();
				ow.close();
				os.close();

				sc.close();

				ss.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
