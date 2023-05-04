package HomeworksAdd.HWOOPadd.HWLesson7oopAdd.model;

import java.io.Serializable;

public interface Writable {
    void putToFile(Serializable ser, String Path);
    Object loadFromFile(String Path);
}
