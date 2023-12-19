package org.launchcode;

import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private LocalDate lastUpdated;

    // Constructor
    public Menu(ArrayList<MenuItem> menuItems) {
        this.lastUpdated = LocalDate.now();
        this.menuItems = menuItems;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // Add an item to the menu
    public void addMenuItem(MenuItem item) {
        this.lastUpdated = LocalDate.now();

        menuItems.add(item);
    }
    // Remove an item from the menu
    public void removeMenuItem(MenuItem item) {
        this.lastUpdated = LocalDate.now();

        int itemIndex = menuItems.indexOf(item);
        menuItems.remove(itemIndex);
    }

    // Updates the IsNew field for every item on the menu based on today's date.
    public void updateIsNew() {
        LocalDate twoWeeksAgo = LocalDate.now().minusDays(14);

        for (MenuItem item : this.menuItems) {
            LocalDate dateAdded = item.getDateAdded();
            if (twoWeeksAgo.isAfter(dateAdded)) {
                item.setIsNew(false);
            }
        }
    }

    // Prints the entire menu.
    public void printMenu() {
        updateIsNew();
        System.out.println(this.menuItems);
    }

    // Prints a single item from the menu.
    public void printMenuItem(MenuItem item) {
        updateIsNew();
        System.out.println(item);
    }

    public LocalDate menuLastUpdated() {

    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                '}';
    }
}
