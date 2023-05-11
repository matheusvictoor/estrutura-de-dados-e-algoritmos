package com.eda.teste;

import static org.junit.Assert.*;

import com.eda.sequenciais.LinkedList;
import org.junit.Before;
import org.junit.Test;
import java.util.NoSuchElementException;

public class LinkedListTest {

    private LinkedList<Integer> list;

    @Before
    public void setUp() {
        list = new LinkedList<>();
    }

    @Test
    public void testAddFirst() {
        list.addFirst(1);
        assertEquals(1, list.size());
        assertEquals(Integer.valueOf(1), list.getFirst());

        list.addFirst(2);
        assertEquals(2, list.size());
        assertEquals(Integer.valueOf(2), list.getFirst());
    }

    @Test
    public void testAddLast() {
        list.addLast(1);
        assertEquals(1, list.size());
        assertEquals(Integer.valueOf(1), list.getLast());

        list.addLast(2);
        assertEquals(2, list.size());
        assertEquals(Integer.valueOf(2), list.getLast());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(list.isEmpty());

        list.addFirst(1);
        assertFalse(list.isEmpty());
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFirstWhenListIsEmpty() {
        list.getFirst();
    }

    @Test
    public void testGetFirst() {
        list.addFirst(1);
        assertEquals(Integer.valueOf(1), list.getFirst());

        list.addFirst(2);
        assertEquals(Integer.valueOf(2), list.getFirst());
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLastWhenListIsEmpty() {
        list.getLast();
    }

    @Test
    public void testGetLast() {
        list.addFirst(1);
        assertEquals(Integer.valueOf(1), list.getLast());

        list.addLast(2);
        assertEquals(Integer.valueOf(2), list.getLast());
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveFirstWhenListIsEmpty() {
        list.removeFirst();
    }

    @Test
    public void testRemoveFirst() {
        list.addFirst(1);
        assertEquals(Integer.valueOf(1), list.removeFirst());
        assertTrue(list.isEmpty());

        list.addFirst(1);
        list.addFirst(2);
        assertEquals(Integer.valueOf(2), list.removeFirst());
        assertEquals(Integer.valueOf(1), list.removeFirst());
        assertTrue(list.isEmpty());
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveLastWhenListIsEmpty() {
        list.removeLast();
    }

    @Test
    public void testRemoveLast() {
        list.addFirst(1);
        assertEquals(Integer.valueOf(1), list.removeLast());
        assertTrue(list.isEmpty());

        list.addFirst(1);
        list.addLast(2);
        assertEquals(Integer.valueOf(2), list.removeLast());
        assertEquals(Integer.valueOf(1), list.removeFirst());
        assertTrue(list.isEmpty());
    }

    @Test
    public void testContains() {
        assertFalse(list.contains(1));

        list.addFirst(1);
        assertTrue(list.contains(1));

        list.addLast(2);
        assertTrue(list.contains(2));

        assertFalse(list.contains(3));
    }

    @Test
    public void testIndexOf() {
        assertEquals(-1, list.indexOf(1));

        list.addFirst(1);
        assertEquals(0, list.indexOf(1));

        list.addLast(2);
        assertEquals(1, list.indexOf(2));

        assertEquals(-1, list.indexOf(3));
    }

    @Test
    public void testSum() {
        assertEquals(0, list.sum(list.head));

        list.addFirst(1);
        assertEquals(1, list.sum(list.head));

        list.addLast(2);
        assertEquals(3, list.sum(list.head));

        list.addLast(3
