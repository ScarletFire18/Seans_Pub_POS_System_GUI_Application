/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seanspub2;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author sflana044
 */
public class MenuItem 
{
    private SimpleStringProperty itemDescription;
    private Float price, tax;
    
    public MenuItem(String itemDescription, Float price, Float tax)
    {
        this.itemDescription = new SimpleStringProperty(itemDescription);
        this.price = new Float(price);
        this.tax = new Float(tax);
    }

    public String getItemDescription() {
        return itemDescription.get();
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = new SimpleStringProperty(itemDescription);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }
}
