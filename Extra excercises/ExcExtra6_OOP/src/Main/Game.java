package Main;

import Entity.Hangman;
import Service.HangmanService;

public class Game {

    public static void main(String[] args) {

        HangmanService gameServ = new HangmanService();
        Hangman newGame = new Hangman();

        gameServ.game(newGame);

    }

}
