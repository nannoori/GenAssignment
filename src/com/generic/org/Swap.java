package com.generic.org;

import java.util.Arrays;
import java.util.Collections;

public class Swap {
    public static <T> T[] swap(T[] list, int firstPos, int secondPos) {
        Collections.swap(Arrays.asList(list), firstPos, secondPos);
        return list;
    }

    public static void main(String[] args) {
        String[] arr = {"mera", "city", "Hyd"};
        System.out.println("before swapping" + Arrays.toString(arr));
        String[] list = swap(arr, 1, 2);
        System.out.println("after swapping" + Arrays.toString(arr));

    }
}
