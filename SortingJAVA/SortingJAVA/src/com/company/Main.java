package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] d = {9.1, 8.5 ,-7.3 ,6.8 ,-5.4 ,4.3 ,3.2 ,2.4 ,1.1 ,2.2 ,4.2 ,-1.3 ,8.5 , 5.5 ,5.3};
        System.out.println(Arrays.toString(d));

        System.out.println("-------------------------");

        double t = 0.0;
        for (double sum:d) {
            if (sum > 0 ){
                t = sum + t;
            }else if (sum < 0){
                t = 0;
            }
        }
        System.out.println(t + " Посчитал среднее арифметическую сумму положительных\n" +
                "чисел расположенных после первого отрицательного числа");

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
