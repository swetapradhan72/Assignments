package com.cg.eis.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

public class EmployeeServiceimpl implements EmployeeService  {
         private List<Employee> employeeRepository;
         private String insurancescheme;
         
         public EmployeeServiceimpl() {
        	 employeeRepository= new ArrayList<>();
  
         }
	
    @Override
	public void getEmployeeDetails(String name, int id, double salary, String designation) {
		Employee newEmp= null;
		employeeRepository.add(newEmp);
		
	}


	@Override
	public void employeeInsuranceScheme(double salary, String designation) {
		if(salary<=30000||salary>30000) {
			 if(designation=="Senior Analyst") {
				 insurancescheme="Scheme-A";
			 }else if(designation=="Analyst") {
				 insurancescheme="Scheme-B";
			 }else if(designation=="system Assosiate") {
				 insurancescheme="Scheme-C";
			 }
		}
		 System.out.println("Your Insurance scheme is :"+insurancescheme);
		 
		
	}

	@Override
	public Employee displayDetails(String namme, int id, double salary, String designation, String insuranceScheme) {
		
		return (Employee) employeeRepository;
		
		
	}

	@Override
	public List<Employee> showAllEmployee() {
		return employeeRepository;
	}
  
}
