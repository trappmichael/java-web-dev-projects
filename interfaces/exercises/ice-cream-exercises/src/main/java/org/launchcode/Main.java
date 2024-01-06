package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

        Comparator flavorComparator = new FlavorComparator();
        flavors.sort(flavorComparator);

        System.out.println(flavors.toString());


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        Comparator coneCostComparator = new ConeComparator();
        cones.sort(coneCostComparator);

        System.out.println(cones.toString());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}