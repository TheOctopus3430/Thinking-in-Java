package com.zy.chapter13.methodReferences;

class Go {
    static void go() {
        System.out.println("Go::go()");
    }
}

public class RunnableMethodReference {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("AAA");
            }
        }).start();
        //Lambda写法
        new Thread(() -> System.out.println("BBB")).start();
        //满足Runnable接口run()的签名
        new Thread(Go::go).start();
    }
}
