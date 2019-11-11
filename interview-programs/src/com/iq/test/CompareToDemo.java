package com.iq.test;

public class CompareToDemo {
	public static void main(String[] args) {

		String s1 = "hgello";
		String s2 = "haeallo";
		String s3 = "hafari";
		String s4 = "ayaadav";
		String s5 = "afhello";
		String s6 = "";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareTo(s6));
		  
		/*
		 * StringBuffer buffer=new StringBuffer("hari"); StringBuffer buffer1=new
		 * StringBuffer("hari"); StringBuffer buffer2=new StringBuffer("hari");
		 * StringBuffer buffer3=new StringBuffer("hari"); StringBuffer
		 * buffer4=buffer.append(buffer1).append(buffer2).append(buffer3);
		 * System.out.println(buffer4); String
		 * s7=s1.concat(s2).concat(s3).concat(s4).concat(s5).concat(s6);
		 * System.out.println(s7);
		 */
		 

	}
}
