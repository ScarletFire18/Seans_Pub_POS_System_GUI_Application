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
public class SoupSaladController implements Initializable {
    
    
    @FXML private Button mainButton;
    @FXML private Button gardenButton;
     @FXML private Button caesarButton;
     @FXML private Button chowderButton;
     @FXML private Button frenchButton;
     @FXML private Button noodleButton;
    
     public void mainButtonPushed(ActionEvent event) throws IOException
        {
            Parent ssParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene ssScene = new Scene(ssParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(ssScene);
            window.show();
        }
     
      public void gardenButtonPushed(ActionEvent event)
        {
            
        }
       
       public void caesarButtonPushed(ActionEvent event)
        {
            
        }
       
       public void frenchButtonPushed(ActionEvent event) 
        {
            
        }
       
       public void chowderButtonPushed(ActionEvent event) 
        {
            
        }
       
       public void noodleButtonPushed(ActionEvent event) 
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
