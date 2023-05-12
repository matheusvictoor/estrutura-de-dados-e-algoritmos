package com.eda.teste;

import com.eda.sequenciais.ArrayList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListTest {
    private ArrayList<String> list;

    @Before
    public void setUp() {
        this.list = new ArrayList<>();
    }
    @Test
    public void testAddAndGet() {
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(list.get(0), "a");
        assertEquals(list.get(1), "b");
        assertEquals(list.get(2), "c");
    }

    @Test
    public void testSet() {
        list.add("a");
        list.add("b");
        list.add("c");
        list.set(1, "d");
        assertEquals(list.get(0), "a");
        assertEquals(list.get(1), "d");
        assertEquals(list.get(2), "c");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddInvalidIndex() {
        list.add("a");
        list.add("b");
        list.add(5, "c");
    }

    @Test
    public void testAddIndex() {
        list.add("a");
        list.add("b");
        list.add(1, "c");
        assertEquals(list.get(0), "a");
        assertEquals(list.get(1), "c");
        assertEquals(list.get(2), "b");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetInvalidIndex() {
        list.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetInvalidIndex() {
        list.add("a");
        list.set(1, "b");
    }

    @Test
    public void testIsEmpty() {
        assertTrue(list.isEmpty());
        list.add("a");
        assertFalse(list.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(list.size(), 0);
        list.add("a");
        assertEquals(list.size(), 1);
        list.add("b");
        assertEquals(list.size(), 2);
    }

    @Test
    public void testToString() {
        assertEquals(list.toString(), "[]");
        list.add("a");
        assertEquals(list.toString(), "[a]");
        list.add("b");
        assertEquals(list.toString(), "[a, b]");
    }

    @Test
    public void testIndexOf() {
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(list.indexOf("b"), 1);
        assertEquals(list.indexOf("d"), -1);
    }

    @Test
    public void testContains() {
        list.add("a");
        list.add("b");
        assertTrue(list.contains("a"));
        assertTrue(list.contains("b"));
        assertFalse(list.contains("c"));
    }

    @Test
    public void testRemove() {
        list.add("a");
        list.add("b");
        list.add("c");
        list.remove(1);
        assertEquals(list.size(), 2);
        assertEquals(list.get(0), "a");
        assertEquals(list.get(1), "c");
        assertTrue(list.remove("a"));
        assertEquals(list.size(), 1);
    }
}
