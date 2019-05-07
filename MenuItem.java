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
    private Float price, tax, total;
    
    public MenuItem(String itemDescription, Float price)
    {
        this.itemDescription = new SimpleStringProperty(itemDescription);
        this.price = price;
        this.tax = price * 0.05f;
        this.total = this.price + this.tax;
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

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTax() {
        return tax;
    }

}
