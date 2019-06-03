package LinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

    private LinkedList testList = new LinkedList();


    @Test
    public void testAddString() {
        testList.add(1);
        testList.add("Urara");
        assertEquals("1 Urara", testList.toString());
    }

    @Test
    public void testAddInteger() {
        testList.add(1);
        assertEquals("1", testList.toString());
    }



    @Test
    public void testGet() {
        testList.add(1);
        testList.add("Urara");
        assertEquals("1", testList.get(0) + "");
    }

    @Test
    public void testRemoveFirst() {
        testList.add(1);
        testList.add("Urara");
        testList.remove(0);
        assertEquals("Urara", testList.toString());
    }

    @Test
    public void testRemoveLast() {
        testList.add("Urara");
        testList.remove(0);
        assertEquals("The list is empty", testList.toString());
    }

    @Test
    public void testGetFromEmptyList() {
        assertEquals(null, testList.get(0));
    }

    @Test
    public void testAddDouble() {
        testList.add(10.5);
        assertEquals("10.5", testList.toString());
    }

    @Test
    public void testRemoveNonexistent() {
        testList.add(10.5);
        testList.remove(10);
        assertEquals("10.5", testList.toString());
    }
}