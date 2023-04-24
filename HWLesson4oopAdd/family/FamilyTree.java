package HomeworksAdd.HWOOPadd.HWLesson4oopAdd.family;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.service.SomeIterator;;

public class FamilyTree<E> implements Serializable, Iterable<E> {//Tree<E> { // Serializable, Iterable<Person> {
    private List<E> ftree;

    public List<E> getFtree() {
        return ftree;
    }
    public FamilyTree() {
        ftree = new ArrayList<>();
    }
   
    public void addPerson(E species) {
        ftree.add(species);
        if (species instanceof Person) { //дичь какая-то получилась...
            if (((Person) (species)).getFather() != null) {
                ((Person) (species)).getFather().addChild((Person) (species));
            }
            if (((Person) (species)).getMother() != null) {
                ((Person) (species)).getMother().addChild(((Person) (species)));
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FamilyTree\n");
        for (E pers : ftree) {
            sb.append(pers);
            sb.append("\n");
        }
        return sb.toString();
    }
    @Override
    public Iterator<E> iterator() {
        // return new PersonIterator<E>(ftree);
        return new SomeIterator<E>(ftree);
    }
}
