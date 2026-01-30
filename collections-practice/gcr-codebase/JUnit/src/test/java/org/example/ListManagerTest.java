package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {
    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setup() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    @DisplayName("Test Add Element")
    void testAddElement() {
        listManager.addElement(list, 5);
        listManager.addElement(list,10);
        assertEquals(2, listManager.getSize(list));
        assertTrue(list.contains(5));
        assertTrue(list.contains(10));
    }

    @Test
    @DisplayName("Test Remove Element")
    void testRemoveElement() {
        listManager.addElement(list, 5);
        listManager.addElement(list,10);
        listManager.removeElement(list, 5);
        assertEquals(1, listManager.getSize(list));
        assertFalse(list.contains(5));
    }

    @Test
    @DisplayName("Test Get Size")
    void testGetSize() {
        listManager.addElement(list, 5);
        listManager.addElement(list,10);
        assertEquals(2, listManager.getSize(list));
    }
}