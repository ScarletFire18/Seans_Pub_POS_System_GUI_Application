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
    private float price, tax;
    
    public MenuItem(String name, Float price, Float tax)
    {
        this.itemDescription = itemDescription;
        this.price = price;
        this.tax = tax;
    }

    public SimpleStringProperty getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(SimpleStringProperty itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float subtotal) {
        this.price = price;
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    } 
}
