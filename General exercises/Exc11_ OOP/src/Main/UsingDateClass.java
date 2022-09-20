package Main;

import java.util.Date;
import java.util.Scanner;

public class UsingDateClass {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("Enter the day: ");
        int day = input.nextInt();
        
        System.out.print("Enter the month: ");
        int month = input.nextInt();
        
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        
        Date fecha = new Date(year-1900, month-1, day);
        
        Date fechaActual = new Date();
        
        System.out.println("\nEntered date: " + fecha);
        System.out.println("Atual date: " + fechaActual);
        
        int difference = Math.abs((year-1900) - fechaActual.getYear());
        System.out.println("\nThere is " + difference + " years of difference between the dates.");
        
        
    }

}
