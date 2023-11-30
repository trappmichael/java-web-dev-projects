package org.launchcode;

import java.util.Scanner;
public class FindWord {
    public static void main(String[] args) {

        String aliceSentence =

                "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing " +
                        "to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                        "pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without " +
                        "pictures or conversation?’";

        Scanner input = new Scanner(System.in);

        System.out.println("What word would you like to search for? ");

        String word = input.next().toLowerCase();
        input.close();

        boolean wordFound = aliceSentence.toLowerCase().contains(word);
        int whereFound = aliceSentence.toLowerCase().indexOf(word) + 1;
        int wordLength = word.length();
        String newAliceSentence = aliceSentence.toLowerCase().replace(word, "");

        System.out.println(

                "It is " + wordFound + " that the sentence contains " + "'" + word + ".'\n\n" +
                        "It can be found at character " + whereFound + " and is " + wordLength + " characters long.\n\n" +
                        newAliceSentence
        );

    }

}
