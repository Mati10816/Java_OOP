package Service;

import Entity.Hangman;
import java.util.Scanner;

public class HangmanService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void wordLen(Hangman data) {
        int len = data.getWord().length;

        System.out.println("The word´s length is:  " + len);

    }

    public void letterSearch(Hangman data, String userLetter) {
        boolean exist = false;
        for (int i = 0; i < data.getWord().length; i++) {

            if (data.getWord()[i].equalsIgnoreCase(userLetter)) {
                String[] addLetter = data.getSpaces();
                if (i == 0) {
                    addLetter[i] = userLetter.toUpperCase();
                } else {
                    addLetter[i] = userLetter.toLowerCase();
                }

                data.setSpaces(addLetter);

                if (exist == false) {
                    System.out.println(" +  The letter is in the word");
                    exist = true;
                }

            } else if (i == data.getWord().length - 1 && exist == false) {
                System.out.println(" x  The letter is NOT the word");

            }
        }

        System.out.print(" | This is the word:  ");

        for (int i = 0; i < data.getWord().length; i++) {
            System.out.print(data.getSpaces()[i]);

        }
        System.out.println(" | ");
    }

    public void letterFound(Hangman data, String userLetter) {
        int sum = 0;

        for (int i = 0; i < data.getWord().length; i++) {

            if (data.getWord()[i].equalsIgnoreCase(userLetter)) {
                sum += 1;
            }
        }
        data.setLettersFound(data.getLettersFound() + sum);
        data.setTrys(data.getTrys() - 1);
    }

    public void trys(Hangman data) {
        System.out.println("\n -> You have " + data.getTrys() + " attempt(s) <-");
    }

    public void wordSetting(Hangman data) {
        String word = "Butterfly";
        String[] wordArray = new String[word.length()];

        for (int i = 0; i < word.length(); i++) {
            wordArray[i] = word.substring(i, i + 1);
        }

        String[] spaces = new String[wordArray.length];
        data.setWord(wordArray);

        for (int i = 0; i < wordArray.length; i++) {
            spaces[i] = " _ ";
        }
        data.setSpaces(spaces);
    }

    public void game(Hangman data) {
        System.out.println("Welcome to the hangman Gameeeee ");
        wordSetting(data);
        data.setTrys(data.getWord().length);
        wordLen(data);

        while (data.getTrys() != 0 && data.getLettersFound() != data.getWord().length) {
            System.out.println("-------------------------------------------------------------");
            System.out.print("Enter a letter:  ");
            String userLetter = input.next();

            letterSearch(data, userLetter);
            letterFound(data, userLetter);
            System.out.println("\n   -> Letters found: " + data.getLettersFound());
            System.out.println("   -> Letters remain: " + (data.getWord().length - data.getLettersFound()));
            if (data.getTrys() != 0) {
                System.out.println("\n # You have " + data.getTrys() + " more attempt(s) # ");

            }
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");
        if (data.getLettersFound() == data.getWord().length) {
            System.out.println("\n               !!!!! You WIN !!!!!");

        } else {
            System.out.println("\n    Thanks for playing... Better luck next time =D");
        }

    }

}
