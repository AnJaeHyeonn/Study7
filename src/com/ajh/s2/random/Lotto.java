package com.ajh.s2.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto {

	Random random;

	public Lotto() {
		random = new Random();
	}

	public HashSet<Integer> makeLotto2() {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		while (hashSet.size() != 6) {
			int num = random.nextInt(45) + 1;
			hashSet.add(num);
		}

		return hashSet;
	}

	public ArrayList<Integer> makeLotto() {
		// 1 - 45까지 랜덤한 숫자 6개
		// list에 추가하고 리턴

		ArrayList<Integer> ar = new ArrayList<Integer>();

		int num = 0;

		while (ar.size() < 6) {
			num = (random.nextInt(45) + 1);

			if (!ar.contains(num)) {
				ar.add(num);
			}

		}

		return ar;

	}

}
