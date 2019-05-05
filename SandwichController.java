package seanspub2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class SandwichController implements Initializable {

     @FXML private Button mainButton;
      @FXML private Button tunaButton;
    @FXML private Button turkeyButton;
     @FXML private Button hamButton;
     @FXML private Button meatballButton;
     @FXML private Button roastbeefButton;
     @FXML private Button chickenButton;
    
      public void mainButtonPushed(ActionEvent event) throws IOException
        {
            Parent sandwichParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene sandwichScene = new Scene(sandwichParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(sandwichScene);
            window.show();
        }
      
         public void chickenButtonPushed(ActionEvent event) 
        {
            
        }
       
       public void tunaButtonPushed(ActionEvent event)
        {
            
        }
       
       public void roastbeefButtonPushed(ActionEvent event)
        {
            
        }
       
       public void meatballButtonPushed(ActionEvent event) 
        {
            
        }
       
       public void turkeyButtonPushed(ActionEvent event) 
        {
            
        }
       
       public void hamButtonPushed(ActionEvent event) 
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
