package com.zy.chapter13.recursion;


/**
 * @author zhangyu
 */
public class RecursiveFactorial {

    static IntCall fact;

    public static void main(String[] args) {

        fact = n -> n == 0 ? 1 : n * fact.call(n - 1);
        int call = fact.call(5);
        System.out.println(call);
    }
}
