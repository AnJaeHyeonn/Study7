package com.ajh.s5.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Serever1 {
	public static void main(String[] args) {
		// Client 연결 요청이 오면 1:1 Socket을 생성해주는
		// Server Socket이 있음
		ServerSocket ss = null;
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
				ss = new ServerSocket(8282);
				System.out.println("Client 접속 기다리는 중");

				sc = ss.accept();
				System.out.println("Client와 연결 성공");

				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);

				String message = br.readLine();
				System.out.println("Client : " + message);
				if (message.equals("q") || message.equals("Q")) {
					System.out.println("while문 종료");
					flag = !flag;
				}

				System.out.println("클라이언트로 보낼 메세지 입력");
				message = scanner.nextLine();

				// byte 처리
				os = sc.getOutputStream();

				// 문자 처리
				ow = new OutputStreamWriter(os);

				// 문자열 처리
				bw = new BufferedWriter(ow);

				bw.write(message + "\r\n");
				bw.flush();

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

					ss.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
