package com.cg.eis.pl;

import java.util.List;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.serviceimpl.EmployeeServiceimpl;


public class EmployeeUtil {
	Scanner sc=new Scanner(System.in);
  private EmployeeService empservice;
  
  public EmployeeUtil() {
	  empservice= new EmployeeServiceimpl();
  }
  
  public void start() {
	  showEmployeeMenu();
	  int choice;
	  String contiChoice;
	  do
	  {
		  Employee emp= new Employee();
	  System.out.println("Enter Your Choice");
	  choice=sc.nextInt();
	  switch(choice) {
	  case 1:
		  System.out.println("Enter your name : ");
		   emp.setName(sc.next());
		  System.out.println("Enter your id :");
		  emp.setId(sc.nextInt());
		  System.out.println("Enter your Salary :");
		  emp.setSalary(sc.nextInt());
		  System.out.println("Enter your Designation :");
		  emp.setDesignation(sc.next());
		  System.out.println("Successfully Account Created");
		  
          break;
	  case 2:
		 System.out.println("Enter your salary :");
		  emp.setSalary(sc.nextInt());
		  System.out.println("Enter your Designation :");
		  emp.setDesignation(sc.next());
		  empservice.employeeInsuranceScheme(emp.getSalary(),emp.getDesignation());
		  break;
	  case 3:
		  List<Employee> emp1 =  empservice.showAllEmployee();
		  for(Employee employee : emp1)
		  {
			  System.out.println(" Employee Name : "+employee.getName()+"=" +employee.getId()+"="+employee.getSalary()+"="+employee.getDesignation());
			  
		  }
		  break;
	  case 0:
			System.out.println("------0. Exit--------");	
			System.exit(0);
			break;

		default:
			System.out.println("---------Wrong Choice----------");
			break;
		}
		System.out.println("Do you want to continue : (yes | no) : ");
		 contiChoice = sc.next();
	}
	 while(contiChoice.equalsIgnoreCase("yes"));
	

  }

    private void showEmployeeMenu() {
    	System.out.println("----------Employee Menu------------");
		System.out.println("1. Give Employee Details  ");
		System.out.println("2. Employee Insurance Scheme");
		System.out.println("3. Display Details ");
		System.out.println("0. Exit");
	
   }
}
