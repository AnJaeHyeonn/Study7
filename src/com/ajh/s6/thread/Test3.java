package com.ajh.s6.thread;

public class Test3 implements Runnable {

	@Override
	public void run() {
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.println((char) i);
		}
	}

}
