package com.cg.exception.serviceimpl;

import com.cg.exception.InvalidAgeException;
import com.cg.exception.InvalidSalaryFoundException;
import com.cg.exception.NameNotFoundException;
import com.cg.exception.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void getAge(int age) throws InvalidAgeException {
		if(age<15) {
			throw new  InvalidAgeException("Age is below 15");
		}
		System.out.println("Age :"+age);
		
	}

	@Override
	public void getName(String firstName, String lastName) throws NameNotFoundException {
		if(firstName==null || lastName==null) {
			throw new  NameNotFoundException("Name not Found");
		}
		System.out.println("First Name :"+firstName);
		System.out.println("Last Name  :"+lastName);
		
	}

	@Override
	public void getSalary(double salary) throws InvalidSalaryFoundException {
		if(salary<3000) {
			throw new InvalidSalaryFoundException("Invalid Salary");
		}
		System.out.println("Employee salary :"+salary);
		
	}

}
