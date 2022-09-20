package Principal;

import Entity.Operation;
import Service.OperationService;

public class Main {

    public static void main(String[] args) {

        OperationService newOperation = new OperationService();

        Operation op1 = newOperation.createOperation();

        int sum = newOperation.addition(op1);
        int subtraction = newOperation.subtraction(op1);
        int mult = newOperation.multiplication(op1);
        float div = newOperation.division(op1);

        System.out.println("The sum is: " + sum);
        System.out.println("The subtraction is: " + subtraction);
        System.out.println("The multiplication is: " + mult);
        System.out.println("The division is: " + div);

    }

}
