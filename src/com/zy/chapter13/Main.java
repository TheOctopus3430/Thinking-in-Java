package com.zy.chapter13;

public  interface Main {
    int a = 1;

     default int add(int a, int b) {
        return a + b;
    }


}
