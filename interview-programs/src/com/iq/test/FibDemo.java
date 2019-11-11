package com.iq.test;

import java.util.Scanner;

public class FibDemo {
public static void main(String[] args) {
	
	// 0 1 1 2 3 5 8 13 21 34 55 89
  
	
	int n=10;
	int temp1=0;
	int temp2=1;
		
		// Display Fibonacci Series
		for (int i = 1; i <= n; ++i) {
			System.out.print(temp1 + "   ");
			int sum = temp1 + temp2;
			temp1 = temp2;
			temp2 = sum;

		}
		// Display Fibonacci Series
		 temp1=0;
		 temp2=1;
		int i = 1;
		while (i <= n) {
			System.out.print(temp1 + "  ");
			int sum = temp1 + temp2;
			temp1 = temp2;
			temp2 = sum;
			++i;
		}
	
	
	//Display Fibonacci series upto a given number
		 temp1=0;
		 temp2=1;
	while(temp1<=n) {
		System.out.print(temp1+"  ");
		int sum=temp1+temp2;
		temp1=temp2;
		temp2=sum;
	}
	
}
}
