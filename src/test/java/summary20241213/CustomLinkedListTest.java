package summary20241213;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CustomLinkedListTest {
    CustomLinkedList cus ;
    @BeforeEach
    public  void  init(){
         cus = new CustomLinkedList();
    }
    @Test
    public void pushToHeadTest(){
        cus.pushToHead("A");
        assertEquals("A",cus.get(0));
    };

    @Test
    public void pushToTailTest(){
        cus.pushToHead("A");
        cus.pushToTail("B");
        assertEquals("B",cus.get(1));
    }
    @Test
    public void pushToIndexTest() {
        assertThrows(RuntimeException.class,()->cus.pushToIndex("A",5));
        cus.pushToHead("A");
        cus.pushToIndex("B",1);
//        cus.pushToIndex("C",4);
        assertEquals("B",cus.get(1));

    }
    @Test
    public void removeFirstTest() {
        cus.pushToHead("A");
        cus.pushToTail("B");
        cus.removeFirst();
        assertEquals("B",cus.get(0));
    }
@Test
public void getTest(){
    cus.pushToHead("A");
    cus.pushToHead("B");
    cus.pushToHead("C");
    assertEquals("B",cus.get(1));
}
@Test
 public void  sizeTest(){
    cus.pushToHead("A");
    cus.pushToHead("B");
    cus.pushToHead("C");
    assertEquals(3,cus.size());
}

}