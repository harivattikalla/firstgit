package com.iq.test;

public class StringPermutations {
	public static void main(String[] args) {
		permutation("abc");
	}
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	public static void permutation(String prefix,String data) { 
		
		int n=data.length();
		if(n==0)
			System.out.println(prefix);
		else {
			for(int i=0;i<data.length();i++) {
				
				permutation(prefix+data.charAt(i),data.substring(0,i)+data.substring(i+1,n));
			}
			
		}
	}
}
/*
a,bc
ab,c
abc,0


b,ac
ba,c
bac,0

c,ab
ca,b
cab,0






*/