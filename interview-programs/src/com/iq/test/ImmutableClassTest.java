package com.iq.test;

 final class ImmutableClass {

	private int empNo;
	
	public ImmutableClass(int empNo) {
		this.empNo = empNo;
	}
	public ImmutableClass modify(int empNo) {
		
		if(this.empNo==empNo) {
			return this;
		}
		
		return new ImmutableClass(empNo);
	}
	@Override
	public String toString() {
		return "ImmutableClass [empNo=" + empNo + "]";
	}
	
}


public class ImmutableClassTest{
	public static void main(String[] args) {
		ImmutableClass class1=new ImmutableClass(123);
		System.out.println(class1);
		ImmutableClass class2=class1.modify(124);
		System.out.println(class2);
	}
}
