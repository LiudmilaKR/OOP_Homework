package HomeworksAdd.HWOOPadd.HWLesson3oopAdd.family;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import HomeworksAdd.HWOOPadd.HWLesson3oopAdd.comparators.PersonIterator;

public class FamilyTree implements Serializable, Iterable<Person> {
    private List<Person> ftree;

    public List<Person> getFtree() {
        return ftree;
    }
    public FamilyTree() {
        ftree = new ArrayList<>();
    }
    public void addPerson(Person person) {
        ftree.add(person);
        if (person.getFather() != null) {
            person.getFather().addChild(person);
        }
        if (person.getMother() != null) {
            person.getMother().addChild(person);
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FamilyTree\n");
        for (Person pers : ftree) {
            sb.append(pers);
            sb.append("\n");
        }
        return sb.toString();
    }
    @Override
    public Iterator<Person> iterator() {
        return new PersonIterator(ftree);
        // return ftree.iterator();
    }
}
