package com.cg.demo.basic;

class Employee {

	int id;
	String name;
	double salary;

	public Employee() {
		System.out.println("Constructor");
	}

	void work() {
		System.out.println("Employee works...");
	}

	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}