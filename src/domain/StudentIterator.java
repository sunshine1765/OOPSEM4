package domain;

import java.util.List;
import java.util.Iterator;

public class StudentIterator implements Iterator {
    private int count;
    private List<Student> list;

    public StudentIterator(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return count < list.size();
    }

    @Override
    public Object next() {
        int index = count;
        count++;
        return list.get(index);

    }
}
