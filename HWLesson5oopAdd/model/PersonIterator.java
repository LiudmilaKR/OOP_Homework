package HomeworksAdd.HWOOPadd.HWLesson5oopAdd.model;

import java.util.Iterator;
import java.util.List;

// import HomeworksAdd.HWOOPadd.HWLesson3oopAdd.family.Person;

public class PersonIterator implements Iterator<Person>{
    private List<Person> personList;
    private int index;

    public PersonIterator(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public boolean hasNext() {
        return index < personList.size();
    }

    @Override
    public Person next() {
        return personList.get(index++);
    } 
}
