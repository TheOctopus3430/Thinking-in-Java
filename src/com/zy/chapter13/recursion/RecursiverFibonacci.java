package com.zy.chapter13.recursion;

import javax.swing.plaf.basic.BasicIconFactory;

public class RecursiverFibonacci {

    IntCall fib;

    RecursiverFibonacci() {
        fib = n -> n == 0 ? 0 :
                n == 1 ? 1 :
                        fib.call(n - 1) + fib.call(n - 2);
    }

    int fibonacci(int n) {
        return fib.call(n);
    }

    public static void main(String[] args) {
        RecursiverFibonacci recursiverFibonacci = new RecursiverFibonacci();
        int fibonacci = recursiverFibonacci.fibonacci(10);
        System.out.println(fibonacci);
    }


}
