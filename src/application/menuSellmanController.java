package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import application.db.*;

public class menuSellmanController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AddOrder;
    
    @FXML
    private TableView<Order> Order;
    
    @FXML
    private TableColumn<Order, String> code;

    @FXML
    private TableColumn<Order, Date> dateClose;

    @FXML
    private TableColumn<Order, Date> dateCreate;

    @FXML
    private TableColumn<Order, Integer> id;

    @FXML
    private TableColumn<Order, Integer> idClient;

    @FXML
    private Button singOut;

    @FXML
    private TableColumn<Order, Integer> status;

    @FXML
    private TableColumn<Order, Date> timeOrder;

    @FXML
    private TableColumn<Order, Integer> timeProkata;

    @FXML
    void AddOrder(ActionEvent event) {
    	Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
    	AnchorPane root;
		try {
			root = (AnchorPane) FXMLLoader.load(getClass().getResource("addOrder.fxml"));
			Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.setTitle("пїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅ пїЅпїЅ. пїЅ.пїЅ. пїЅпїЅпїЅпїЅпїЅпїЅ");
	        stage.setResizable(true);
	        stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Alert alert = new Alert(AlertType.ERROR);
	    	alert.setTitle("пїЅпїЅпїЅпїЅпїЅпїЅ");
			alert.setHeaderText("пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅ");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
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
			Alert alert = new Alert(AlertType.ERROR);
	    	alert.setTitle("ОШИБКА");
			alert.setHeaderText("В данный момент не возможно сформирровать заказ");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		}
    }

    @FXML
    void initialize() {
    	Connect connects = new Connect();
    	ObservableList<Order> orders = FXCollections.observableArrayList();
        try (Connection connection1 = connects.getConnection();
             Statement statement = connection1.createStatement();) {
            String selectSql = "SELECT * from prokat.order;";
            ResultSet result = statement.executeQuery(selectSql);
            while (result.next()) {
            	orders.add(new Order(result.getInt(1), result.getString(2), result.getDate(3), result.getDate(4), result.getInt(5), result.getInt(6),result.getDate(7),result.getInt(8)));
            }
          //There's a bug somewhere, I don't know where
            id.setCellValueFactory(new PropertyValueFactory<Order, Integer>("id"));
            code.setCellValueFactory(new PropertyValueFactory<Order, String>("code"));
            timeOrder.setCellValueFactory(new PropertyValueFactory<Order, Date>("orderTime"));
            dateCreate.setCellValueFactory(new PropertyValueFactory<Order, Date>("cretionDate"));
            idClient.setCellValueFactory(new PropertyValueFactory<Order, Integer>("idClient"));
            status.setCellValueFactory(new PropertyValueFactory<Order, Integer>("status"));
            dateClose.setCellValueFactory(new PropertyValueFactory<Order, Date>("closeDate"));
            timeProkata.setCellValueFactory(new PropertyValueFactory<Order, Integer>("timeProkat"));
            Order.setItems(orders);
    } catch (SQLException e) {
    	 e.printStackTrace();
		Alert alert = new Alert(AlertType.ERROR);
    	alert.setTitle("пїЅпїЅпїЅпїЅпїЅпїЅ");
		alert.setHeaderText("пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅ");
		alert.setContentText(e.getMessage());
		alert.showAndWait();
        }
        assert AddOrder != null : "fx:id=\"AddOrder\" was not injected: check your FXML file 'menuSellman.fxml'.";
        assert code != null : "fx:id=\"code\" was not injected: check your FXML file 'menuSellman.fxml'.";
        assert dateClose != null : "fx:id=\"dateClose\" was not injected: check your FXML file 'menuSellman.fxml'.";
        assert dateCreate != null : "fx:id=\"dateCreate\" was not injected: check your FXML file 'menuSellman.fxml'.";
        assert id != null : "fx:id=\"id\" was not injected: check your FXML file 'menuSellman.fxml'.";
        assert idClient != null : "fx:id=\"idClient\" was not injected: check your FXML file 'menuSellman.fxml'.";
        assert singOut != null : "fx:id=\"singOut\" was not injected: check your FXML file 'menuSellman.fxml'.";
        assert status != null : "fx:id=\"status\" was not injected: check your FXML file 'menuSellman.fxml'.";
        assert timeOrder != null : "fx:id=\"timeOrder\" was not injected: check your FXML file 'menuSellman.fxml'.";
        assert timeProkata != null : "fx:id=\"timeProkata\" was not injected: check your FXML file 'menuSellman.fxml'.";

    }

}
