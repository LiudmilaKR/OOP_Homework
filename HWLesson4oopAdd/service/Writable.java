package HomeworksAdd.HWOOPadd.HWLesson4oopAdd.service;

import java.io.Serializable;

public interface Writable {
    void putFamilyTreeToFile(Serializable ser, String Path);
    Object loadFamilyTreeFromFile(String Path);
}

// void save(Serializable serializable, String filename) throws IOException;
// Object read(String filename) throws IOException, ClassNotFoundException;