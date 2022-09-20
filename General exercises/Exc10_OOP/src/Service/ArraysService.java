package Service;

import Entity.Arrays;

public class ArraysService {

    public void showArray(float [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" [" + array[i] + "] ");

        }
    }

    public void fillArrayA(Arrays newArray) {
        float[] arrayA = new float[50];
        newArray.setArrayA(arrayA);

        float num;

        for (int i = 0; i < arrayA.length; i++) {
            num = (float) Math.round(Math.random() * 100);
            arrayA[i] = num;

        }
    }

    public void orderArrayA(Arrays arrayA) {
        float[] newArray = arrayA.getArrayA();
        float num1;
        float num2;

        for (int i = 0; i < (arrayA.getArrayA().length) - 1; i++) {
            for (int j = i + 1; j < (arrayA.getArrayA().length); j++) {
                num1 = newArray[i];
                num2 = newArray[j];

                if (num1 > num2) {
                    newArray[i] = num2;
                    newArray[j] = num1;
                }
            }
        }

        arrayA.setArrayA(newArray);

    }

    public void fillArrayB(Arrays arrays) {
        float[] arrA = arrays.getArrayA();
        float[] arrB = new float[20];

        for (int i = 0; i < arrB.length; i++) {
            if (i < 10) {
                arrB[i] = arrA[i];
            } else {
                arrB[i] = (float) 0.5;
            }

        }

        arrays.setArrayB(arrB);
    }

}
