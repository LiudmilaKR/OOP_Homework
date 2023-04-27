package HomeworksAdd.HWOOPadd.HWLesson5oopAdd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable {
    private List<Person> familyTree;

    public FamilyTree() {
        familyTree = new ArrayList<>();
    }
    public boolean addToFamilyTree(Person person){
        if (person.equals(null)) return false;
        if (familyTree.contains(person)) return false;
        else {
            familyTree.add(person);
            if (person.getFather() != null) person.getFather().addChild(person);
            if (person.getMother() != null) person.getMother().addChild(person);
            return true;
        }
    }

   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FamilyTree\n");
        for (Person pers : familyTree) {
            sb.append(pers);
            sb.append("\n");
        }
        return sb.toString();
    }
    // @Override
    // public Iterator<E> iterator() {
    //     // return new PersonIterator<E>(ftree);
    //     return new SomeIterator<E>(ftree);
    // }
    
}
