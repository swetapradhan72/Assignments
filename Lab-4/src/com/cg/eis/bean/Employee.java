package com.cg.eis.bean;

public class Employee {
	/**
	 * id of Employee
	 */
      private int id;
      /**
       * salary of Employee
       */
      private double salary;
      /**
       * Name of employee
       */
      private String name;
      /**
       * Designation of Employee
       */
      private String designation;
     
      
      public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	/**public Employee(String name,int id,double salary,String designation) {
		super();
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.designation=designation;
		
	}**/
	public Employee() {
		
	}
	
      
}
