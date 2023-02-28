import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import lab01.tdd.step2.CircularListIterator;
import lab01.tdd.step2.CircularListIteratorImpl;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListIteratorTest {

    private CircularListIterator list;

    @BeforeEach
    void beforeEach(){
        this.list = new CircularListIteratorImpl();
    }


    @Test
    void testAddAndSize(){
        this.list.add(7);
        assertEquals(1, this.list.size());
    }

    @Test
    void testIsEmpty(){
        assertEquals(true, this.list.isEmpty());
    }

    @Test
    void testForwardIterator(){
        this.list.add(8);
        this.list.add(9);
        this.list.add(10);
        assertEquals(Integer.valueOf(8), this.list.forwardIterator().next());
        assertEquals(Integer.valueOf(9), this.list.forwardIterator().next());
        assertEquals(Integer.valueOf(10), this.list.forwardIterator().next());
        assertEquals(Integer.valueOf(8), this.list.forwardIterator().next());
    }

    @Test
    void testBackwardIterator(){
        this.list.add(1);
        this.list.add(2);
        this.list.add(3);
        assertEquals(Integer.valueOf(3), this.list.backwardIterator().next());
        assertEquals(Integer.valueOf(2), this.list.backwardIterator().next());
        assertEquals(Integer.valueOf(1), this.list.backwardIterator().next());
        assertEquals(Integer.valueOf(3), this.list.backwardIterator().next());
    }


}
