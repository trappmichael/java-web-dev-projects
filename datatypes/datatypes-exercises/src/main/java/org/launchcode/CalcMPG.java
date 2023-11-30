package org.launchcode;

import java.util.Scanner;
public class CalcMPG {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven? ");

        Double milesDriven = input.nextDouble();

        System.out.println("How much gas have you consumed? ");

        Double gasConsumption = input.nextDouble();

        Double fuelEconomy = milesDriven / gasConsumption;

        System.out.println("Your fuel economy is " + fuelEconomy + " miles per gallon");
    }

}
