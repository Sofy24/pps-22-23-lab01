package lab01.tdd;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList {

    private List<Integer> list = new LinkedList<>(); 
    private int currentPosition = 0;

    public CircularListImpl() {

    }

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
    public Optional<Integer> next() {
        currentPosition = currentPosition == this.list.size() ? 0 : 
        currentPosition;
        return Optional.of(this.list.get(currentPosition++));

    }

    @Override
    public Optional<Integer> previous() {
        currentPosition = currentPosition == this.list.size() ? this.list.size() - 1 : 
        currentPosition;
        return Optional.of(this.list.get(currentPosition--));
    }

    @Override
    public void reset() {
        this.currentPosition = 0;
    }

}
