package com.cg.exception.service;

import com.cg.exception.InvalidAgeException;
import com.cg.exception.InvalidSalaryFoundException;
import com.cg.exception.NameNotFoundException;

public interface EmployeeService {
	    void getAge(int age)throws InvalidAgeException;
        void getName(String firstName,String lastName) throws NameNotFoundException;
        void getSalary(double salary)throws InvalidSalaryFoundException;
}
