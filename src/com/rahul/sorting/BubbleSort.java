package com.rahul.sorting;

public class BubbleSort {
    //In bubble sort we start from the first element and check it to its next element,
    //if the next element is smaller than the current element we swap them and check the
    //swapped element with the next element and keep doing it until the array is sorted



    public static int[] iterativeSort(int[] list) {
        int temp;
        for(int i = list.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if(list[j] > list[j+1]) {
                   temp = list[j];
                   list[j] = list[j+1];
                   list[j+1] = temp;
                }
            }
        }
        return list;
    }
}
