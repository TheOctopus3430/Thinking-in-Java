package com.zy.chapter10.mystatic;


/**
 * 接口中的静态方法
 * Java 8 允许在接口中添加静态方法。这么做能恰当地把工具功能置于接口中，
 * 从而操作接口，或者成为通用的工具：
 */
public interface Operations {

    void execute();

    static void runOps(Operations... ops) {
       show("Start..."+ops.length);
        for (Operations op: ops) {
            op.execute();
        }
    }

    static void show(String msg) {
        System.out.println(msg);
    }
}
