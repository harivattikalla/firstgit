package com.iq.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {
	

public static void main(String[] args) {

		/*
		 * Map hashtable = new HashMap<>();
		 * 
		 * System.out.println(hashtable.put(1,"hari"));
		 * System.out.println(hashtable.put(1,"krishna"));
		 * System.out.println(hashtable.put(1,"yadav"));
		 * System.out.println(hashtable.put(null,"hari"));
		 * System.out.println(hashtable); System.out.println(hashtable.size());
		 * 
		 * HashSet hashSet=new HashSet<>(); System.out.println(hashSet.add(null));
		 * System.out.println(hashSet.add(null)); System.out.println(hashSet.add(null));
		 * System.out.println(hashSet);
		 */
	
	
		/*
		 * Hashtable hashSet=new Hashtable(); hashSet.put(1, "hari"); hashSet.put(null,
		 * ""); System.out.println(hashSet);
		 */
	//double d=3*0.1;
		/*
		 * System.out.println(3*0.1); System.out.println(3*0.1==0.3);
		 */
	
		/*
		 * HashMap<Integer,String> hashMap=new HashMap<>(); hashMap.put(1, "hari");
		 * hashMap.put(2, "hari"); hashMap.put(3, "hari"); hashMap.put(4, "hari");
		 * hashMap.put(5, "hari"); hashMap.put(6, "hari"); hashMap.put(7, "hari");
		 * hashMap.put(8, "hari"); hashMap.put(23, "hari"); hashMap.put(24, "hari");
		 * hashMap.put(17, "hari"); hashMap.put(20, "hari");
		 */
	//System.out.println(hashMap);
	//{1=hari, 17=hari, 2=hari, 3=hari, 4=hari, 20=hari, 5=hari, 6=hari, 7=hari, 23=hari, 8=hari, 24=hari}
	Hashtable<Integer,String> hashMap=new Hashtable<>();
	hashMap.put(1, "hari");
	hashMap.put(2, "hari");
	hashMap.put(3, "hari");
	
	hashMap.put(8, "hari");
	
	hashMap.put(17, "hari");
	hashMap.put(20, "hari");

	
	System.out.println(hashMap);
	//{20=hari, 8=hari, 17=hari, 3=hari, 2=hari, 1=hari}
}

}
