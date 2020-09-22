package com.zy.chapter9;

// reuse/Cartoon.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Constructor calls during inheritance
class Art {
    Art(int i) {
        System.out.println("Art constructor");
    }
}
class Drawing extends Art {
    Drawing(int i) {
        super(i);
        System.out.println("Drawing constructor");
    }
}

public class Cartoon extends Drawing {
    public Cartoon(int i) {
        super(i);
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon(1);
    }
}
/* Output:
Art constructor
Drawing constructor
Cartoon constructor
*/
