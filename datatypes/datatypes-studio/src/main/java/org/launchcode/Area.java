package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the radius of your circle: ");

        Double radiusCircle = input.nextDouble();

        while (radiusCircle <= 0) {
            System.out.println("Please enter a positive, numeric value: ");
            radiusCircle = input.nextDouble();
        }

        Double areaCircle = Circle.getArea(radiusCircle);
        System.out.println("The area of a circle of radius " + radiusCircle + " is: " + areaCircle);
    }

}