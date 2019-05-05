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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sflana044
 */
public class EntreesController implements Initializable {
    
     @FXML private Button mainButton;
     @FXML private Button spagButton;
     @FXML private Button primeButton;
     @FXML private Button marsalaButton;
     @FXML private Button surfButton;
     @FXML private Button fishButton;
     @FXML private Button alfredoButton;
     @FXML private ImageView entree;
    
      public void mainButtonPushed(ActionEvent event) throws IOException
        {
            Parent entreesParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene entreesScene = new Scene(entreesParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(entreesScene);
            window.show();
        }
      
      public void spagButtonPushed(ActionEvent event) 
        {
            
        }
       
       public void primeButtonPushed(ActionEvent event)
        {
            
        }
       
       public void marsalaButtonPushed(ActionEvent event)
        {
            
        }
       
       public void surfButtonPushed(ActionEvent event) 
        {
            
        }
       
       public void fishButtonPushed(ActionEvent event) 
        {
            
        }
       
       public void alfredoButtonPushed(ActionEvent event) 
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
