package com.cg.exception.util;

import java.util.Scanner;

import com.cg.exception.InvalidAgeException;
import com.cg.exception.InvalidSalaryFoundException;
import com.cg.exception.NameNotFoundException;
import com.cg.exception.serviceimpl.EmployeeServiceImpl;

public class EmployeeUtil {
    public void start() {
    	
    	Scanner sc=new Scanner(System.in);
    	try
    	{
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		System.out.println("Enter Your Name :");
		String firstName=sc.next();
		String lastName=sc.next();
		System.out.println("Enter Your Salary :");
		double salary=sc.nextDouble();
		 EmployeeServiceImpl empservice =new  EmployeeServiceImpl();
   
			empservice.getAge(age);
			empservice.getName(firstName,lastName);
			empservice.getSalary(salary);
          }
          catch(InvalidAgeException e) {
        	  System.out.println("Problem is :"+e.getMessage());
        	  System.exit(0);
          }
          catch(NameNotFoundException e) {
        	  System.out.println("Problem is :"+e.getMessage());
          }
          catch(InvalidSalaryFoundException e) {
        	  System.out.println("Problem is :"+e.getMessage());
          }

    }
}
