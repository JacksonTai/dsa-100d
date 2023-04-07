package org.example.sandbox;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] arr = new String[1];
        String[] arr2 = {"a", "b", "c"};

        // ################### LIST ###################
        // arrayList
        List<String> list = new ArrayList<>();
        list.add("a");
        list.remove("a");
        list.size();

        // linkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        System.out.println(linkedList);

        // stack
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.pop();

        // ################### QUEUE ###################
        // linkedList
        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.poll();

        // priorityQueue

    }

}
