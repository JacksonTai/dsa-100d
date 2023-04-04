package org.example.twoSum;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public int[] twoSum(int[] nums, int target) {

        // // brute force (time: O(n)2, space: O(1))
        // // - for each number in the array, add it with the rest of the number in the array
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[] {i, j};
        //         }
        //     }
        // }
        // return null;

        // Improved solution (time: O(n), space: O(n))
        /* target minus looping number
           if the opposite number isn't in the map, put it in there

           if the opposite number is in the map, return the index of
           looping number and the opposite number in the map
        */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int currentNum = nums[i];
            // currentNum + oppositeNum = target
            // oppositeNum = target - currentNum
            int oppositeNum = target - currentNum;
            if (map.containsKey(oppositeNum)) {
                return new int[] {i, map.get(oppositeNum)};
            }
            map.put(currentNum, i);
        }
        return null;

    }



}
