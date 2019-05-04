/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seanspub2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
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
        @FXML private Button sandwichButton;
        @FXML private Button kidsButton;
        @FXML private Button entreesButton;
        @FXML private ComboBox dineComboBox;
        
        
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
        
        public void appetizersButtonPushed()
        {
            
        }
        
        public void soupSaladButtonPushed()
        {
            
        }
        
        public void pizzaButtonPushed()
        {
            
        }
        
        public void sandwichButtonPushed()
        {
            
        }
        
        public void kidsButtonPushed()
        {
            
        }
        
        public void entreesButtonPushed()
        {
            
        }
        
    @Override
    public void initialize(URL url, ResourceBundle rb) 
        {
            orderTextArea.setText("");
            dineComboBox.getItems().addAll("Dine In", "Pick Up");
        }    
    
    }
