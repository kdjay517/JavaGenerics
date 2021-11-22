package com.bridgelabz.generics;

public class MaximumTest<E extends Comparable<E>> {

    E[] inputArray;
    public MaximumTest(E[] inputArray) {
        this.inputArray = inputArray;
    }

    public static <E extends Comparable<E>> E findMaximum(E[] inputArray) {
        E max = inputArray[0];
        for (E element : inputArray) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

}
