package com.maming.scala_study.common;

import java.text.NumberFormat;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class Test {

	public void test1(){
		int offset = 1;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumIntegerDigits(20);
	    nf.setMaximumFractionDigits(0);
	    nf.setGroupingUsed(false);
	    System.out.println(nf.format(offset));
	    System.out.println("00000000000000000001".length());
	}
	
	public void test2(){
		ConcurrentNavigableMap<Integer,String> map = new ConcurrentSkipListMap<Integer,String>();
		map.put(1, "111");
		map.put(3, "333");
		map.put(7, "777");
		map.put(5, "555");
		
		
		System.out.println(map.subMap(1, true, 7, false));//{1=111, 3=333, 5=555}
		System.out.println(map.subMap(1, true, 7, true));//{1=111, 3=333, 5=555, 7=777}
		
		System.out.println(map.subMap(2, true, 7, false));//{3=333, 5=555}
		System.out.println(map.subMap(2, true, 7, true));//{3=333, 5=555, 7=777}
		
		System.out.println(map.headMap(2));//{1=111}
		System.out.println(map.headMap(3));//{1=111}
		System.out.println(map.headMap(1));//{}
		
		System.out.println(map.floorKey(2));//1
		System.out.println(map.floorKey(3));//3
		System.out.println(map.floorKey(0));//null
		
		System.out.println(map.lastEntry().getValue());//777
		
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.test2();
	}
}
