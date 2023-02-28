import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
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


    @Test
    void testAddAndSize(){
        this.list.add(4);
        assertEquals(1, this.list.size());
    }

    @Test
    void testIsEmpty(){
        assertEquals(true, this.list.isEmpty());
    }

    @Test
    void testNext(){
        this.list.add(4);
        this.list.add(5);
        assertEquals(Optional.of(4), this.list.next());
        assertEquals(Optional.of(5), this.list.next());
    }


    @Test
    void testPrevious(){
        testNext();
        assertEquals(Optional.of(5), this.list.previous());
    }


    @Test
    void testReset(){
        testNext();
        this.list.reset();
        assertEquals(Optional.of(4), this.list.next());
    }


}
