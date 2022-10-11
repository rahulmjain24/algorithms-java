package com.rahul.searching;

public class BinarySearch {
    //The binary search algorithm only works on Sorted arrays.
    // In binary search we use divide and conquer, first we check the middle element and check if its greater than the
    // element we are looking for, if it is we ignore the elements before the middle element and check the next middle
    // element and keep doing it until we find our value.

    //Complexity : O(log n)

    public static int start;
    public static int middle;
    public static int end;

    public static int iterativeSearch(int[] list, int searchItem) {
        start = 0;
        end  = list.length - 1;
        middle = (start + end) / 2;
        while(true) {
            if(searchItem > list[middle]) {
                start = middle + 1;
                middle =  (start + end) / 2;
            }
            if(searchItem < list[middle]) {
                end = middle - 1;
                middle = (start + end) / 2;
            }
            if(searchItem == list[middle])
                return middle;
            if(middle == start && middle==end)
                return -1;
        }
    }

    public static int recursiveSearch(int[] list, int searchItem) {
        start = 0;
        end  = list.length - 1;
        middle = (start + end) / 2;

        return helperSearch(list,start,middle,end,searchItem);
    }

    private static int helperSearch(int[] list, int start, int middle, int end, int searchItem){
        if(searchItem > list[middle]) {
            start = middle + 1;
            middle =  (start + end) / 2;
        }
        if(searchItem < list[middle]) {
            end = middle - 1;
            middle = (start + end) / 2;
        }
        if(searchItem == list[middle])
            return middle;
        if(middle == start && middle==end)
            return -1;
        return helperSearch(list,start,middle,end,searchItem);
    }
}
