package org.example.hashset;

import java.util.*;

public class Q1 {

    public static int solution(int [] A) {

        Set<Integer> positiveNum = new HashSet<>();

        // Get only positive numbers
        for (int num : A) {
            if (num > 0) {
                positiveNum.add(num);
            }
        }

        // Get the smallest positive number
        int smallestPositiveNum = 1;
        while (positiveNum.contains(smallestPositiveNum)) {
            smallestPositiveNum++;
        }

        return smallestPositiveNum;
    }

}
