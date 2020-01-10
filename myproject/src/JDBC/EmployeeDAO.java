package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDAO {
	
	String url = "jdbc:mysql://localhost:3306/java";
	String username = "root";
	String password ="Chandana_1";

	public void createEmployee(Employee Employee) { 
		
		
		try {
			
			Connection connection = DriverManager.getConnection(url,username,password);
			
			String query = "insert into employee values(?,?,?,?)";
			PreparedStatement pStatement =connection.prepareStatement(query);
			pStatement.setInt(1, Employee.getEno());
			pStatement.setString(2, Employee.getName() );
			pStatement.setString(3, Employee.getGender());
			pStatement.setDouble(4, Employee.getSal());
			
			int result=pStatement.executeUpdate();
			
			if(result>0) {
				 System.out.println("Employee created");
				 
			}else {
				System.out.println("Employee not created");
				
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
			
			
		}
		
	}

	public void updateEmployee(Employee emp) {

		try {
		Connection connection = DriverManager.getConnection(url,username,password);
		
		String query = "update employee set salary = salary + ? where eno = ?";
		PreparedStatement pStatement=connection.prepareStatement(query);
		pStatement.setDouble(1, emp.getSal());
		pStatement.setInt(2,emp.getEno());
		
		int result=pStatement.executeUpdate();
		
		if(result>0) {
			 System.out.println("Employee updated");
			 
		}else {
			System.out.println("Employee not updated");
			
		}
		
	}catch (Exception e) {
		e.printStackTrace();
		
	}
}
	public void deleteEmployee(int eno) {
		
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			
			String query = "delete from employee where eno = ?";
			PreparedStatement pStatement=connection.prepareStatement(query);
			pStatement.setInt(1,eno);
			
			int result=pStatement.executeUpdate();
			
			if(result>0) {
				 System.out.println("Employee deleted");
				 
			}else {
				System.out.println("Employee not existing");
				
			}
			}catch (Exception e) {
			e.printStackTrace();
			}
	}
	public void getAllEmployees() {
		

		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			
			String query = "Select * from employee";
			PreparedStatement pStatement=connection.prepareStatement(query);
			
			ResultSet resultSet= pStatement.executeQuery();
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt("eno")+"\t"+ resultSet.getString("name")+"\t"+ resultSet.getString("gender")+"\t"+ resultSet.getDouble("salary") );
			}
			
		
			}catch (Exception e) {
				e.printStackTrace();
				}
	}
}
