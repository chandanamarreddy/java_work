package Groceries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import JDBC.Employee;

public class FruitsDAO {

	String url = "jdbc:mysql://localhost:3306/java";
	String username = "root";
	String password ="Chandana_1";
	
	
	public void createFruits(Fruits Fruits) { 
		
		
		try {
			
			Connection connection = DriverManager.getConnection(url,username,password);
			
			String query = "insert into fruits values(?,?,?,?)";
			PreparedStatement pStatement =connection.prepareStatement(query);
			pStatement.setInt(1, Fruits.getId());
			pStatement.setString(2, Fruits.getType());
			pStatement.setString(3, Fruits.getQty());
			pStatement.setDouble(4, Fruits.getPrice());
			
			int result=pStatement.executeUpdate();
			
			if(result>0) {
				 System.out.println("Fruits created");
				 
			}else {
				System.out.println("Fruits not created");
				
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
			
			
		}
		
	}


}
