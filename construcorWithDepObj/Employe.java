package com.spring.construcorWithDepObj;

public class Employe {
	
	private int id;
	private String name;
	private Address address;

	public Employe() {System.out.println("def cons");}

	public Employe(int id, String name, Address address) {
	 super();
	 this.id = id;
	 this.name = name;
	 this.address = address;
	}
	 public void show(){
		 System.out.println("EmployeeId : " +id);
		 System.out.println("EmployeeName :" +name);
		// System.out.println("Employeeaddress : " +address);
	 System.out.println(address.toString());
	}
	}

