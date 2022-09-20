package Service;

import Entity.TaxID;
import java.util.Scanner;

public class TaxIDService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public TaxID createTaxId() {

        System.out.print("\nEnter you identification number:  ");
        long id = input.nextLong();

        String letter = correspondingLetter(id);

        TaxID newData = new TaxID(id, letter);

        return newData;
    }

    public String correspondingLetter(long id) {

        int residual = (int) (id % 23);
        String[] letters = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E",};

        String letter = letters[residual];

        return letter;

    }
    
    public void showData(TaxID data){
        System.out.println("The complete TAX ID is ->  " + data.getPersonId() + "-" + data.getLetter());
    }

}
