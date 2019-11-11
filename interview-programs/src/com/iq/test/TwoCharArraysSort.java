package com.iq.test;

import java.util.Arrays;
import java.util.Collections;

public class TwoCharArraysSort {
public static void main(String[] args) {
	int[] c1= {1,4,3,2};
	int[] c2= {5,8,7,6};
	
	int[] c3=new int[c1.length+c2.length];	
	int j=0;
	merge(c1,j,c3);
	merge(c2,c1.length,c3);
	Arrays.sort(c3);
	for(int i=c3.length-1;i>=0;i--) {
		
		System.out.println(c3[i]);
	}

}

public static void merge(int[] i,int j,int[] c3) {
	for(int c:i) {
		c3[j]=c;
		j++;
	}
}


}
