package HomeworksAdd.HWOOPadd.HWLesson4oopAdd.service;

import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.family.FamilyTree;
import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.family.Gender;
import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.family.Person;

public class Service {
    FamilyTree<Person> familyTree;

    public Service() {
        this(null);
    }
    public Service(FamilyTree<Person> familyTree) {
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
    public FamilyTree<Person> newFamilyTree() {
        Person person1 = new Person("Иванов", "Петр", 1962, Gender.Male, null, null);
        Person person2 = new Person("Иванова", "Наталья", 1965, Gender.Female, null, null);
        Person person3 = new Person("Иванов", "Егор", 1986, Gender.Male, person1, person2);
        Person person4 = new Person("Иванов", "Сергей", 1990, Gender.Male, person1, person2);
        Person person7 = new Person("Григорьев", "Петр", 1968, Gender.Male, null, null);
        Person person8 = new Person("Григорьева", "Алина", 1971, Gender.Female, null, null);
        Person person5 = new Person("Иванова", "Марина", 1990, Gender.Female, person7, person8);
        Person person6 = new Person("Иванов", "Алексей", 2022, Gender.Male, person3, person5);
        FamilyTree<Person> familyTree1 = new FamilyTree<>();
        familyTree1.addPerson(person1);
        familyTree1.addPerson(person2);
        familyTree1.addPerson(person3);
        familyTree1.addPerson(person4);
        familyTree1.addPerson(person5);
        familyTree1.addPerson(person6);
        familyTree1.addPerson(person7);    
        familyTree1.addPerson(person8);
        return familyTree1;
    }
        // FileHandler fh = new FileHandler(); // Это вообще не понимаю, как "вписывать в общую схему"
        // Service service = new Service(familyTree1);
        // service.saveFamilyTreeToFile(fh, "HomeworksAdd/HWOOPadd/HWLesson4oopAdd/service/Tree.out");
        // service.takeFamilyTreeFromFile(fh, "HomeworksAdd/HWOOPadd/HWLesson4oopAdd/service/Tree.out");
}
