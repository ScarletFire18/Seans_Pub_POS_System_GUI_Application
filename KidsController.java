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
public class KidsController implements Initializable {

     @FXML private Button mainButton;
     @FXML private Button hotdogButton;
     @FXML private Button pizzaButton;
     @FXML private Button tendersButton;
     @FXML private Button macButton;
     @FXML private Button pbjButton;
    
      public void mainButtonPushed(ActionEvent event) throws IOException
        {
            Parent kidsParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene kidsScene = new Scene(kidsParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(kidsScene);
            window.show();
        }
      
      public void hotdogPushed(ActionEvent event) 
        {
            
        }
       
       public void pizzaButtonPushed(ActionEvent event)
        {
            
        }
       
       public void tendersButtonPushed(ActionEvent event)
        {
            
        }
       
       public void pbjButtonPushed(ActionEvent event) 
        {
            
        }
       
       public void macButtonPushed(ActionEvent event) 
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
