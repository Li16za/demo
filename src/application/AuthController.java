package application;

import java.net.URL;
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

 
    }	

    @FXML
    void initialize() {
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'auth.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'auth.fxml'.";
        assert singIn != null : "fx:id=\"singIn\" was not injected: check your FXML file 'auth.fxml'.";

    }

}
