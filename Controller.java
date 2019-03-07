package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;

import java.net.URL;
import java.util.ResourceBundle;

//import javafx.event.ActionEvent;



public class Controller implements Initializable
{

    @FXML
    private Label itemsLabel;
    @FXML
    private Label subtotalLabel;
    @FXML
    private Label taxLabel;
    @FXML
    private Label totalLabel;
    @FXML
    private Button munchiesButton;
    @FXML
    private Button drinksButton;
    @FXML
    private Button soupsButton;
    @FXML
    private Button saladsButton;
    @FXML
    private Button burgersButton;
    @FXML
    private Button sandwichesButton;
    @FXML
    private Button entreesButton;
    @FXML
    private ScrollPane itemsScrollPane;

    public Controller() {
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
    }


}

 class ItemDemo
    {
        //Appetizers objects
        Item wings = new Item(12.00);
        Item nachos = new Item(8.00);
        Item mozzsticks = new Item(8.00);
        Item tenders = new Item(9.00);
        Item mussels = new Item(10.50);
        Item buffShrimp = new Item(11.00);
        Item artichokeDip = new Item(7.50);

        //SoupSalad objects
        Item caesar = new Item(6.95);
        Item house = new Item(12.00);
        Item frenchonion = new Item(8.00);
        Item chowder = new Item(8.00);

        //Burgers
        Item blackblue = new Item(13.00);
        Item sriracha = new Item(12.00);
        Item classic = new Item(11.00);
        Item bbq = new Item(8.00);

        //Kids
        Item mac = new Item(5.95);
        Item gcheese = new Item(5.95);
        Item pizza = new Item(5.95);
        Item nuggets = new Item(5.95);
        Item hotdog = new Item(4.95);

        //Drinks
        Item softdrink = new Item(1.95);
        Item coffee = new Item(2.95);
        Item tea = new Item(2.50);
        Item domestic = new Item(4.50);
        Item imported = new Item(6.00);
        Item mixed = new Item(8.00);
        Item wineglass = new Item(7.00);
        Item winebottle = new Item(27.00);

 }


