package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AuthController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    private Button singIn;

    @FXML
    void SingIn(ActionEvent event) {
    	 Connect con;	
    	 ArrayList<Sotrudniki> users = new ArrayList<Sotrudniki>();
   	        try (Connection connection = con.getConnection();
   	             Statement statement = connection.createStatement();) {
   	        	String selectSql = "SELECT * from ";
   	            ResultSet rs1 = statement.executeQuery(selectSql);
   	         while (rs1.next()) {
                 users.add(new Sotrudniki());
             }
   	            } catch (SQLException e) {
   	             System.out.println(e.getMessage());
   	        }
 
    }	

    @FXML
    void initialize() {
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'auth.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'auth.fxml'.";
        assert singIn != null : "fx:id=\"singIn\" was not injected: check your FXML file 'auth.fxml'.";

    }

}
