package HomeworksAdd.HWOOPadd.HWLesson2oopAdd;

public interface Writable {
    void putFamilyTreeToFile(FamilyTree ft, String Path);
    FamilyTree loadFamilyTreeFromFile(String Path);
    // void readFamilyTree(FamilyTree ft);
    // void saveFamilyTree(FamilyTree ft);
    // void createPerson();
    // void addPerson();
    // save, load, read через интерфейс
}

// void save(Serializable serializable, String filename) throws IOException;
// Object read(String filename) throws IOException, ClassNotFoundException;