package com.iq.test;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String str1="java";
	String str2="avaj";
	System.out.println("both anagram :"+isAnagram(str1, str2));
}

public static boolean isAnagram(String str1,String str2) {
	char[] c1=str1.toCharArray();
	char[] c2=str2.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	return Arrays.equals(c1, c2);
}


}
