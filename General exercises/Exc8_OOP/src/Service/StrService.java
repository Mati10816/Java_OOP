package Service;

import Entity.Str;
import java.util.Scanner;

public class StrService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public int showVocals(Str phrase) {
        int total = 0;

        for (int i = 0; i < phrase.getLongitude(); i++) {
            String letter = phrase.getPhrase().substring(i, i + 1);

            if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i")
                    || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")) {
                total += 1;
            }

        }
        return total;

    }

    public void invertPhrase(Str phrase) {

        String invert = "";
        String letter;

        for (int i = phrase.getLongitude(); i > 0; i--) {

            if (i > 0) {
                letter = phrase.getPhrase().substring(i - 1, i);
            } else {
                letter = phrase.getPhrase().substring(0, 1);
            }

            invert += letter;

        }

        System.out.println("The inverted phrase is: " + invert);

    }

    public void letterQuant(Str phrase, String letter) {
        int total = 0;

        for (int i = 0; i < phrase.getLongitude(); i++) {
            String let = phrase.getPhrase().substring(i, i + 1);

            if (let.equalsIgnoreCase(letter)) {
                total += 1;
            }

        }

        System.out.println("The character '" + letter + "' appears " + total + " time(s)");

    }

    public void lenPhrase(Str phrase) {
        System.out.println("\nEnter a new word or phrase: ");
        String newPhrase = input.next();

        System.out.println("The first phrase have " + phrase.getLongitude() + " characters and the new phrase have "
                + newPhrase.length() + " characters");

    }

    public void boundPhrases(Str phrase) {
        System.out.print("\nEnter a new word or phrase: ");
        String newPhrase = input.next();

        System.out.println(phrase.getPhrase() + " " + newPhrase);

    }

    public void replaceLettersA(Str phrase) {
        System.out.print("\nEnter the character to replace the letters 'a' in the original phrase:  ");
        String character = input.next();

        String newPhrase = "";
        String letter;

        for (int i = 0; i < phrase.getLongitude(); i++) {
            letter = phrase.getPhrase().substring(i, i + 1);

            if (letter.equalsIgnoreCase("a")) {
                letter = character;
            }

            newPhrase += letter;

        }

        System.out.println("The result is: " + newPhrase);
    }

    public boolean charExist(Str phrase) {
        System.out.print("\nEnter the character you want to find: ");
        String charac = input.next();
        String let;
        boolean result = false;

        for (int i = 0; i < phrase.getLongitude(); i++) {
            let = phrase.getPhrase().substring(i, i + 1);

            if (let.equalsIgnoreCase(charac)) {
                result = true;
                break;
            }

        }

        return result;

    }

}
