package org.example;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayStats {

    // For Loops

    public static int minForLoop(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array cannot be empty");
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static int maxForLoop(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array cannot be empty");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int sumForLoop(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Array cannot be null");
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    public static double avgForLoop(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array cannot be empty");
        int sum = sumForLoop(arr);
        return (double) sum / arr.length;
    }

    // APIs

    public static int minStream(int[] arr) {
        return Arrays.stream(arr)
                .min()
                .orElseThrow(() -> new IllegalArgumentException("Array cannot be empty"));
    }

    public static int maxStream(int[] arr) {
        return Arrays.stream(arr)
                .max()
                .orElseThrow(() -> new IllegalArgumentException("Array cannot be empty"));
    }

    public static int sumStream(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    public static double avgStream(int[] arr) {
        return Arrays.stream(arr)
                .average()
                .orElseThrow(() -> new IllegalArgumentException("Array cannot be empty"));
    }
}

