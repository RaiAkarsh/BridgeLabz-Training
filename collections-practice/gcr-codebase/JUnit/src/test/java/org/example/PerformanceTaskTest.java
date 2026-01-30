package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceTaskTest {

    @Test
    @Timeout(2) // test fails if execution takes more than 2 seconds
    void testLongRunningTaskTimeout() {
        PerformanceTask task = new PerformanceTask();
        String result = task.longRunningTask();
        assertEquals("Task Completed", result);
    }
}
