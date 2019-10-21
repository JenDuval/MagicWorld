package com.magicworld.capture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CapturesTest {

    @Test
    public static void readInt(int min, int max) {
        int level = min + max;
        Assertions.assertEquals(10, level);
    }
}