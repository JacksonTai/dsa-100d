package org.example.array.findAllNumbersDisappearedInAnArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }

}
