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
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sflana044
 */
public class PizzaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private Button mainButton;
    @FXML private Button cheeseButton;
     @FXML private Button comboButton;
     @FXML private Button meatButton;
     @FXML private Button veggieButton;
     @FXML private Button whiteButton;
    
      public void mainButtonPushed(ActionEvent event) throws IOException
        {
            Parent pizzaParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene pizzaScene = new Scene(pizzaParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(pizzaScene);
            window.show();
        }
      
       public void cheeseButtonPushed(ActionEvent event)
        {
            
        }
       
       public void comboButtonPushed(ActionEvent event)
        {
            
        }
       
       public void veggieButtonPushed(ActionEvent event) 
        {
            
        }
       
       public void meatButtonPushed(ActionEvent event) 
        {
            
        }
       
       public void whiteButtonPushed(ActionEvent event) 
        {
            
        }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
