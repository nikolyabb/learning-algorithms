package main.java.su.birukov.algorithms;

import java.util.Arrays;

public class QuickSort {
    public static int[] qsort(int[] array) {
        if (array.length < 2) {
            return array;
        } else if (array.length == 2) {
            if (array[0] > array[1]) {
                return array;
            } else {
                int buf = array[0];
                array[0] = array[1];
                array[1] = buf;
                return array;
            }
        } else {
            int baseElement = 0;
            int[] lesserElements = new int[0];
            int[] greaterElements = new int[0];
            int[] equalElements = new int[0];

            for (int i = 0; i < array.length ; i++) {
                if (array[baseElement] == array[i]) {
                    equalElements = Arrays.copyOf(equalElements, equalElements.length + 1);
                    equalElements[equalElements.length - 1] = array[i];
                } else if (array[baseElement] > array[i]) {
                    lesserElements = Arrays.copyOf(lesserElements, lesserElements.length + 1);
                    lesserElements[lesserElements.length - 1] = array[i];
                } else {
                    greaterElements = Arrays.copyOf(greaterElements, greaterElements.length + 1);
                    greaterElements[greaterElements.length - 1] = array[i];
                }
            }
            lesserElements = qsort(lesserElements);
            greaterElements = qsort(greaterElements);

            // Assume it is not the best concatenation of 3 arrays :( Please let me know how to improve if you know
            int resultLength = lesserElements.length + greaterElements.length + equalElements.length;

            int[] result = Arrays.copyOf(lesserElements, resultLength);

            for (int i = 0; i < equalElements.length ; i++) {
                result[lesserElements.length + i] = equalElements[i];
            }

            for (int i = 0; i < greaterElements.length ; i++) {
                result[lesserElements.length + equalElements.length + i] = greaterElements[i];
            }

            return result;
        }
    }
}
