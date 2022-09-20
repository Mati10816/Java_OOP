package Main;

import Entity.Arrays;
import Service.ArraysService;

public class Principal {

    public static void main(String[] args) {

        Arrays newArrs = new Arrays();
        ArraysService arrServ = new ArraysService();

        arrServ.fillArrayA(newArrs);

        System.out.println("\nThis is the original array: ");
        arrServ.showArray(newArrs.getArrayA());

        arrServ.orderArrayA(newArrs);
        arrServ.fillArrayB(newArrs);

        System.out.println("\nThis is the array in increasing  order: ");
        arrServ.showArray(newArrs.getArrayA());
        
        System.out.println("\nThis is the array B: ");
        arrServ.showArray(newArrs.getArrayB());
        
        System.out.println(" ");

    }

}
