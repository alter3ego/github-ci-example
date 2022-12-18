package org.example;

public class StringManager {

    public String getReverseUppercaseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.toLowerCase());

        return stringBuilder.reverse().toString();
    }
}
