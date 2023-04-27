package HomeworksAdd.HWOOPadd.HWLesson5oopAdd.model;

public class Service {
    FamilyTree ft;
    // FileHandler fh;
    private String path;

    public Service(String path) {
        this.path = path;
        ft = new FamilyTree();
        // fh = new FileHandler();
    }

    public void saveToFile() {
        sortByYearBirsday();
        FileHandler fh = new FileHandler();
        fh.putToFile(ft, path);
    }
    public FamilyTree takeFromFile() {
        FileHandler fh = new FileHandler();
        return (FamilyTree)fh.loadFromFile(path);
    }
    public void sortByYearBirsday() {
        ft.getFamilyTree().sort(new PersonComparatorByYearBirsday());
    }
    public void sortByName() {
        ft.getFamilyTree().sort(new PersonComparatorByName());
    }
    public FamilyTree newFamilyTree() {
        Person person1 = new Person("Иванов", "Петр", 1962, Gender.Male, null, null);
        Person person2 = new Person("Иванова", "Наталья", 1965, Gender.Female, null, null);
        Person person3 = new Person("Иванов", "Егор", 1986, Gender.Male, person1, person2);
        Person person4 = new Person("Иванов", "Сергей", 1990, Gender.Male, person1, person2);
        Person person7 = new Person("Григорьев", "Петр", 1968, Gender.Male, null, null);
        Person person8 = new Person("Григорьева", "Алина", 1971, Gender.Female, null, null);
        Person person5 = new Person("Иванова", "Марина", 1990, Gender.Female, person7, person8);
        Person person6 = new Person("Иванов", "Алексей", 2022, Gender.Male, person3, person5);
        // FamilyTree familyTree1 = new FamilyTree();
        ft.addToFamilyTree(person1);
        ft.addToFamilyTree(person2);
        ft.addToFamilyTree(person3);
        ft.addToFamilyTree(person4);
        ft.addToFamilyTree(person5);
        ft.addToFamilyTree(person6);
        ft.addToFamilyTree(person7);
        ft.addToFamilyTree(person8);
        return ft;
    }
}
