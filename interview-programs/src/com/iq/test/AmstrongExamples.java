package com.iq.test;

public class AmstrongExamples {
        public static void main(String[] args)  {  
        int count=0;
        int n=153;
        int tem=n;
        while(n>0) {
        	int r=n%10;
        	count=count+(r*r*r);
        	n=n/10;
      }  
        
        if(tem==count) {
        	System.out.println("amstrong number");
        }
        }
        
        
}
