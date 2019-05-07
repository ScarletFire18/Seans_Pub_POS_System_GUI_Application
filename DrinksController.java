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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author sflana044
 */
public class DrinksController implements Initializable 
{
     @FXML private Button mainButton;
     @FXML private Button softButton;
     @FXML private Button coffeeButton;
     @FXML private Button teaButton;
     @FXML private Button beerButton;
     @FXML private Button wineButton;
     @FXML private Button mixedButton;
     @FXML private TextArea drinkTextArea;
     @FXML private Label itemDescriptionLabel;
     @FXML private Label priceLabel;
     @FXML private Label taxLabel;
     
     private MenuItem selectedMenuItem;
     
     public void initData(MenuItem menuitem)
     {
         selectedMenuItem = menuitem;
         drinkTextArea.setText("" + selectedMenuItem.getItemDescription() +" ordered!");
         itemDescriptionLabel.setText(selectedMenuItem.getItemDescription());
         priceLabel.setText(Float.toString(selectedMenuItem.getPrice()));
         taxLabel.setText(Float.toString(selectedMenuItem.getTax()));  
     }
    
      public void mainButtonPushed(ActionEvent event) throws IOException
        {
            Parent drinksParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene drinksScene = new Scene(drinksParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(drinksScene);
            window.show();
        }
      
       public void softButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem soft = new MenuItem("Soft Drink", 2.00f, 0.00f);
            initData(soft);
        }
       
       public void coffeeButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem coffee = new MenuItem("Coffee", 1.50f, 0.00f);
            initData(coffee);
        }
       
       public void teaButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem tea = new MenuItem("Tea", 1.95f, 0.00f);
            initData(tea);
            
        }
       
       public void beerButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem beer = new MenuItem("Beer", 4.00f, 0.00f);
            initData(beer);
        }
       
       public void wineButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem wine = new MenuItem("Wine", 5.00f, 0.00f);
            initData(wine);
        }
       
       public void mixedButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem mixed = new MenuItem("Mixed Drink", 6.00f, 0.00f);
            initData(mixed);
        }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
    }    
}
