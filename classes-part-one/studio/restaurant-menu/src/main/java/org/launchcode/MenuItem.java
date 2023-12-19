package org.launchcode;

import java.time.LocalDate;

public class MenuItem {
    private String description;
    private double price;
    private String category;
    private LocalDate dateAdded;
    private boolean isNew;

    public MenuItem(String description, double price, String category) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = LocalDate.now();
        this.isNew = true;
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

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", dateAdded='" + dateAdded + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}
