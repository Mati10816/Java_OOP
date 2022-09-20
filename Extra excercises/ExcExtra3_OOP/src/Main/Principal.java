package Main;

import Entity.Roots;
import Service.RootsService;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        RootsService rServ = new RootsService();

        System.out.print("Enter an integer value for 'a':  ");
        double a = input.nextInt();
        System.out.print("Enter an integer value for 'b':  ");
        double b = input.nextInt();
        System.out.print("Enter an integer value for 'c':  ");
        double c = input.nextInt();

        Roots newData = new Roots(a, b, c);
        
        rServ.calculate(newData);

    }

}
