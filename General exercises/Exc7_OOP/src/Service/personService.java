package Service;

import Entity.Person;
import java.util.Scanner;

public class personService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Person createPerson() {

        System.out.print("Enter the name: ");
        String name = input.next();

        System.out.print("Enter the age: ");
        int age = input.nextInt();

        System.out.print("Enter the gender (M for Male, F for Female or O for Other): ");
        String gender = input.next();

        boolean genderOk = false;
        while (!genderOk) {

            if (gender.equals("M")) {
                genderOk = true;
                continue;
            } else if (gender.equals("F")) {
                genderOk = true;
                continue;
            } else if (gender.equals("O")) {
                genderOk = true;
                continue;
            }

            System.out.print("Error, you must enter M, F or O. Please enter the gender again: ");
            gender = input.next();
        }

        System.out.print("Enter the weigth in Kilograms: ");
        float weigth = input.nextFloat();

        System.out.print("Enter the height in Meters: ");
        float height = input.nextFloat();

        Person newPerson = new Person(name, age, gender, weigth, height);

        return newPerson;

    }

    public int calculateBMI(Person personX) {

        float weigth = (float) (personX.getWeight() / Math.pow(personX.getHeight(), 2));
        System.out.println("**** " + weigth);
        int result = 5;

        if (weigth < 20) {
            result = -1;
        } else if (weigth >= 20 && weigth <= 25) {
            result = 0;
        } else {
            result = 1;
        }
        
        System.out.println("## " + result);
        return result;
    }

    public boolean legalAge(Person personX) {
        boolean legal = false;

        if (personX.getAge() >= 18) {
            legal = true;
        }

        return legal;
    }
}
