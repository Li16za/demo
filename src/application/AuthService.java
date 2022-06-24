package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import application.db.*;

public class AuthService {

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
        Connect connects = new Connect();
        try (Connection connection = connects.getConnection();
                Statement statement = connection.createStatement();) {
            String selectSql1 = "SELECT role from sotrudniki where login = '" + login.getText() + "' and password = '"
                + password.getText() + "'";
            ResultSet result = statement.executeQuery(selectSql1);
            result.next();
            Node source = (Node) event.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            if (result.getInt(1) == 6) {
                AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("menuAdmin.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("точка проката ЦПКиО им. С.М. Кирова");
                stage.setResizable(true);
                stage.show();
            }
            else if  (result.getInt(1) == 4) {
                AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("menuSellman.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("точка проката ЦПКиО им. С.М. Кирова");
                stage.setResizable(true);
                stage.show();
            }
            else if  (result.getInt(1) == 5) {
                AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("menuShiftSupervisor.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("точка проката ЦПКиО им. С.М. Кирова");
                stage.setResizable(true);
                stage.show();
            }
            else {
            	Alert alert = new Alert(AlertType.ERROR);
            	alert.setTitle("Ошибка");
        		alert.setHeaderText("Невозможно авторизоваться");
        		alert.setContentText("Проверьте правильность ввода логина и пароля");
        		alert.showAndWait();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            Alert alert = new Alert(AlertType.ERROR);
        	alert.setTitle("Ошибка");
    		alert.setHeaderText("Невозможно авторизоваться");
    		alert.setContentText("Проверьте правильность ввода логина и пароля");
    		alert.showAndWait();
        }
    }

    @FXML
    void initialize() {
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'auth.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'auth.fxml'.";
        assert singIn != null : "fx:id=\"singIn\" was not injected: check your FXML file 'auth.fxml'.";

    }

}
