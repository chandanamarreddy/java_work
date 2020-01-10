package Groceries;

import java.util.Scanner;
import JDBC.Employee;
import JDBC.EmployeeDAO;

public class InsertTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Eneter id,type,qty,price");
		
		int id= scan.nextInt();
		String type =scan.next();
		String qty =scan.next();
		double price = scan.nextDouble();
		
		Fruits f= new Fruits(id,type,qty,price);
		
		FruitsDAO eDAO= new FruitsDAO();
		eDAO.createFruits(f);
		
		scan.close();
		
	}
}
