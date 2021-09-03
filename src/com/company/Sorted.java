package com.company;

import java.util.Arrays;

public class Sorted {

    public static void isSorted(){
        double[] d = {1.0, 8.0 ,-7.0 ,6.0 ,-5.0 ,4.0 ,3.0 ,2.0 ,1.0 ,2.0 ,4.0 ,-1.0 ,8.0 , 5.0 ,1.0};
       // System.out.println(Arrays.toString(d));
        double t = 0.0;
        int buf = 0;
        boolean isNegative = false;
        for (double sum:d) {
            if (sum < 0 ){
                isNegative = true;
            }else if (isNegative){
                t += sum;
                buf++;
            }
        }
        double number = t / buf;
        System.out.println("Answer " + number);

        System.out.println("-----------------------------");


        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i  = 1; i < d.length ; i++) {
                if (d[i] < d[i - 1]){
                    double ch = d[i];
                    d[i] = d[i - 1];
                    d[i - 1] = ch;
                    sorted = false;
                }
            }
            for (int i = 0; i < d.length; i++) {
                if (i > 0) {
                }
            }
            System.out.println(Arrays.toString(d));
        }
    }
}
