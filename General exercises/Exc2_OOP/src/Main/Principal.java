package Main;

import Entity.Circumference;
import Service.CircumfService;

public class Principal {

    public static void main(String[] args) {

        CircumfService newOperation = new CircumfService();

        Circumference op1 = newOperation.createCircumference();

        float area = newOperation.area(op1);
        float perimeter = newOperation.perimeter(op1);
        
        System.out.println("For the radius: " + op1.getRadius());
        System.out.println("The area is " + area + " and the perimeter is " + perimeter);
        
        System.out.println(op1.getPerimetro());
        
        
        

    }

}
