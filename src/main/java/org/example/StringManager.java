package org.example;

public class StringManager {

    public String getReverseUppercaseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.toLowerCase());

        String string1 = stringBuilder.reverse().toString();
        return string1;
    }
}
