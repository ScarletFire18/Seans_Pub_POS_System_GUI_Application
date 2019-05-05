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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

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
    @FXML private ImageView soupsalad;
    @FXML private TextArea soupsaladTextArea;
    
     public void mainButtonPushed(ActionEvent event) throws IOException
        {
            Parent ssParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene ssScene = new Scene(ssParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(ssScene);
            window.show();
        }
     
      public void gardenButtonPushed(ActionEvent event) throws IOException
        {
            MenuItem garden = new MenuItem("Garden Salad", 5.95f, 0.00f);
            soupsaladTextArea.setText("Garden Salad ordered!");
        }
       
       public void caesarButtonPushed(ActionEvent event) throws IOException
        {
            MenuItem caesar = new MenuItem("Caesar Salad", 6.95f, 0.00f);
            soupsaladTextArea.setText("Caesar Salad ordered!");
        }
       
       public void frenchButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem french = new MenuItem("French Onion", 6.00f, 0.00f);
            soupsaladTextArea.setText("French Onion Soup ordered!");
        }
     
       public void chowderButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem chowder = new MenuItem("Clam Chowder", 6.00f, 0.00f);
            soupsaladTextArea.setText("Clam chowder ordered!");
        }
       
       public void noodleButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem noodle = new MenuItem("Chicken Noodle", 5.00f, 0.00f);
            soupsaladTextArea.setText("Chicken Noodle Soup ordered!");
        }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
     
    }    
    
}
