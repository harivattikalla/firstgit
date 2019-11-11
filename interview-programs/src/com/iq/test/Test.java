package com.iq.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		/*
		 * String s1="hari"; String s2="hari";
		 */

		/*
		 * String s1 = new String("hari"); String s2 = new String("hari");
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 */

		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("yadav", 1);
		hashMap.put("krishna", 2);
		hashMap.put("hari", 3);
		hashMap.put("vattikalla", 4); 
		//System.out.println(hashMap.get(null));
		//hashMap.forEach((a,b)->System.out.println("key ::"+a+"   value:"+b));
		/*
		 * Set<Entry<String, Integer>> entrys=hashMap.entrySet();
		 * for(Entry<String,Integer> entry:entrys) {
		 * System.out.print("key ::"+entry.getKey());
		 * System.out.println("---->>>  Value ::"+entry.getValue()); }
		 */
		
		twoListKeyValueFromMap(hashMap);
		
	}

	public static int cal(int a) {
		if (a == 0)
			return 0;
		return a + cal(a - 5);

	}
	
	public static void twoListKeyValueFromMap(Map<String,Integer> map) {
		ArrayList<String> keys=new ArrayList<>(map.keySet());
		ArrayList<Integer> values=new ArrayList<>(map.values());
		System.out.println("Keys ="+keys);
		System.out.println("values ="+values);
		
	}
	
public static void stringBuilder() {
	StringBuilder builder=new StringBuilder();
	builder.append("hari").append("krishna").append("yadav").append("vlp");
	StringBuffer buffer=new StringBuffer();
	buffer.append("hari").append("krishna").append("yadav").append("vlp");
	
}
}
