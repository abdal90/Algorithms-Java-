import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import static java.lang.Math.max;

public class iceCreamParlorBinarySearch {
    // use sorting via binary search
    // create a copy of menu


  /*  // finds the indices of two items on the menu that allow us to spend all our money
    public static int[] findChoices(int[] menu, int money){
        // create a copy of menu
        int[] sortedMenu = menu.clone();
        // sort the array of copied menu
        Arrays.sort(sortedMenu);

        // loop through each element of the array
        for (int i = 0; i < sortedMenu.length; i++) {
            // calculate compliment
            int complement = money - sortedMenu[i];

            // do a binary search. Use built in binary search in java
            // optimize to only search the remainder of the array and not have duplicates
                // start at index i + 1. search the remainder of array sortedMenu.length
            int location = Arrays.binarySearch(sortedMenu, i + 1, sortedMenu.length, complement);

            // return where location is complement
            if (location > 0 && location < sortedMenu.length && sortedMenu[location] == complement){
                // we have found our item
                // get the indices
                int[] indices = getIndicesFromValues(menu, sortedMenu[i], complement);
                return indices;
            }
        }

        return null;
    }

    private static int[] getIndicesFromValues(int[] menu, int value1, int value2){
        int index1 = indexOf(menu, value1, -1);
        int index2 = indexOf(menu, value2, index1);

        int[] indices = (Math.min[index1, index2), Math.max(index1, index2));
        return indices;
    }

    private static int indexOf(int[] menu, int value, int excludeThis){
        // loop over the menu
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == value && i != excludeThis){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

    }*/
}
