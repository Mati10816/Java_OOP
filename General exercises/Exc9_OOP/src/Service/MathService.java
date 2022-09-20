package Service;

import Entity.Mathematics;

public class MathService {

    public float mayNumber(Mathematics numbers) {
        float result;
        if (numbers.getNum1() > numbers.getNum2()) {
            result = numbers.getNum1();
        } else {
            result = numbers.getNum2();
        }

        return result;
    }

    public int calculatePotency(Mathematics numbers) {
        int result;
        float num1 = Math.round(numbers.getNum1());
        float num2 = Math.round(numbers.getNum2());

        if (num1 > num2) {
            result = (int) Math.pow(num1, num2);
        } else {
            result = (int) Math.pow(num2, num1);
        }

        return result;
    }

    public int squareRoot(Mathematics numbers) {
        int result;
        float num1 = Math.abs(Math.round(numbers.getNum1()));
        float num2 = Math.abs(Math.round(numbers.getNum2()));

        if (num1 < num2) {
            result = (int) Math.sqrt(num1);
        } else {
            result =  (int) Math.sqrt(num2);
        }

        return result;
    }

}
