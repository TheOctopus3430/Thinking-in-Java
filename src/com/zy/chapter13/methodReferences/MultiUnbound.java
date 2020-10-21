package com.zy.chapter13.methodReferences;

// 未绑定的方法与多参数的结合运用

class Demo {
    void two(int i, double d) {
        System.out.println("call two————" + i + d);
    }

    void three(int i, double d, String s) {
    }

    void four(int i, double d, String s, char c) {
    }
}

interface TwoArgs {
    void call2(Demo athis, int i, double d);
}

interface ThreeArgs {
    void call3(Demo athis, int i, double d, String s);
}

interface FourArgs {
    void call4(
            Demo athis, int i, double d, String s, char c);
}

public class MultiUnbound {
    public static void main(String[] args) {
        Demo demo = new Demo();
        TwoArgs twoArgs = Demo::two;
        twoArgs.call2(demo, 2, 3);


//        TwoArgs twoargs = Demo::two;
//        ThreeArgs threeargs = Demo::three;
//        FourArgs fourargs = Demo::four;
//        Demo athis = new Demo();
//        twoargs.call2(athis, 11, 3.14);
//        threeargs.call3(athis, 11, 3.14, "Three");
//        fourargs.call4(athis, 11, 3.14, "Four", 'Z');
    }
}