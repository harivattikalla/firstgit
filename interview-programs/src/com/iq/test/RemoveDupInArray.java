package com.iq.test;

import java.util.Arrays;

public class RemoveDupInArray {
public static void main(String[] args) {
	String [] name= {"hari","yadav","hari","yada","yadav"};
	String [] temp=new String[name.length];
	
	Arrays.sort(name);
	int j=0;
	//hari hari yada yadav yadav
	for(int i=0;i<name.length-1;i++) {
		if(name[i]!=name[i+1]) {
			temp[j]=name[i];
			++j;
		}
	}
	
	temp[j]=name[name.length-1];
	for(int i=0;i<temp.length-1;i++) {
		System.out.println(temp[i]);
	}
}
	
}
