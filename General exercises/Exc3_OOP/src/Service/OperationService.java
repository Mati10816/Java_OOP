package Service;

import Entity.Operation;
import java.util.Scanner;

public class OperationService {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Operation createOperation() {
        System.out.print("Enter the first integer number:  ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer number:  ");
        int num2 = input.nextInt();

        Operation op = new Operation(num1, num2);

        return op;
    }

    public int addition(Operation op) {
        int sum = op.getNumber1() + op.getNumber2();

        return sum;

    }

    public int subtraction(Operation op) {
        int sub = op.getNumber1() - op.getNumber2();

        return sub;

    }

    public int multiplication(Operation op) {
        int mult = op.getNumber1() * op.getNumber2();

        return mult;

    }

    public float division(Operation op) {
        float div = op.getNumber1() / op.getNumber2();

        return div;

    }

}
