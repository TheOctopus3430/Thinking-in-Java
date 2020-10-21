package com.zy.chapter13.functionalit;

public class TriFunctionTest {
    static String run(int i, double d, boolean b) {
        System.out.println("-----------------");
        return "AAAA";
    }

    public static void main(String[] args) {
        TriFunction<Integer, Double, Boolean, String> triFunction = TriFunctionTest::run;
        triFunction.apply(1, 2d, true);

    }


}
