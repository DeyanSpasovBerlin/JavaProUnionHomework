package Homework_13_12_2024;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import summary20241213.CustomLinkedList;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class CustomDynamicArrayTest {
    CustomDynamicArray cda;
    @BeforeEach
    public  void  init(){
        cda= new CustomDynamicArray();
    }

    @Test
    void getSize() {
        assertEquals(1,cda.getSize());
        assertEquals(0,cda.getCount());
        cda.add(1);
        assertEquals(1,cda.getSize());
        assertEquals(1,cda.getCount());
    }

    @Test
    void add() {
        assertEquals(1,cda.getSize());
        assertEquals(0,cda.getCount());
        cda.add(1);
        cda.add(2);
        cda.add(3);
        cda.add(4);
        assertEquals(4,cda.getSize());
        assertEquals(4,cda.getCount());



    }

    @Test
    void getCount() {
        assertEquals(0,cda.getCount());
        cda.add(1);
        cda.add(2);
        cda.add(3);
        cda.add(4);
        cda.add(5);
        assertEquals(5,cda.getCount());

    }

    @Test
    void addAt() {
        cda.add(1);
        cda.add(2);
        cda.add(3);
        cda.add(4);
        cda.add(5);
        assertThrows(RuntimeException.class,() -> cda.addAt(6,6));//Index is out of bounds
        cda.addAt(2,22);
        assertEquals(22,cda.get(2));
    }

    @Test
    void growSize() {
        cda.add(1);
        cda.add(2);
        assertEquals(2,cda.getSize());
        cda.growSize();
        assertEquals(4,cda.getSize());

    }

    @Test
    void shrinkSize() {
        cda.add(1);
        cda.add(2);
        cda.add(3);
        cda.add(4);
        cda.add(5);
        assertEquals(8,cda.getSize());
        assertEquals(5,cda.getCount());
        cda.shrinkSize();
        assertEquals(5,cda.getSize());
        assertEquals(5,cda.getCount());

    }

    @Test
    void remove() {
        cda.add(1);
        cda.add(2);
        cda.add(3);
        cda.add(4);
        cda.add(5);
        assertEquals(8,cda.getSize());
        assertEquals(5,cda.getCount());
        cda.remove();
        assertEquals(8,cda.getSize());
        assertEquals(4,cda.getCount());
    }

    @Test
    void removeAt() {
        cda.add(1);
        cda.add(2);
        cda.add(3);
        cda.add(4);
        cda.add(5);
        assertEquals(8,cda.getSize());
        assertEquals(5,cda.getCount());
        assertEquals(4,cda.get(3));
        cda.removeAt(3);
        assertEquals(8,cda.getSize());
        assertEquals(4,cda.getCount());
        assertEquals(5,cda.get(3));

    }

    @Test
    void set() {
        cda.add(1);
        cda.add(2);
        cda.add(3);
        cda.add(4);
        cda.add(5);
        assertEquals(8,cda.getSize());
        assertEquals(5,cda.getCount());
        assertEquals(4,cda.get(3));
        cda.set(3,44);
        assertEquals(8,cda.getSize());
        assertEquals(5,cda.getCount());
        assertEquals(44,cda.get(3));

    }

    @Test
    void get() {
        cda.add(1);
        cda.add(2);
        cda.add(3);
        cda.add(4);
        cda.add(5);
        assertEquals(4,cda.get(3));
        assertThrows(RuntimeException.class,() -> cda.get(66));//Index is out of bounds
    }

    @Test
    void clear() {
        cda.add(1);
        cda.add(2);
        cda.add(3);
        cda.add(4);
        cda.add(5);
        assertTrue(!cda.isEmpty());
        cda.clear();
        assertTrue(cda.isEmpty());
        assertThrows(RuntimeException.class,() -> cda.get(0));//Index is out of bounds
    }

    @Test
    void contains() {
        cda.add(1);
        cda.add(2);
        cda.add(3);
        cda.add(4);
        cda.add(5);
        assertEquals(4,cda.contains(5));
        assertEquals(-1,cda.contains(6));
    }

    @Test
    void isEmpty() {
        cda.add(1);
        cda.add(2);
        cda.add(3);
        cda.add(4);
        cda.add(5);
        assertFalse(cda.isEmpty());
        cda.clear();
        assertTrue(cda.isEmpty());

    }

    @Test
    void iterator() {
        cda.add(1);
        cda.add(2);
        Iterator<Integer> iter = cda.iterator();
        assertEquals(1,iter.next());
        assertTrue(iter.hasNext());
        assertEquals(2,iter.next());
        assertFalse(iter.hasNext());
    }
}