package Service;

import Entity.Person;
import java.util.Date;

import java.util.Scanner;

public class PersonService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Person createPerson() {

        System.out.print("Enter the name: ");
        String name = input.next();

        System.out.println("To enter the date of birth, you have to ");
        System.out.print("Enter the day: ");
        int day = input.nextInt();
        System.out.print("Enter the month: ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        Date finalDate = new Date(year - 1900, month - 1, day);

        Person newDataPerson = new Person(name, finalDate);

        return newDataPerson;
    }

    public int calculateAge(Person data) {
        Date bornData = data.getBornDate();
        Date actualYear = new Date();

        int age = Math.abs(bornData.getYear() - actualYear.getYear());

        if (actualYear.getMonth() < bornData.getMonth()) {
            age -= 1;

        }

        return age;
    }

    public boolean lessThanAge(int realAge, int newAge) {
        boolean answer = false;

        if (newAge < realAge) {
            answer = true;
        }
        return answer;
    }

    public void showData(Person thePerson) {
        System.out.println("The name of the person is: " + thePerson.getName());

        Date strDate = thePerson.getBornDate();
        String finalDate = strDate.toLocaleString();

        System.out.println("The born date is: " + finalDate);

    }

}
