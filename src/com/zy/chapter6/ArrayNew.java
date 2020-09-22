package com.zy.chapter6;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, };
        Integer[] b = new Integer[]{
                1, 2,
                3, // Autoboxing
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
