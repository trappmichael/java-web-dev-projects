package org.launchcode;

import java.util.Scanner;
public class InputOutput {
    public static void main(String[] names) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, what is your name:");

        String name = input.nextLine();

        input.close();

        System.out.println("Hello, " + name);
    }

}
