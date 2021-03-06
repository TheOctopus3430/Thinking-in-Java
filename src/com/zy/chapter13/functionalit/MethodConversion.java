package com.zy.chapter13.functionalit;

// functional/MethodConversion.java

import java.util.function.*;

class In1 {
}

class In2 {
}

public class MethodConversion {
    static void accept1(In1 i1, In2 i2) {
        System.out.println("accept()");
    }

    static void someOtherName(In1 i1, In2 i2) {
        System.out.println("someOtherName()");
    }

    public static void main(String[] args) {
        BiConsumer<In1, In2> bic;

        bic = MethodConversion::accept1;
        bic.accept(new In1(), new In2());

        bic = MethodConversion::someOtherName;
//         bic.someOtherName(new In1(), new In2()); // Nope
        bic.accept(new In1(), new In2());
    }
}
