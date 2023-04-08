package org.example.array.moveZeroes;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }

    public static void moveZeroes(int[] nums) {

        // 1) make temporary arraylist to store non-zero and zero numbers.
        // 2) combine two arraylist together where the one storing zero will be at the end.
        // 3) update the array.
        List<Integer> nonZero = new ArrayList<>();
        List<Integer> zero = new ArrayList<>();

        for (int num : nums) {
            if (num == 0) {
                zero.add(num);
            } else {
                nonZero.add(num);
            }
        }
        nonZero.addAll(zero);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nonZero.get(i);
        }

    }

}
