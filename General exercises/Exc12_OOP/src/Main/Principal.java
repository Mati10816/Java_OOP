package Main;

import Entity.Person;
import Service.PersonService;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        Person person1 = new Person();
        PersonService perServ = new PersonService();

        person1 = perServ.createPerson();
        int agePerson1 = perServ.calculateAge(person1);

        System.out.print("\nEnter an age to check if it´s less than the actual person: ");
        int newAge = input.nextInt();

        boolean result = perServ.lessThanAge(agePerson1, newAge);
        if (result) {
            System.out.println("\nThe person age is larger than the one entered.");

        } else {
            System.out.println("\nThe person age is smaller than the one entered.");
        }

        System.out.println("The person age is: " + agePerson1 + " years.");
        
        perServ.showData(person1);

    }

}
