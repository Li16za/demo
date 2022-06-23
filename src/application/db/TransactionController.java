package application.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionController {
	static Connect connects = new Connect();
	 public static void MakeTransaction ( String SqlStatement) {
	        try (Connection connection = connects.getConnection();
	             Statement statement = connection.createStatement();) {
	            statement.executeUpdate(SqlStatement);
	        } catch (SQLException e) {
	             System.out.println(e.getMessage());
	        }
}
	 }
