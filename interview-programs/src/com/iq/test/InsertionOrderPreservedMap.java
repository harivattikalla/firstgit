package com.iq.test;

import java.util.LinkedHashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class InsertionOrderPreservedMap {
	public static void main(String[] args) {

		
		LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();
		hashMap.put(1, "hari");
		hashMap.put(13, "hari");
		hashMap.put(11, "hari");
		hashMap.put(11, "hari");
		hashMap.put(41, "hari");
		hashMap.put(12, "hari");
		System.out.println(hashMap);
		 
		SortedMap<Integer, String> sortedMap = new TreeMap<>();
		sortedMap.put(1, "hari");
		sortedMap.put(15, "hari");
		sortedMap.put(13, "hari");
		sortedMap.put(12, "hari");
		sortedMap.put(11, "hari");
		sortedMap.put(10, "hari");
		System.out.println(sortedMap);

	}
}
