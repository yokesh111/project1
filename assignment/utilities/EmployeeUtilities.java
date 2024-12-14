package com.yokesh.assignment.utilities;

import java.util.Scanner;
import com.yokesh.assignment.employees.Developer;
import com.yokesh.assignment.employees.Manager;

public class EmployeeUtilities {
	
	Developer dev1 = new Developer();
	Manager manager1 = new Manager();
	

	Scanner sc = new Scanner(System.in);
	
	
	public EmployeeUtilities(String choice) {
		
		if(choice.equals("developer")) {
			developerDetails();
			printDeveloperDetails();
		}
		else if(choice.equals("manager")) {
			managerDetails();
			printManagerDetails();
		}
		
		else {
			System.out.println("Enter correct choice");
		}
	}
	 
	
	public void managerDetails() {
		
		System.out.print("Enter Name =");
		manager1.setName(sc.nextLine());
		
		System.out.print("Enter Employee ID =");
		manager1.setEmployeeId(sc.next());
		
		System.out.print("Enter Salary =");
		manager1.setSalary(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Enter your Position =");
		manager1.setPosition(sc.nextLine());
		
		System.out.print("Enter Branch name = ");
		manager1.setBranch(sc.next());
		
		System.out.println();
	
	}
	
	public void developerDetails() {
		
		System.out.print("Enter Name  = ");
		dev1.setName(sc.nextLine());
		
		System.out.print("Enter your ID =");
		dev1.setEmployeeId(sc.next());
		
		System.out.print("Enter your salary =");
		dev1.setSalary(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Enter your Role =");
		dev1.setRole(sc.nextLine());
		
		System.out.print("Enter your Skill =");
		dev1.setSkills(sc.nextLine());
		 
		System.out.println();
	}
	
	public void printDeveloperDetails() {
		System.out.println(dev1);
	}
	public void printManagerDetails() {
		System.out.println(manager1);
	}
	   

}
