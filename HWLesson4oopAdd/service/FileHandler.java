package HomeworksAdd.HWOOPadd.HWLesson4oopAdd.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileHandler implements Writable {

    @Override
    // public void putFamilyTreeToFile(FamilyTree<Object> ft, String Path) {
    //     try {
    //         ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Path));
    //         oos.writeObject(ft);
    //         oos.close();
    //     } catch (Exception e) {
    //         e.getMessage();
    //     }
        
    // }
    public void putFamilyTreeToFile(Serializable ser, String Path) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Path));
            oos.writeObject(ser);
            oos.close();
        } catch (Exception e) {
            e.getMessage();
        }
        
    }

    @Override
    public Object loadFamilyTreeFromFile(String Path) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Path));
            // Object ft = new Object(); ???
            Object ft = ois.readObject();
            ois.close();
            return ft;
        } catch (Exception e) {
            return null;
        }
    }
}
