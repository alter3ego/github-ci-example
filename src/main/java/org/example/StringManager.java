package org.example;

public class StringManager {

    public String getReverseUppercaseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.toUpperCase());

        return stringBuilder.reverse().toString();

    }
}
