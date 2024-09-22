package org.emp;

import org.company.*;
import org.client.*;
import org.project.*;

public class Employee {
	public void empName() {
		System.out.println("Suresh");
	}
	
	public static void main (String[]args) {
		Employee e = new Employee();
		e.empName();
		
		Company c = new Company();
		c.companyName();
		
		Client c1 = new Client();
		c1.clientName();
		
		Project p = new Project();
		p.projectName();
	}

}
