package com.ajh.s5.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cient1 {

	public static void main(String[] args) {
		// Client 용
		// Ip + port
		Socket sc = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			try {
				sc = new Socket("59.15.163.216", 8282);
				System.out.println("서버와 접속이 성공");

				// 서버로 메세지 전송
				System.out.println("서버로 보낼 메세지 입력");
				String message = scanner.nextLine();

				// byte 처리
				os = sc.getOutputStream();

				// 문자 처리
				ow = new OutputStreamWriter(os);

				// 문자열 처리
				bw = new BufferedWriter(ow);

				bw.write(message + "\r\n");
				bw.flush();
				System.out.println("서버로 전송 성공");

				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);

				String message1 = br.readLine();

				System.out.println("서버에서 보낸 메세지");
				System.out.println("Sever : " + message1);
				if (message1.equals("q") || message1.equals("Q")) {
					System.out.println("while문 종료");
					flag = !flag;
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

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
