//String to test: "Powerful, you have become. The dark side, I sense in you. Mourn them, do not. Miss them, do not. The shadow of greed, that is."

package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter one of more sentences. Include at least one comma. Pretend you're yoda. (ex. 'Powerful, you have become.')");
        String userInput = scanner.nextLine();

        int userInputLength = userInput.length();
        String[] splitString = userInput.split(Pattern.quote("."));

        String afterComma;
        String beforeComma;
        String fullSentence = "";


        for (String sentence : splitString) {
            for (int i = 0; i < sentence.length(); i++) {
                char aChar = sentence.charAt(i);

                if (aChar == ',') {

                    afterComma = sentence.substring(i + 2, sentence.length());
                    beforeComma = sentence.substring(0, i);
                    String aSentence = afterComma + " " + beforeComma.toLowerCase() + ".";
                    String replaceDoubleSpaces = aSentence.replace("  ", " ");

                    fullSentence = fullSentence + replaceDoubleSpaces.substring(0,1).toUpperCase() + replaceDoubleSpaces.substring(1,replaceDoubleSpaces.length()) + " ";

                } else {
                    continue;
                }

            }
        }

        System.out.println(fullSentence);

    }
}
