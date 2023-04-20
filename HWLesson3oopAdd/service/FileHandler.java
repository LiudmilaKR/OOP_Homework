package HomeworksAdd.HWOOPadd.HWLesson3oopAdd.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import HomeworksAdd.HWOOPadd.HWLesson3oopAdd.family.FamilyTree;

public class FileHandler implements Writable {

    @Override
    public void putFamilyTreeToFile(FamilyTree ft, String Path) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Path));
            oos.writeObject(ft);
            oos.close();
        } catch (Exception e) {
            e.getMessage();
        }
        
    }

    @Override
    public FamilyTree loadFamilyTreeFromFile(String Path) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Path));
            FamilyTree ft = (FamilyTree) ois.readObject();
            ois.close();
            return ft;
        } catch (Exception e) {
            return null;
        }
    }
}
