package com.ajh.s4.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Iomain1 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);

		System.out.println("Start");
		try {
//			int num = is.read();
//			char ch = (char) num;

			String str = br.readLine();
			System.out.println(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Finish");
	}

}
