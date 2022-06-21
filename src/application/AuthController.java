package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
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
        ArrayList<Sotrudniki> sotrudniki = new ArrayList<Sotrudniki>();
        System.out.println(login);
        System.out.println(password);
        Connect connects = new Connect();
        try (Connection connection = connects.getConnection();
                Statement statement = connection.createStatement();) {
            String selectSql = "SELECT * from sotrudniki";
            ResultSet result = statement.executeQuery(selectSql);
            while (result.next()){
                sotrudniki.add(new Sotrudniki( result.getInt(1), result.getString(2),result.getInt(3), result.getString(4),result.getString(5), last_sing_in, type_sign_in));
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
