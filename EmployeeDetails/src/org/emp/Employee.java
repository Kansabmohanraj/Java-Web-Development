package org.emp;

public class Employee {
	private void empId () {
		System.out.println("786");
	}
	
	private void empName () {
		System.out.println("Kansab");
	}
	
	private void empDob () {
		System.out.println("17.01.2003");
	}
	
	private void empAddress () {
		System.out.println("karur");
	}
	
	private void empEmail () {
		System.out.println("kansab.mohanraj@gmail.com");
	}
	
	public static void main(String[]args) {
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empAddress();
		e.empEmail();
	}

}
