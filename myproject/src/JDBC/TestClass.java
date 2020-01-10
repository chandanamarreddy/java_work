package JDBC;

import java.util.Scanner;

public class TestClass {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Eneter eno,name,gender,sal");
		
		int eno= scan.nextInt();
		String name =scan.next();
		String gender =scan.next();
		double sal = scan.nextDouble();
		
		Employee emp= new Employee(eno,name,gender,sal);
		
		EmployeeDAO eDAO= new EmployeeDAO();
		eDAO.createEmployee(emp);
		
		
		
		
		scan.close();
		
		
		 
		
	}
}
