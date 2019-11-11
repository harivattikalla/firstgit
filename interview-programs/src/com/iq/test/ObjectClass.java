package com.iq.test;

public class ObjectClass {
public static void main(String[] args) {
	
	Customer customer=new Customer(12345,"hari krishna");
	Class cust1=customer.getClass();
	Customer customer1=new Customer(12345,"hari krishna");
	Class cust2=customer1.getClass();
	System.out.println(customer.hashCode()==customer1.hashCode());
	System.out.println(customer.hashCode());
	System.out.println(customer1.hashCode());
	System.out.println(cust1.hashCode());
	System.out.println(cust2.hashCode());
	System.out.println(cust1==cust2);
}
}
