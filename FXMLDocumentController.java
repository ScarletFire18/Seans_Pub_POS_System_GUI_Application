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
        
        
        public void totalTable()
        {
            
        }
        
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
            
            //Drinks
            menuItem.add(new MenuItem("Soft Drink", 1.95f, 0.00f));
            menuItem.add(new MenuItem("Tea", 1.95f, 0.00f));
            menuItem.add(new MenuItem("Coffee", 1.50f, 0.00f));
            menuItem.add(new MenuItem("Beer", 4.00f, 0.00f));
            menuItem.add(new MenuItem("Wine", 5.00f, 0.00f));
            menuItem.add(new MenuItem("Mixed Drink", 6.00f, 0.00f));
            
            //Appetizers
            menuItem.add(new MenuItem("Wings", 8.00f, 0.00f));
            menuItem.add(new MenuItem("Potato Skins", 6.50f, 0.00f));
            menuItem.add(new MenuItem("Nachos", 7.50f, 0.00f));
            menuItem.add(new MenuItem("Shrimp Cocktail", 9.95f, 0.00f));
            menuItem.add(new MenuItem("Crab Dip", 8.50f, 0.00f));
            menuItem.add(new MenuItem("Mozz Sticks", 7.00f, 0.00f));
            
            //SoupSalad
            menuItem.add(new MenuItem("Garden Salad", 5.95f, 0.00f));
            menuItem.add(new MenuItem("Caesar Salad", 6.95f, 0.00f));
            menuItem.add(new MenuItem("Clam Chowder", 6.00f, 0.00f));
            menuItem.add(new MenuItem("French Onion", 6.00f, 0.00f));
            menuItem.add(new MenuItem("Chicken Noodle", 5.00f, 0.00f));
            
            //Pizza
            menuItem.add(new MenuItem("Cheese Pizza", 9.50f, 0.00f));
            menuItem.add(new MenuItem("Combo Pizza", 14.00f, 0.00f));
            menuItem.add(new MenuItem("Veggie Pizza", 12.00f, 0.00f));
            menuItem.add(new MenuItem("Meatlovers Pizza", 16.00f, 0.00f));
            menuItem.add(new MenuItem("White Chicken Pizza", 15.00f, 0.00f));
            
            //Sandwiches
            menuItem.add(new MenuItem("Soft Drink", 1.95f, 0.00f));
            menuItem.add(new MenuItem("Tea", 1.95f, 0.00f));
            menuItem.add(new MenuItem("Coffee", 1.95f, 0.00f));
            menuItem.add(new MenuItem("Beer", 1.95f, 0.00f));
            menuItem.add(new MenuItem("Wine", 1.95f, 0.00f));
            menuItem.add(new MenuItem("Mixed Drink", 1.95f, 0.00f));
            
            //Kids
            menuItem.add(new MenuItem("Kids Dog", 4.95f, 0.00f));
            menuItem.add(new MenuItem("Kids Pizza", 5.50f, 0.00f));
            menuItem.add(new MenuItem("Kids Tenders", 5.50f, 0.00f));
            menuItem.add(new MenuItem("Kids MacnChz", 5.00f, 0.00f));
            menuItem.add(new MenuItem("Kids PBJ", 4.00f, 0.00f));
            
            
            //Entrees
            menuItem.add(new MenuItem("Sphagetti MB", 12.50f, 0.00f));
            menuItem.add(new MenuItem("Prime Rib", 18.00f, 0.00f));
            menuItem.add(new MenuItem("Fish and Chips", 14.50f, 0.00f));
            menuItem.add(new MenuItem("Chix Marsala", 16.95f, 0.00f));
            menuItem.add(new MenuItem("Surf and Turf", 24.50f, 0.00f));
            menuItem.add(new MenuItem("Chix Alfredo", 16.95f, 0.00f));
                    
   
            return menuItem;
        }
    }
