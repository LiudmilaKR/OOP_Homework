package HomeworksAdd.HWOOPadd.HWLesson1oopAdd;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Person> ftree;

    public FamilyTree() {
        ftree = new ArrayList<>();
    }
    public void addPerson(Person person) {
        ftree.add(person);
    }
    public void getChildren(Person person) {
        for (Person per : ftree) {
            if(per.getFather() == null) continue;
            else if (per.getFather().equals(person))
                System.out.println(per.getLastName() + " " + per.getFirstName() + " ребенок "+ person); 
        }
    }
    @Override
    public String toString() {
        return "FamilyTree\n" + ftree;
    }
}
