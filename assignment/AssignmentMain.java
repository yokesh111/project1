package com.yokesh.assignment;
import java.util.Scanner;
import com.yokesh.assignment.utilities.*;

public class AssignmentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the option , developer or  manager =");
		new EmployeeUtilities(sc.next());
		

	}

}
