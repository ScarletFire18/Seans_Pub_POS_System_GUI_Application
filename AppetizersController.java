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
import javafx.scene.control.TextArea;


/**
 * FXML Controller class
 *
 * @author sflana044
 */
public class AppetizersController implements Initializable{
    
    @FXML private Button mainButton;
    @FXML private Button wingsButton;
     @FXML private Button nachosButton;
     @FXML private Button mozzButton;
     @FXML private Button crabButton;
     @FXML private Button skinsButton;
     @FXML private Button shrimpButton;
     @FXML private ImageView appetizer;
     @FXML private TextArea appetizerTextArea;
     
     
    
      public void mainButtonPushed(ActionEvent event) throws IOException
        {
            Parent appetizersParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene appetizersScene = new Scene(appetizersParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(appetizersScene);
            window.show();
        }

      public void wingsPushed(ActionEvent event) throws IOException 
        {
            MenuItem wings = new MenuItem("Wings", 8.00f, 0.00f);
            appetizerTextArea.setText("Wings ordered!");
        }
       
       public void nachosButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem nachos = new MenuItem("Nachos", 7.50f, 0.00f);
            appetizerTextArea.setText("Nachos ordered!");
        }
       
       public void mozzButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem mozz = new MenuItem("Mozz Sticks", 7.00f, 0.00f);
            appetizerTextArea.setText("Mozz Sticks ordered!");
            //menuItem.add(new MenuItem("Mozz Sticks", 7.00f, 0.00f));
        }
       
       public void crabButtonPushed(ActionEvent event)  throws IOException 
        {
            MenuItem crab = new MenuItem("Crab Dip", 8.50f, 0.00f);
            appetizerTextArea.setText("Crab Dip ordered!");
            //menuItem.add(new MenuItem("Crab Dip", 8.50f, 0.00f));
        }
       
       public void skinsButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem skins = new MenuItem("Potato Skins", 6.50f, 0.00f);
            appetizerTextArea.setText("Potato Skins ordered!");
            //menuItem.add(new MenuItem("Potato Skins", 6.50f, 0.00f));
        }
       
       public void shrimpButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem shrimp = new MenuItem("Shrimp Cocktail", 9.95f, 0.00f);
            appetizerTextArea.setText("Shrimp Cocktail ordered!");
            //menuItem.add(new MenuItem("Shrimp Cocktail", 9.95f, 0.00f));
        }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
