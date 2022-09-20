package Service;

import Entity.Points;
import java.util.Scanner;

public class PointsService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Points createPoints() {
        System.out.print("Enter de value for X1:  ");
        float x1 = input.nextFloat();

        System.out.print("Enter de value for Y1:  ");
        float y1 = input.nextFloat();

        System.out.print("Enter de value for X2:  ");
        float x2 = input.nextFloat();

        System.out.print("Enter de value for Y2:  ");
        float y2 = input.nextFloat();

        Points newDataPoints = new Points(x1, y1, x2, y2);

        return newDataPoints;

    }

    public float pointsDistance(Points pointsData) {

        float xDifference = pointsData.getX2() - pointsData.getX1();
        float yDifference = pointsData.getY2() - pointsData.getY1();

        float result = (float) Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));

        return result;
    }

}
