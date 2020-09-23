package com.zy.chapter13.multi;

public class Jim implements Jim1, Jim2 {

    @Override
    public void jim() {
        //显示的指定使用哪一个接口的方法
        Jim2.super.jim();
    }

    public static void main(String[] args) {
        new Jim().jim();
    }
}
