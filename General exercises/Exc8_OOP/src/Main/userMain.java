package Main;

import Entity.Str;
import Service.StrService;
import java.util.Scanner;

public class userMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        StrService pServ = new StrService();
        Str phrase1 = new Str();

        System.out.print("Enter a word or a text: ");
        String sentence = input.next();
        int len = sentence.length();

        // Instantiate object
        phrase1.setPhrase(sentence);
        phrase1.setLongitude(len);

        int totalVocals = pServ.showVocals(phrase1);
        System.out.println("The quantity of vocals are: " + totalVocals);

        pServ.invertPhrase(phrase1);

        System.out.print("Enter the letter you want to search:  ");
        String letter = input.next();
        pServ.letterQuant(phrase1, letter);

        pServ.lenPhrase(phrase1);
        pServ.boundPhrases(phrase1);
        pServ.replaceLettersA(phrase1);

        boolean characterExist = pServ.charExist(phrase1);
        if (characterExist) {
            System.out.println("The character you are looking for does Exist;");

        } else {
            System.out.println("The character doesn´t exist.");
        }

    }

}
