package com.company;

import java.util.Arrays;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class JetSorted {
    public static void main(){
        int[] array = new int[]{69, 55, 55, 56, 55, 88, 65, 48, 59, 56, 48, 85, 15, 85, 55, 69, 58, 66, 87, 55, 55, 66, 58, 99, 25};
        System.out.println(arrayToString(array));
        quickSort(array, 0, array.length -1);
    }

    public static void quickSort(int[] arr, int from, int to){
        if (from < to){
            int divideIndex = partition(arr, from, to);

            printSortStep(arr,from, to, divideIndex);

            quickSort(arr, from, divideIndex - 1);

            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to){
        int rightIndex = to;
        int leftIndex = from;

        int pilot = arr[from];
        while (leftIndex <= rightIndex){

            while (arr[leftIndex] < pilot){
                leftIndex ++;
            }
            while (arr[rightIndex] > pilot){
                rightIndex--;
            }
            if (leftIndex <= rightIndex){
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    private static String arrayToString(int[] array){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0){
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    private static void printSortStep(int[] arr, int from, int to, int partitionIndex){
        System.out.println(arrayToString(arr));
        System.out.println("\npartition at index: " + partitionIndex);
        System.out.println(", left " + arrayToString(Arrays.copyOfRange(arr, from, partitionIndex)));
        System.out.println(", fight: " + arrayToString(Arrays.copyOfRange(arr,partitionIndex,to + 1)));
    }

    private static void bubbleSort(int[] arr){
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]){
                    swap(arr, i - 1, i);
                    sorted = false;
                }

            }
        }
    }
}
