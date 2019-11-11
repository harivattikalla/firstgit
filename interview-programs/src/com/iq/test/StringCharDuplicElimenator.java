package com.iq.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringCharDuplicElimenator {

	public static void main(String[] args) {
		String val="hari krishna";
		Set<Character> set=new LinkedHashSet<Character>();
		String modiVal="";
		String[] words=val.split(" ");
        for(String word: words) {		
        	modiVal=modiVal+word;
        }
		for(int i=0;i<modiVal.length();i++) {
			set.add(modiVal.charAt(i));
		}
		
		System.out.println(set);
	}
}
