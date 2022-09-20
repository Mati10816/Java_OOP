package Service;

import Entity.Roots;

public class RootsService {

    public double getDiscriminant(Roots data) {

        double discriminant = (Math.pow(data.getB(), 2) - (4 * data.getA() * data.getC()));

        return discriminant;
    }

    public boolean hasRoots(Roots data) {

        double discriminant = getDiscriminant(data);
        boolean result = false;

        if (discriminant > 0) {
            result = true;
        }

        return result;
    }

    public boolean hasRoot(Roots data) {

        double discriminant = getDiscriminant(data);
        boolean result = false;

        if (discriminant == 0) {
            result = true;
        }

        return result;
    }

    public void obtainRoots(Roots data) {
        boolean result = hasRoots(data);
        double a = data.getA();
        double b = data.getB();
        double c = data.getC();

        if (result) {

            double root1 = (-(b) + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
            double root2 = (-(b) - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);

            System.out.println("\n-> The 1st root is: " + root1);
            System.out.println("-> The 2nd root is: " + root2);

        }

    }

    public void obtainRoot(Roots data) {
        boolean result = hasRoot(data);
        double a = data.getA();
        double b = data.getB();
        double c = data.getC();

        if (result) {
            double root = (-(b) / (2 * a));

            System.out.println("\nThe unique root is: " + root);
        }

    }

    public void calculate(Roots data) {
        boolean twoRoots = hasRoots(data);
        boolean oneRoot = hasRoot(data);
       
        if (twoRoots) {
            obtainRoots(data);

        } else if (oneRoot) {
            obtainRoot(data);

        } else {
            System.out.println("\n *** The equation has no solution ***");
        }

    }

}
