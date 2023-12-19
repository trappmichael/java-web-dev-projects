package org.launchcode;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem chickenParm = new MenuItem("Chicken Parmesan", 15, "Entree");
//        addMenuItem(chickenParm);

        ArrayList<MenuItem> menuItems = new ArrayList<>();

        Menu currentMenu = new Menu(menuItems);

        currentMenu.addMenuItem(chickenParm);

        System.out.println(currentMenu);

        System.out.println(LocalDate.now());

        currentMenu.printMenu();

        currentMenu.printMenuItem(chickenParm);


//        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern()
//        String string = "January 2, 2010";
//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
//LocalDate date = LocalDate.parse(string, formatter);
//System.out.println(date); // 2010-01-02

    }
}
