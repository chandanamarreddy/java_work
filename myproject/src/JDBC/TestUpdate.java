package JDBC;

import java.util.Scanner;

public class TestUpdate {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter eno and salary");
		
		int eno = scan.nextInt();
		double sal = scan.nextDouble();
		
		Employee emp =new Employee();
		emp.setEno(eno);
		emp.setSal(sal);
		
		EmployeeDAO eDAO = new EmployeeDAO();
		eDAO.updateEmployee(emp);
		
		scan.close();
		
		
		
	}

}
