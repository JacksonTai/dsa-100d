package org.example.array.removeDuplicatesFromSortedArray;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] nums) {
        // left pointer to keep track of the index of the latest unique number and the number of
        // unique number
        int l = 1;
        for (int r = 1; r < nums.length; r++) {
            // since the right pointer is different with its previous value, it's a new unique value
            if (nums[r] != nums[r - 1]) {
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }

}
