package com.ajh.s6.thread;

public class Test1 extends Thread {

	@Override
	public void run() {
		// 동시에 진행 할 코드 작성

		for (int i = 'a'; i <= 'z'; i++) {
			System.out.println((char) i);
		}
	}

}
