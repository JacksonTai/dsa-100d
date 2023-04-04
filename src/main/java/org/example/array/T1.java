package org.example.array;

import java.util.*;

public class T1 {

    public static void main(String[] args) {
        Integer[] arr = {1, 5, 6, 7, 8, 2, 3};


        System.out.print("Please enter number to be searched: ");
        Scanner scanner = new Scanner(System.in);
        int searchNum = scanner.nextInt();

        // 1) linear search
//        for (int num : arr) {
//            if (num == searchNum) {
//                System.out.println(num);
//                break;
//            }
//        }

        // 2) binary search
//        Arrays.sort(arr);
//        System.out.println(arr[Arrays.binarySearch(arr, searchNum)]);

        // 3) list.contains()
//        List<Integer> list = Arrays.asList(arr);
//        boolean res = list.contains(searchNum);
//        System.out.println(res);

        // 4) Stream API

    }

}
