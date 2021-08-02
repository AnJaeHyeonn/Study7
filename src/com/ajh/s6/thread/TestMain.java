package com.ajh.s6.thread;

public class TestMain {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();

		t1.run();
		t2.run();
	}

}
