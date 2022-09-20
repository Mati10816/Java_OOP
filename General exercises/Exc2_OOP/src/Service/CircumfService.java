package Service;

import Entity.Circumference;
import java.util.Scanner;

public class CircumfService {
    
    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Circumference createCircumference() {

        System.out.print("Enter the value of the ratio: ");
        float ratio = input.nextFloat();

        Circumference c1 = new Circumference(ratio);
        
        return c1;

    }
    
    public float area(Circumference c1){        
        float result = (float) ((float) Math.pow( c1.getRadius(), 2) * 3.14);
        
        return result;
    }
    
    public float perimeter(Circumference c1){
        float radius = c1.getRadius();
        float result = (float) (2 * 3.14 * radius);
        
        return result;
    }

}
