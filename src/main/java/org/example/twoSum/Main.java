package org.example.twoSum;

public class Main {

    public int[] twoSum(int[] nums, int target) {

        // brute force
        // - for each number in the array, add it with the rest of the number in the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }



}
