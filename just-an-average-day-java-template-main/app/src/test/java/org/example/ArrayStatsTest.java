package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayStatsTest {

    private final int[] testArray = {5, 3, 8, 1, 9};

    @Test
    void testMinForLoop() {
        assertEquals(1, ArrayStats.minForLoop(testArray));
        assertThrows(IllegalArgumentException.class, () -> ArrayStats.minForLoop(new int[]{}));
    }

    @Test
    void testMaxForLoop() {
        assertEquals(9, ArrayStats.maxForLoop(testArray));
        assertThrows(IllegalArgumentException.class, () -> ArrayStats.maxForLoop(new int[]{}));
    }

    @Test
    void testSumForLoop() {
        assertEquals(26, ArrayStats.sumForLoop(testArray));
        assertEquals(0, ArrayStats.sumForLoop(new int[]{}));
    }

    @Test
    void testAvgForLoop() {
        assertEquals(5.2, ArrayStats.avgForLoop(testArray), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> ArrayStats.avgForLoop(new int[]{}));
    }

    @Test
    void testMinStream() {
        assertEquals(1, ArrayStats.minStream(testArray));
        assertThrows(IllegalArgumentException.class, () -> ArrayStats.minStream(new int[]{}));
    }

    @Test
    void testMaxStream() {
        assertEquals(9, ArrayStats.maxStream(testArray));
        assertThrows(IllegalArgumentException.class, () -> ArrayStats.maxStream(new int[]{}));
    }

    @Test
    void testSumStream() {
        assertEquals(26, ArrayStats.sumStream(testArray));
        assertEquals(0, ArrayStats.sumStream(new int[]{}));
    }

    @Test
    void testAvgStream() {
        assertEquals(5.2, ArrayStats.avgStream(testArray), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> ArrayStats.avgStream(new int[]{}));
    }
}
