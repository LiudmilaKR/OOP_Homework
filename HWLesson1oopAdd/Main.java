package HomeworksAdd.HWOOPadd.HWLesson1oopAdd;

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
        System.out.println(person1);
        System.out.println(person5);
        // System.out.println(familyTree1);
        System.out.println(person6.getParents());
        familyTree1.getChildren(person1);
    }
}
