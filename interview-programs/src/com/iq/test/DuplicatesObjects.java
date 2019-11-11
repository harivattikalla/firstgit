package com.iq.test;

public class DuplicatesObjects {
public static void main(String[] args) {
	
	Employee employee1=new Employee(123, "hari", "8686838511");
	Employee employee2=new Employee(123, "hari", "8686838511");
	System.out.println(employee1.hashCode());
	System.out.println(employee2.hashCode());
	//System.out.println(employee1.hashCode()==employee2.hashCode());
	System.out.println(employee1==employee2);
}
}

class Employee
{
	int empNo;
	String eName;
	String phoneNo;
	public Employee(int empNo, String eName, String phoneNo) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.phoneNo = phoneNo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		result = prime * result + empNo;
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		if (empNo != other.empNo)
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		return true;
	}
	
}