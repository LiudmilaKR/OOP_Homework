package HomeworksAdd.HWOOPadd.HWLesson2oopAdd;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Петр", 1962, Gender.Male, null, null);
        Person person2 = new Person("Иванова", "Наталья", 1965, Gender.Female, null, null);
        Person person3 = new Person("Иванов", "Егор", 1986, Gender.Male, person1, person2);
        Person person4 = new Person("Иванов", "Сергей", 1990, Gender.Male, person1, person2);
        Person person7 = new Person("Григорьев", "Петр", 1968, Gender.Male, null, null);
        Person person8 = new Person("Григорьева", "Алина", 1971, Gender.Female, null, null);
        Person person5 = new Person("Иванова", "Марина", 1990, Gender.Female, person7, person8);
        Person person6 = new Person("Иванов", "Алексей", 2022, Gender.Male, person3, person5);
        FamilyTree familyTree1 = new FamilyTree();
        familyTree1.addPerson(person1);
        familyTree1.addPerson(person2);
        familyTree1.addPerson(person3);
        familyTree1.addPerson(person4);
        familyTree1.addPerson(person5);
        familyTree1.addPerson(person6);
        familyTree1.addPerson(person7);    
        familyTree1.addPerson(person8);

        FileHandler fh = new FileHandler();
        // fh.putFamilyTreeToFile(familyTree1, "HomeworksAdd/HWOOPadd/HWLesson2oopAdd/Tree.out");
        familyTree1.saveFamilyTreeToFile(fh, "HomeworksAdd/HWOOPadd/HWLesson2oopAdd/Tree.out");
        // FamilyTree familyTree2 = fh.loadFamilyTreeFromFile("HomeworksAdd/HWOOPadd/HWLesson2oopAdd/Tree.out");
        // System.out.println(familyTree2);
        FamilyTree familyTree2 = new FamilyTree();
        familyTree2.takeFamilyTreeFromFile(fh, "HomeworksAdd/HWOOPadd/HWLesson2oopAdd/Tree.out");
    }
}
