package com.iq.test;

public class Palindrome {
public static void main(String[] args) {
	
		int n = 454;
		int temp=n;
		int sum=0;
		
		while(n>0) {
			int r=n%10;//4 5 4
			sum=(sum*10)+r;// 4 45 454
			n=n/10;//45 4 0
		}
		if(temp==sum) {
			System.out.println("pal");
		}
}

public static void m1(int n) {
	String val=String.valueOf(n);
	int len=val.length();
	String reverse = "";
	for(int i=len-1;i>=0;i--) {
		reverse=reverse+val.charAt(i);
	}
	if(val.equals(reverse)) {
		System.out.println("palindrome");
	}
}


}
