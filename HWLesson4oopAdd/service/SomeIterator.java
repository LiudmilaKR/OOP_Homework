package HomeworksAdd.HWOOPadd.HWLesson4oopAdd.service;

import java.util.Iterator;
import java.util.List;

public class SomeIterator<E> implements Iterator<E> {
    private List<E> speciesList;
    private int index;

    public SomeIterator(List<E> speciesList) {
        this.speciesList = speciesList;
    }

    @Override
    public boolean hasNext() {
        return index < speciesList.size();
    }

    @Override
    public E next() {
        return speciesList.get(index++);
    } 
}
