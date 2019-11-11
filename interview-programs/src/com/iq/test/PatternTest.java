package com.iq.test;

public class PatternTest {
public static void main(String[] args) {
	int j=1;
	for(int i=1;i<=10;i++) {
		
         if(i!=1) {
			j++;
			if(j%2==1) {
				System.out.println(i);
				continue;
			}
			System.out.print(i);
			continue;
			}
         System.out.println(i);
		}
	}
}

