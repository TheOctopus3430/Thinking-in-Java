package com.zy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
