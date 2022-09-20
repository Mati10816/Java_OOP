package Service;

import Entity.Rectangle;
import java.util.Scanner;

public class RectangleService {

    public Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Rectangle createRectangle() {

        System.out.print("Enter the rectangle length: ");
        int length = input.nextInt();

        System.out.print("Enter the rectangle high: ");
        int high = input.nextInt();

        Rectangle rect = new Rectangle(length, high);

        return rect;
    }

    public int rectangleArea(Rectangle rect) {
        int result = rect.getHigh() * rect.getLength();

        return result;
    }

    public int rectanglePerimeter(Rectangle rect) {
        int result = 2 * (rect.getHigh() + rect.getLength());

        return result;
    }

    public void rectanglePicture(Rectangle rect) {
        for (int i = 0; i < rect.getHigh(); i++) {

            for (int j = 0; j < rect.getLength(); j++) {

                if ((i == 0) || (i == rect.getHigh() - 1)) {
                    System.out.print(" * ");
                } else if ((j == 0) || j == rect.getLength() - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println(" ");

        }
    }

}
