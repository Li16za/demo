package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import application.db.*;

public class addOrderController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AddOrder;

    @FXML
    private TextField code;

    @FXML
    private TextField dateClose;

    @FXML
    private TextField dateCreate;

    @FXML
    private TextField id;

    @FXML
    private TextField idClient;

    @FXML
    private Button singOut;

    @FXML
    private TextField status;

    @FXML
    private TextField timeOrder;

    @FXML
    private TextField timeProkata;

    @FXML
    void AddOrder(ActionEvent event) {
    	 if (id.getText().isEmpty() || code.getText().isEmpty() || dateCreate.getText().isEmpty() || timeOrder.getText().isEmpty() 
    	|| idClient.getText().isEmpty() || status.getText().isEmpty() || dateClose.getText().isEmpty() || timeProkata.getText().isEmpty() )	
    	{
    		Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Ошибка");
			alert.setHeaderText("Невозможно оформить заказ");
			alert.setContentText("Проверьте правильность заполнения полей");
			alert.showAndWait();
    	}
    	else {	
    	String insertQuery = "INSERT INTO prokat.order "
    			+ "	(id,\n"
    			+ "    	code,\n"
    			+ "    	cretion_date,\n"
    			+ "    	order_time,\n"
    			+ "    	id_client,\n"
    			+ "    	status,\n"
    			+ "    	close_date,\n"
    			+ "    	time_prokat)" +
                "values (\'" +
                id.getText()+ "\', \'" +
                code.getText()+ "\', \'" +
                dateCreate.getText()+ "\', \'" +
                timeOrder.getText()+ "\', \'" +
                idClient.getText() + "\', \'" +
                status.getText()+ "\', \'" +
                dateClose.getText()+ "\', \'" +
                timeProkata.getText()+ "\');";
        TransactionController.MakeTransaction(insertQuery);
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
    	AnchorPane root;
		try {
			root = (AnchorPane) FXMLLoader.load(getClass().getResource("menuSellman.fxml"));
			Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.setTitle("точка проката ЦПКиО им. С.М. Кирова");
	        stage.setResizable(true);
	        stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Ошибка");
			alert.setHeaderText("Невозможно оформить заказ");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		}
		}
    }

    @FXML
    void SingOut(ActionEvent event) {
    	Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
    	AnchorPane root;
		try {
			root = (AnchorPane) FXMLLoader.load(getClass().getResource("auth.fxml"));
			Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.setTitle("точка проката ЦПКиО им. С.М. Кирова");
	        stage.setResizable(true);
	        stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void initialize() {
        assert AddOrder != null : "fx:id=\"AddOrder\" was not injected: check your FXML file 'addOrder.fxml'.";
        assert code != null : "fx:id=\"code\" was not injected: check your FXML file 'addOrder.fxml'.";
        assert dateClose != null : "fx:id=\"dateClose\" was not injected: check your FXML file 'addOrder.fxml'.";
        assert dateCreate != null : "fx:id=\"dateCreate\" was not injected: check your FXML file 'addOrder.fxml'.";
        assert id != null : "fx:id=\"id\" was not injected: check your FXML file 'addOrder.fxml'.";
        assert idClient != null : "fx:id=\"idClient\" was not injected: check your FXML file 'addOrder.fxml'.";
        assert singOut != null : "fx:id=\"singOut\" was not injected: check your FXML file 'addOrder.fxml'.";
        assert status != null : "fx:id=\"status\" was not injected: check your FXML file 'addOrder.fxml'.";
        assert timeOrder != null : "fx:id=\"timeOrder\" was not injected: check your FXML file 'addOrder.fxml'.";
        assert timeProkata != null : "fx:id=\"timeProkata\" was not injected: check your FXML file 'addOrder.fxml'.";

    }

}
