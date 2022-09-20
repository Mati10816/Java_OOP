package Main;

import Entity.Mathematics;
import Service.MathService;

public class Principal {

    public static void main(String[] args) {
        
        Mathematics case1 = new Mathematics();
        MathService mathServ = new MathService();
        
        float number1 =  (float) (Math.random() *10);
        float number2 =  (float) (Math.random() *10);
        
        case1.setNum1(number1);
        case1.setNum2(number2);
        
        System.out.println("The numbers are: " + case1.getNum1() + " and " + case1.getNum2());
        float mayNumb = mathServ.mayNumber(case1);
        System.out.println("\n-> The mayor number is: " + mayNumb);
        
        int potency = mathServ.calculatePotency(case1);
        System.out.println("-> The potency of the largest number with the smallest is: " + potency);
        
        int square = mathServ.squareRoot(case1);
        System.out.println("-> The square root of the  smallest number is: " + square);
        
    }

}
