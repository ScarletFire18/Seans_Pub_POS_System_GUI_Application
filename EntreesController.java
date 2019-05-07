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
public class EntreesController implements Initializable {
    
     @FXML private Button mainButton;
     @FXML private Button spagButton;
     @FXML private Button primeButton;
     @FXML private Button marsalaButton;
     @FXML private Button surfButton;
     @FXML private Button fishButton;
     @FXML private Button alfredoButton;
     @FXML private ImageView entree;
     @FXML private TextArea entreeTextArea;
     @FXML private Label itemDescriptionLabel;
     @FXML private Label priceLabel;
     @FXML private Label taxLabel;
     @FXML private Label totalLabel;
     
     private MenuItem selectedMenuItem;
     
     public void initData(MenuItem menuitem)
     {
         selectedMenuItem = menuitem;
         entreeTextArea.setText("" + selectedMenuItem.getItemDescription() +" ordered!");
         itemDescriptionLabel.setText(selectedMenuItem.getItemDescription());
         priceLabel.setText(Float.toString(selectedMenuItem.getPrice()));
         taxLabel.setText(Float.toString(selectedMenuItem.getTax()));  
         totalLabel.setText(Float.toString(selectedMenuItem.getTotal()));
     }
    
      public void mainButtonPushed(ActionEvent event) throws IOException
        {
            Parent entreesParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene entreesScene = new Scene(entreesParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(entreesScene);
            window.show();
        }
      
      public void spagButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem spag = new MenuItem("Sphagetti MB", 12.50f);
            initData(spag);
        }
       
       public void primeButtonPushed(ActionEvent event) throws IOException
        {
            MenuItem prime = new MenuItem("Prime Rib", 18.00f);
            initData(prime);
        }
       
       public void marsalaButtonPushed(ActionEvent event) throws IOException
        {
            MenuItem marsala = new MenuItem("Chix Marsala", 16.95f);
            initData(marsala);
        }
  
       public void surfButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem surf = new MenuItem("Surf and Turf", 24.50f);
            initData(surf);
        }
       
       public void fishButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem fish = new MenuItem("Fish and Chips", 14.50f);
            initData(fish);
        }
       
       public void alfredoButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem alfredo = new MenuItem("Chix Alfredo", 16.95f);
            initData(alfredo);
        }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
