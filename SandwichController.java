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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

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
     @FXML private ImageView sandwich;
     @FXML private TextArea sandwichTextArea;
     @FXML private Label itemDescriptionLabel;
     @FXML private Label priceLabel;
     @FXML private Label taxLabel;
     
     private MenuItem selectedMenuItem;
     
     public void initData(MenuItem menuitem)
     {
         selectedMenuItem = menuitem;
         sandwichTextArea.setText("" + selectedMenuItem.getItemDescription() +" ordered!");
         itemDescriptionLabel.setText(selectedMenuItem.getItemDescription());
         priceLabel.setText(Float.toString(selectedMenuItem.getPrice()));
         taxLabel.setText(Float.toString(selectedMenuItem.getTax()));  
     }
    
      public void mainButtonPushed(ActionEvent event) throws IOException
        {
            Parent sandwichParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene sandwichScene = new Scene(sandwichParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(sandwichScene);
            window.show();
        }
      
         public void chickenButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem chicken = new MenuItem("Chicken Sandwich", 8.50f, 0.00f);
            initData(chicken);
        }
       
       public void tunaButtonPushed(ActionEvent event) throws IOException
        {
            MenuItem tuna = new MenuItem("Tuna Sandwich", 7.00f, 0.00f);
            initData(tuna);
        }
       
       public void roastbeefButtonPushed(ActionEvent event) throws IOException
        {
            MenuItem rb = new MenuItem("Roast Beef Sandwich", 9.00f, 0.00f);
            initData(rb);
        }
        
       public void meatballButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem mb = new MenuItem("Meatball Sandwich", 8.00f, 0.00f);
            initData(mb);
        }
       
       public void turkeyButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem turkey = new MenuItem("Turkey Sandwich", 7.00f, 0.00f);
            initData(turkey);
        }
       
       public void hamButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem ham = new MenuItem("Ham Sandwich", 6.50f, 0.00f);
            initData(ham);
        }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
