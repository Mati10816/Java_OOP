package Main;

import Entity.Person;
import Service.personService;

public class PeoplemainOp1 {

    public static void main(String[] args) {

        personService newPerson = new personService();

        System.out.println("\nFor the first person: ");
        Person p1 = newPerson.createPerson();
        int weigthp1 = newPerson.calculateBMI(p1);
        boolean legalAge1 = newPerson.legalAge(p1);

        System.out.println("\nFor the second person: ");
        Person p2 = newPerson.createPerson();
        int weigthp2 = newPerson.calculateBMI(p2);
        boolean legalAge2 = newPerson.legalAge(p2);

        System.out.println("\nFor the third person: ");
        Person p3 = newPerson.createPerson();
        int weigthp3 = newPerson.calculateBMI(p3);
        boolean legalAge3 = newPerson.legalAge(p3);

        System.out.println("\nFor the fourth person: ");
        Person p4 = newPerson.createPerson();
        int weigthp4 = newPerson.calculateBMI(p4);
        boolean legalAge4 = newPerson.legalAge(p4);

        //For porcentajes
        float totalWeigthsMinus = 0;
        float totalWeigthsOk = 0;
        float totalWeigthsMay = 0;
        float ofLegalAge = 0;
        float notLegal = 0;

        System.out.println(" ");
        switch (weigthp1) {
            case -1:
                System.out.println("The first person´s weigth is below the optimal");
                totalWeigthsMinus += 1;
                break;
            case 0:
                System.out.println("The first person´s weigth is the optimal");
                totalWeigthsOk += 1;
                break;
            case 1:
                System.out.println("The first person´s weigth is over the optimal");
                totalWeigthsMay += 1;
                break;
        }

        if (legalAge1) {
            System.out.println("The first person is of legal age");
            ofLegalAge += 1;
        } else {
            System.out.println("The first person is not of legal age");
            notLegal += 1;
        }

        System.out.println(" ");
        switch (weigthp2) {
            case -1:
                System.out.println("The second person´s weigth is below the optimal");
                totalWeigthsMinus += 1;
                break;
            case 0:
                System.out.println("The second person´s weigth is the optimal");
                totalWeigthsOk += 1;
                break;
            case 1:
                System.out.println("The second person´s weigth is over the optimal");
                totalWeigthsMay += 1;
                break;
        }

        if (legalAge2) {
            System.out.println("The second person is of legal age");
            ofLegalAge += 1;
        } else {
            System.out.println("The second person is not of legal age");
            notLegal += 1;
        }

        System.out.println(" ");
        switch (weigthp3) {
            case -1:
                System.out.println("The third person´s weigth is below the optimal");
                totalWeigthsMinus += 1;
                break;
            case 0:
                System.out.println("The third person´s weigth is the optimal");
                totalWeigthsOk += 1;
                break;
            case 1:
                System.out.println("The third person´s weigth is over the optimal");
                totalWeigthsMay += 1;
                break;
        }

        if (legalAge3) {
            System.out.println("The third person is of legal age");
            ofLegalAge += 1;
        } else {
            System.out.println("The third person is not of legal age");
            notLegal += 1;
        }

        System.out.println(" ");
        switch (weigthp4) {
            case -1:
                System.out.println("The first person´s weigth is below the optimal");
                totalWeigthsMinus += 1;
                break;
            case 0:
                System.out.println("The first person´s weigth is the optimal");
                totalWeigthsOk += 1;
                break;
            case 1:
                System.out.println("The first person´s weigth is over the optimal");
                totalWeigthsMay += 1;
                break;
        }

        if (legalAge4) {
            System.out.println("The first person is of legal age");
            ofLegalAge += 1;
        } else {
            System.out.println("The first person is not of legal age");
            notLegal += 1;
        }

        //Porcentages
        
        System.out.println(" ");
        System.out.println("There´s " + (totalWeigthsMinus * 100) / 4 +"% of people whit wiegth below the optimal" );
        System.out.println("There´s " + (totalWeigthsOk * 100) / 4 +"% of people whit the optimal wiegth");
        System.out.println("There´s " + (totalWeigthsMay * 100) / 4 +"% of people whit wiegth over the optimal" );
        System.out.println("\nThere´s " + (ofLegalAge * 100) / 4 +"% of people whit legal agel" );
        System.out.println("There´s " + (notLegal * 100) / 4 +"% of people underage" );
    }

}
