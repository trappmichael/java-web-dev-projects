package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        System.out.println(Divide(5,0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (Map.Entry<String, String> student : studentFiles.entrySet()) {
            System.out.println(student.getKey() + ": " + CheckFileExtension(student.getValue()));
        }
    }

    public static double Divide(int x, int y) {

        if (y == 0) {
            try {
                throw new ArithmeticException("You can't divide by zero!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }

        return ((double) x) / ((double) y);
    }

    public static int CheckFileExtension(String fileName) {

        if (fileName == null || fileName.isEmpty()) {
            try {
                throw new FileTypeException("You didn't submit a file!");
            } catch (FileTypeException e) {
                e.printStackTrace();
            }

            return -1;
        } else if (fileName.length() < 5) {
            return 0;
        } else if (fileName.substring(fileName.length() - 5).equals(".java")) {
            return 1;
        }

        return 0;

    }
}