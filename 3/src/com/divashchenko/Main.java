package com.divashchenko;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] arr = {
                {0, 1, 0},
                {1, 1, 0},
                {0, 0, 1},
                {0, 1, 1}
        };

        arrayToString(arr);
        System.out.println();
        arrayToString(changeArray(arr));
    }

    private static int[][] changeArray(int[][] arr) {
        int[][] tmp = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][arr[i].length - 1 - j] == 1) {
                    tmp[i][j] = 0;
                } else {
                    tmp[i][j] = 1;
                }
            }
        }
        return tmp;
    }

    private static void arrayToString(int[][] arr) {
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
