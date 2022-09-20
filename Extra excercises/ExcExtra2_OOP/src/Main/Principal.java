package Main;

import Entity.Points;
import Service.PointsService;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        PointsService pServ = new PointsService();

        Points newDataPoints = pServ.createPoints();
        
        float pointsDistance = pServ.pointsDistance(newDataPoints);
        
        System.out.println("\nThe distance between the points is:  " + pointsDistance);

    }

}
