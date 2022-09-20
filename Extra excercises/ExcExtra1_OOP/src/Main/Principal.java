package Main;

import Entity.Song;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        Song newSongEmptyData = new Song();
        System.out.println(newSongEmptyData + "\n");

        System.out.print("* Enter the song title:  ");
        String title  = input.next();
        
        System.out.print("* Enter the song author:  ");
        String author = input.next();
        
        Song newSong = new Song(title, author);
        System.out.println(newSong);
           
        
        

    }

}
