package HomeworksAdd.HWOOPadd.HWLesson2oopAdd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable {
    private List<Person> ftree;

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
    public void saveFamilyTreeToFile(FileHandler fh, String path) {
        fh.putFamilyTreeToFile(this, path);
    }
    public void takeFamilyTreeFromFile(FileHandler fh, String path) {
        System.out.println(fh.loadFamilyTreeFromFile(path));
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FamilyTree\n");
        for (Person pers : ftree) {
            sb.append(pers);
        }
        return sb.toString();
    }
}
