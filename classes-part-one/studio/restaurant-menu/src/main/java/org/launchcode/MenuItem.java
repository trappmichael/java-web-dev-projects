package org.launchcode;

import java.util.Date;

public class MenuItem {
    private String description;
    private double price;
    private String category;
    private Date dateAdded;
    private boolean isNew;

    public MenuItem(String description, double price, String category, Date dateAdded) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = dateAdded;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }
}
