package org.example.array.majorityElement;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

    }

    public static int solution(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        // loop through each number
        // use hashmap to keep track of the occurance of each number
        for (int num : nums) {
            // increment the existing frequency number by 1 or increment 0 number (default) by 1 for
            // number that is not exist in the hashmap.
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            if (frequencyMap.get(num) > nums.length / 2) {
                return num;
            }
        }
        return -1; // Should not reach here as the problem assumes a majority element always exists
    }

}
