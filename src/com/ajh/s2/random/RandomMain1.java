package com.ajh.s2.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class RandomMain1 {
	public static void main(String[] args) {
		Random random = new Random();

//		int num = random.nextInt(10);
//		System.out.println(num);

		Lotto lotto = new Lotto();

		ArrayList<Integer> ar = lotto.makeLotto();

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(i + 1 + "번째 숫자 : " + ar.get(i));
		}

		HashSet<Integer> hashSet = lotto.makeLotto2();
		Iterator<Integer> it = hashSet.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		

	}

}
