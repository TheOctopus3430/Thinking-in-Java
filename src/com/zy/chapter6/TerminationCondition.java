package com.zy.chapter6;

// housekeeping/TerminationCondition.java
// Using finalize() to detect a object that
// hasn't been properly cleaned up



class Book {
    boolean checkedOut = false;
    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (checkedOut) {
            System.out.println("Error: checked out");
        }
    }
}

public class TerminationCondition {

    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();

    }

}

