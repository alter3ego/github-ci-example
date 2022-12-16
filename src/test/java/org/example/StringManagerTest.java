package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringManagerTest {
    private final StringManager stringManager = new StringManager();

    @org.junit.jupiter.api.Test
    void getReverseUppercaseString() {
        String source = "Hello world!";
        String expected = "!DLROW OLLEH";

        String actual = stringManager.getReverseUppercaseString(source);

        assertEquals(expected, actual);
    }
}