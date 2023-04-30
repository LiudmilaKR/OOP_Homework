package HomeworksAdd.HWOOPadd.HWLesson6oopAdd.model;

import java.io.Serializable;

public interface Writable {
    void putToFile(Serializable ser, String Path);
    Object loadFromFile(String Path);
}
