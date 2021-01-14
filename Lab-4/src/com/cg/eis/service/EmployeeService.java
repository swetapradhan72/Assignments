package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	/***
	 * 
	 * @param name of Employee
	 * @param id of Employee
	 * @param salary of Employee
	 * @param designation of Employee
	 */
       void getEmployeeDetails(String name,int id,double salary,String designation);
       /**
        * 
        * @param salary of Employee to know the Insurance Scheme
        * @param insuranceScheme for Employee
        */
       void employeeInsuranceScheme(double salary, String designation);
       /**
        * 
        * @param name of Employee
        * @param id of Employee
        * @param salaryof Employee
        * @param designation of Employee
        * @param insuranceScheme for  Employee
        */
       Employee displayDetails(String name,int id,double salary,String designation,String insuranceScheme);
       
       List<Employee> showAllEmployee();
	
}
