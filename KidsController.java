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
public class KidsController implements Initializable {

     @FXML private Button mainButton;
     @FXML private Button hotdogButton;
     @FXML private Button pizzaButton;
     @FXML private Button tendersButton;
     @FXML private Button macButton;
     @FXML private Button pbjButton;
     @FXML private ImageView kids;
     @FXML private TextArea kidsTextArea;
    
      public void mainButtonPushed(ActionEvent event) throws IOException
        {
            Parent kidsParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene kidsScene = new Scene(kidsParent);
            
            //This line gets the stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(kidsScene);
            window.show();
        }
      
      public void hotdogPushed(ActionEvent event) throws IOException 
        {
            MenuItem hotdog = new MenuItem("Kids Dog", 4.95f, 0.00f);
            kidsTextArea.setText("Kids Hot Dog ordered!");
        }
       
       public void pizzaButtonPushed(ActionEvent event) throws IOException
        {
            MenuItem pizza = new MenuItem("Kids Pizza", 5.50f, 0.00f);
            kidsTextArea.setText("Kids pizza ordered!");
        }

       public void tendersButtonPushed(ActionEvent event) throws IOException
        {
            MenuItem tenders = new MenuItem("Kids Tenders", 5.50f, 0.00f);
            kidsTextArea.setText("Kids Tenders ordered!");
        }
       
       public void pbjButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem pbj = new MenuItem("Kids PBJ", 4.00f, 0.00f);
            kidsTextArea.setText("Kids PBJ ordered!");
        }
       
       public void macButtonPushed(ActionEvent event) throws IOException 
        {
            MenuItem mac = new MenuItem("Kids MacnChz", 5.00f, 0.00f);
            kidsTextArea.setText("Kids Mac ordered!");
        }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
