package org.example.array.containsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

}
