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
    @FXML private ImageView pizza;
    @FXML private TextArea pizzaTextArea;
    
      public void mainButtonPushed(ActionEvent event) throws IOException
        {
            Parent pizzaParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene pizzaScene = new Scene(pizzaParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(pizzaScene);
            window.show();
        }
      
       public void cheeseButtonPushed(ActionEvent event) throws IOException
        {
            MenuItem cheese = new MenuItem("Cheese Pizza", 9.50f, 0.00f);
            pizzaTextArea.setText("Cheese Pizza ordered!");
        }
       
       public void comboButtonPushed(ActionEvent event) throws IOException
        {
            MenuItem combo = new MenuItem("Combo Pizza", 14.00f, 0.00f);
            pizzaTextArea.setText("Combo Pizza ordered!");
        }
       
       public void veggieButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem veggie = new MenuItem("Veggie Pizza", 12.00f, 0.00f);
            pizzaTextArea.setText("Veggie Pizza ordered!");
        }
       
       public void meatButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem meat = new MenuItem("Meatlovers Pizza", 16.00f, 0.00f);
            pizzaTextArea.setText("Meatlover Pizza ordered!");
        }
       
       public void whiteButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem white = new MenuItem("White Chicken Pizza", 15.00f, 0.00f);
            pizzaTextArea.setText("White Pizza ordered!");
        }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
