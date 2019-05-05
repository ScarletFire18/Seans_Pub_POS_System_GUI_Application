/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seanspub2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import static javafx.fxml.FXMLLoader.load;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 *
 * @author sflana044
 */
public class FXMLDocumentController implements Initializable 
    {
        @FXML private Label welcomeLabel;
        @FXML private TextArea orderTextArea;
        @FXML private Button drinksButton;
        @FXML private Button appetizersButton;
        @FXML private Button soupSaladButton;
        @FXML private Button pizzaButton;
        @FXML private Button sandwichesButton;
        @FXML private Button kidsButton;
        @FXML private Button entreesButton;
        @FXML private ComboBox dineComboBox;
        
        //Configure the table
        @FXML private TableView<MenuItem> totalTable;
        @FXML private TableColumn<MenuItem, SimpleStringProperty> itemDescriptionColumn;
        @FXML private TableColumn<MenuItem, Float> priceColumn;
        @FXML private TableColumn<MenuItem, Float> taxColumn;
        
        public void dineComboBoxSelected()
        {
            orderTextArea.setText(dineComboBox.getValue().toString());
        }
       
        public void drinksButtonPushed(ActionEvent event) throws IOException
        {
            Parent drinksParent = FXMLLoader.load(getClass().getResource("Drinks.fxml"));
            Scene drinksScene = new Scene(drinksParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(drinksScene);
            window.show();
        }
        
        public void appetizersButtonPushed(ActionEvent event) throws IOException
        {
            Parent appetizersParent = FXMLLoader.load(getClass().getResource("Appetizers.fxml"));
            Scene appetizersScene = new Scene(appetizersParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(appetizersScene);
            window.show();
        }
        
        public void soupSaladButtonPushed(ActionEvent event) throws IOException
        {
            Parent soupsaladParent = FXMLLoader.load(getClass().getResource("SoupSalad.fxml"));
            Scene soupsaladScene = new Scene(soupsaladParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(soupsaladScene);
            window.show();
        }
        
        public void pizzaButtonPushed(ActionEvent event) throws IOException
        {
            Parent pizzaParent = FXMLLoader.load(getClass().getResource("Pizza.fxml"));
            Scene pizzaScene = new Scene(pizzaParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(pizzaScene);
            window.show();
        }
        
        public void sandwichesButtonPushed(ActionEvent event) throws IOException
        {
            Parent sandwichParent = FXMLLoader.load(getClass().getResource("Sandwich.fxml"));
            Scene sandwichScene = new Scene(sandwichParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(sandwichScene);
            window.show();
        }
        
        public void kidsButtonPushed(ActionEvent event) throws IOException
        {
            Parent kidsParent = FXMLLoader.load(getClass().getResource("Kids.fxml"));
            Scene kidsScene = new Scene(kidsParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(kidsScene);
            window.show();
        }
        
        public void entreesButtonPushed(ActionEvent event) throws IOException
        {
            Parent entreesParent = FXMLLoader.load(getClass().getResource("Entrees.fxml"));
            Scene entreesScene = new Scene(entreesParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(entreesScene);
            window.show();
        }
        
    @Override
    public void initialize(URL url, ResourceBundle rb) 
        {
            orderTextArea.setText("");
            dineComboBox.getItems().addAll("Dine In", "Pick Up");
            
            //set up columns
            itemDescriptionColumn.setCellValueFactory(new PropertyValueFactory<>("itemDescription"));
            priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
            taxColumn.setCellValueFactory(new PropertyValueFactory<>("tax"));
            
             //load data
             //totalTable.setItems(getMenuItem());
             
             
        }  
    
        //Method returns an ObservableList (like ArrayList for GUI) of MenuItem Objects
        public ObservableList<MenuItem> getMenuItem() throws IOException
        {
            ObservableList<MenuItem> menuItem = FXCollections.observableArrayList();  
   
            return menuItem;
        }
    }
