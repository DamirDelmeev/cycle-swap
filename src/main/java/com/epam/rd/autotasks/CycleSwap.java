package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 7, 4};
        CycleSwap.cycleSwap(array);
        System.out.println(Arrays.toString(array));
        int[] array1 = new int[]{1, 3, 2, 7, 4};
        CycleSwap.cycleSwap(array1, 2);
        System.out.println(Arrays.toString(array1));
        int[] array3 = new int[]{1, 3, 2, 7, 4};
        CycleSwap.cycleSwap(array3, 5);
        System.out.println(Arrays.toString(array3));
    }

    static void cycleSwap(int[] array) {
        int[] resultArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                array[i] = resultArray[resultArray.length - 1];
            } else {
                array[i] = resultArray[i - 1];
            }
        }
    }

    static void cycleSwap(int[] array, int shift) {
        int[] resultArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            int someCounterForShift = i - shift;
            if (someCounterForShift < 0) {
                array[i] = resultArray[resultArray.length - shift + i];
            } else {
                array[i] = resultArray[i - shift];
            }
        }
    }
}
