package com.zy.chapter10.priority;

public interface MyInterface {

    default void run() {
        System.out.println("MyInterface::run");
    }
}
