/**
 *  Java program to traverse through the Set.
 */

package com.mycollections;

import java.util.Set;
import java.util.TreeSet;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an instance of a TreeSet.
        Set<Integer> mySet = new TreeSet<>();

        // Adding elements to mySet.
        mySet.add(10);
        mySet.add(11);
        mySet.add(2);
        mySet.add(90);
        mySet.add(1);
        mySet.add(81);
        mySet.add(14);
        mySet.add(13);

        // Printing elements of mySet to console.
        System.out.println(mySet); // Output: [1, 2, 10, 11, 13, 14, 81, 90]

    }
}