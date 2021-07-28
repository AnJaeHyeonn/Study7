package com.ajh.s2.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain1 {
	public static void main(String[] args) {
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(1);
		hashSet.add(200);
		hashSet.add(1);
		
		System.out.println(hashSet);		
		System.out.println(hashSet.size());
		
		// 전체 출력은 가능
		Iterator<Integer> it =  hashSet.iterator();
		
		 while (it.hasNext()) {
			 Integer num = it.next();
			 System.out.println(num);
		 }
				
	}

}
