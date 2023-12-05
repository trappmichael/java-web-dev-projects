package org.launchcode;

import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        String text = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] words = text.split(" ");
        String[] sentences = text.split("\\.");

        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(sentences));
    }
}
