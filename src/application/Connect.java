package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
public Connection databaseLink;
	
	public Connection getConnection(){
		
		String databaseName="prokat";
		String databaseUser="admin";
		String databasePassword="Password01!";
		String url = "jdbc:mysql://localhost:3306/"+databaseName;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			databaseLink = DriverManager.getConnection(url, databaseUser,  databasePassword);
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return databaseLink;
	}
}
