package com.iq.test;

public class Customer {
	private int cId;
	private String name;

	public Customer(int cId, String name) {
		super();
		this.cId = cId;
		this.name = name;
	}

	@Override
	public boolean equals(Object arg0) {
	  return true;
	}

	
	
	  
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", name=" + name + "]";
	}

}
