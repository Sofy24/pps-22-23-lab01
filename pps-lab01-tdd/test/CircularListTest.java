
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    private CircularList list;

    @BeforeEach
    void beforeEach(){
        this.list = new CircularListImpl();
    }

    /**@Disabled
    @Test public void testTodo(){
        Assertions.fail();
    }*/

    @Test
    void testAddAndSize(){
        list.add(4);
        assertEquals(1, this.list.size());
    }

    @Test
    void testIsEmpty(){
        assertEquals(true, list.isEmpty());
    }

    @Test
    void testNext(){
        list.add(4);
        list.add(5);
        assertEquals(Optional.of(4), list.next());
        assertEquals(Optional.of(5), list.next());
    }


    @Test
    void testPrevious(){
        testNext();
        assertEquals(Optional.of(5), list.previous());
    }


    @Test
    void testReset(){
        testNext();
        this.list.reset();
        assertEquals(Optional.of(4), list.next());
    }


}
