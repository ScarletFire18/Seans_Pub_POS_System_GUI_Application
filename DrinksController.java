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
public class DrinksController implements Initializable {
    
     @FXML private Button mainButton;
     @FXML private Button softButton;
     @FXML private Button coffeeButton;
     @FXML private Button teaButton;
     @FXML private Button beerButton;
     @FXML private Button wineButton;
     @FXML private Button mixedButton;
    
      public void mainButtonPushed(ActionEvent event) throws IOException
        {
            Parent drinksParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene drinksScene = new Scene(drinksParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(drinksScene);
            window.show();
        }
      
       public void softButtonPushed(ActionEvent event) 
        {
            
        }
       
       public void coffeeButtonPushed(ActionEvent event)
        {
            
        }
       
       public void teaButtonPushed(ActionEvent event)
        {
            
        }
       
       public void beerButtonPushed(ActionEvent event) 
        {
            
        }
       
       public void wineButtonPushed(ActionEvent event) 
        {
            
        }
       
       public void mixedButtonPushed(ActionEvent event) 
        {
            
        }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
