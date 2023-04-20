package HomeworksAdd.HWOOPadd.HWLesson3oopAdd.service;

import HomeworksAdd.HWOOPadd.HWLesson3oopAdd.comparators.PersonComparatorByLastName;
import HomeworksAdd.HWOOPadd.HWLesson3oopAdd.comparators.PersonComparatorByYearBirsday;
import HomeworksAdd.HWOOPadd.HWLesson3oopAdd.family.FamilyTree;

public class Service {
    FamilyTree familyTree;

    public Service(FamilyTree familyTree) {
        this.familyTree = familyTree;
    }
    public void saveFamilyTreeToFile(FileHandler fh, String path) {
        fh.putFamilyTreeToFile(familyTree, path);
    }
    public void takeFamilyTreeFromFile(FileHandler fh, String path) {
        System.out.println(fh.loadFamilyTreeFromFile(path));
    }
    public void sortByLastName() {
        familyTree.getFtree().sort(new PersonComparatorByLastName());
    }

    public void sortByYearBirsday() {
        familyTree.getFtree().sort(new PersonComparatorByYearBirsday());
    }
    
}
