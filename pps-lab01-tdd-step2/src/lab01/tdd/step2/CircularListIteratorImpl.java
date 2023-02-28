package lab01.tdd.step2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CircularListIteratorImpl implements CircularListIterator {

    private List<Integer> list = new ArrayList<>(); 
    private int currentPosition = 0;
    
    @Override
    public void add(int element) {
        this.list.add(element);
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
    @Override
    public Iterator<Integer> forwardIterator() {
        return new Iterator<Integer>(){

            @Override
            public boolean hasNext() {
                return currentPosition < list.size();
            }
    
            @Override
            public Integer next() {
                return list.get(currentPosition++ % list.size());
            }
        };
    }

    @Override
    public Iterator<Integer> backwardIterator() {
        return new Iterator<Integer>(){

            @Override
            public boolean hasNext() {
                return currentPosition >= 0;
            }
    
            @Override
            public Integer next() {
                return list.get(list.size() - 1 + (currentPosition-- % list.size()));
            }
        };
    }

}
