package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionController {
	static Connect con;
	 public static void MakeTransaction ( String SqlStatement) {
	        try (Connection connection = con.getConnection();
	             Statement statement = connection.createStatement();) {
	            statement.executeUpdate(SqlStatement);
	        } catch (SQLException e) {
	             System.out.println(e.getMessage());
	        }
}
	 }
