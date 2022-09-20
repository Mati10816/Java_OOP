package Main;

import Entity.Rectangle;
import Service.RectangleService;

public class Principal {

    public static void main(String[] args) {
        
        RectangleService newRectangle = new RectangleService();
        
        Rectangle rect1 = newRectangle.createRectangle();
        
        int area = newRectangle.rectangleArea(rect1);
        int perimeter = newRectangle.rectanglePerimeter(rect1);
        
        System.out.println("The rectangle area is: " + area);
        System.out.println("The rectangle perimeter is: " + perimeter);
        System.out.println("Here´s an image of the rectangle");
        newRectangle.rectanglePicture(rect1);
    }

}
