package com.zy.chapter13.priority;

public interface MyInterface {

    default void run() {
        System.out.println("MyInterface::run");
    }
}
