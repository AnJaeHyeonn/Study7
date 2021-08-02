package com.ajh.s5.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
	public static void main(String[] args) {

		// 1. 서버 접속

		// 2. 1.점심메뉴 2.저녁메뉴 3.종료// Client 용
		// Ip + port
		Socket sc = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Scanner scanner = new Scanner(System.in);

		try {
			sc = new Socket("59.15.163.216", 8282);
			System.out.println("서버와 접속이 성공");

			boolean check = true;

			while (check) {

				// 서버로 메세지 전송
				System.out.println("1.점심메뉴 \t 2.저녁메뉴 \t 3.종료");
				int select = scanner.nextInt();

				// byte 처리
				os = sc.getOutputStream();

				// 문자 처리
				ow = new OutputStreamWriter(os);

				// 문자열 처리
				bw = new BufferedWriter(ow);

				bw.write(select + "\r\n");
				bw.flush();
				System.out.println("서버로 전송 성공");

				if (select > 2) {
					System.out.println("종료");
					break;
				}

				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);

				String message = br.readLine();
				System.out.println("메뉴 : " + message);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();

				sc.close();
				scanner.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
