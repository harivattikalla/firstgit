package com.iq.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort{
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(45,5787,4874,548,248,7878);
	//Collections.sort(list);
	Collections.sort(list,(c1,c2)->-c1.compareTo(c2));
	System.out.println(list);
}




}
