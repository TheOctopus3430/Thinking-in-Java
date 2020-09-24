package com.zy.chapter10.mystatic;

public class Main {

    public static void main(String[] args) {
        Operations.runOps(new A(), new B(), new C());
    }
}

class A implements Operations {
    @Override
    public void execute() { System.out.println("A...Run"); }
}

class B implements Operations {
    @Override
    public void execute() { System.out.println("B...Run"); }
}

class C implements Operations {
    @Override
    public void execute() { System.out.println("C...Run"); }
}
