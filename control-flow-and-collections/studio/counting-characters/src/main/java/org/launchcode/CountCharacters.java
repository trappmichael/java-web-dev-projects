package org.launchcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CountCharacters {
    public static void main(String[] args) {
        try {
            File textFile = new File("C:\\Users\\trapp\\Documents\\LaunchCode\\Unit2\\java-web-dev-projects\\control-flow-and-collections\\studio\\counting-characters\\src\\main\\java\\org\\launchcode\\text.txt");
            Scanner fileReader = new Scanner(textFile);
//        Scanner input;
            String text;
//        String text =
//                "If the product of two terms is zero then common sense says at least " +
//                        "one of the two terms has to be zero to start with. So if you " +
//                        "move all the terms over to one side, you can put the quadratics " +
//                        "into a form that can be factored allowing that side of the equation " +
//                        "to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
            HashMap<Character, Integer> characterCounts = new HashMap<>();

//            input = new Scanner(System.in);
//            System.out.println("Enter text: ");

            text = fileReader.nextLine().toLowerCase();

            char[] charactersInString = text.toCharArray();
            fileReader.close();

            for (char character : charactersInString) {
                if (characterCounts.containsKey(character)) {
                    int currentCount = characterCounts.get(character);

                    characterCounts.put(character, currentCount + 1);

                } else {
                    characterCounts.put(character, 1);
                }
            }

            for (Map.Entry<Character, Integer> characterCount : characterCounts.entrySet()) {
                if (Character.isLetter(characterCount.getKey())) {
                    System.out.println(characterCount.getKey() + ": " + characterCount.getValue());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
