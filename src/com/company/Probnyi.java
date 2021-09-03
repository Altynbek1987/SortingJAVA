package com.company;

public class Probnyi {
    public static void probnyi() {

        double[] number = {6.5,5.5,-4.5,1.5,-2.5,1.5,15.8,-7.8,-9.98,-10.3,11.5,12.5,14.5,16.5,-18.5};

        double digit = 0.0;
        int index = 0;
        boolean name = false;

        for (double sum: number){
            if (sum < 0){
                name = true;
            }else if (name){
                digit+=sum;
                index++;
            }
        }
    }

}
