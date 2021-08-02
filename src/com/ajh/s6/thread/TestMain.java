package com.ajh.s6.thread;

public class TestMain {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		Test3 t3 = new Test3();
		Thread thread = new Thread(t3);

		t1.start();
		t2.start();
		thread.start();

	}

}
