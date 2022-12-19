package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringManagerTest {
    private final StringManager stringManager = new StringManager();

    @Test
    void getReverseUppercaseString() {
        String source = "Hello world!";
        String expected = "!DLROW OLLEH";

        String actual = stringManager.getReverseUppercaseString(source);

        assertEquals(expected, actual);
    }
}