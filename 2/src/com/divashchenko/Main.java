package com.divashchenko;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {2, 3, 5, 4, 6, 0, 10, 1, 8};

        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println(Arrays.toString(evenAndOdd(arr)));
    }

    private static int[] evenAndOdd (int[] arr) {
        int[] tmp = new int[arr.length];
        int countLeft = 0;
        int countRight = tmp.length - 1;

        for (int i1 : arr) {
            if (i1 % 2 == 0) {
                tmp[countLeft] = i1;
                countLeft++;
            } else {
                tmp[countRight] = i1;
                countRight--;
            }
        }

        return tmp;
    }
}
