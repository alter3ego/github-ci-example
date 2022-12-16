package org.example;

public class Main {
    private final static StringManager stringManager = new StringManager();

    public static void main(String[] args) {
        System.out.println(stringManager.getReverseUppercaseString("Hello world!"));
    }
}