package com.rahul.searching;

public class LinearSearch {
    //In linear search we take an Iterable and iterate over every element linearly, that is,
    //check the first element and if it's not what we are looking for move to the next one.
    //If the item is found, the function returns the item else -1
    public static int search(int[] list, int searchItem) {
       if (list == null)
           return -1;

       for(int i =0; i < list.length; i++) {
           if(list[i] == searchItem)
               return i;
       }

       return -1;
    }

}
