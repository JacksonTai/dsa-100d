package org.example.array.convert1DArrayto2DArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

    }

    public static int[][] construct2DArray(int[] original, int m, int n) {

        // return empty 2d array if the numbers in original array doesn't match the 2d array size.
        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] result = new int[m][n];

        // for indexing of row:
        // number will be at next row by dividing the index of number with the number of column.
        // for indexing of column:
        // use modulus calculator to get the idea of how it works.
        for (int i = 0; i < original.length; i++) {
            result[i / n][i % n] = original[i];
        }

        return result;
    }

}
