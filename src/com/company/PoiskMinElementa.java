package com.company;

public class PoiskMinElementa {
    public static void poiskMinElementa(){
        int[] array = {69, 55, 55, 56, 55, 88, 65, 48, 59, 56, 48, 85, 15, 85, 55, 69, 58, 66, 87, 55, 55, 66, 58, 99, 25};

        int minValue = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue){
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("min value " + minValue);
        System.out.println("min index " + minIndex);

    }
}
