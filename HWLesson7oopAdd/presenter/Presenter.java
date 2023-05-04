package HomeworksAdd.HWOOPadd.HWLesson7oopAdd.presenter;

import HomeworksAdd.HWOOPadd.HWLesson7oopAdd.model.FamilyTree;
import HomeworksAdd.HWOOPadd.HWLesson7oopAdd.model.Service;
import HomeworksAdd.HWOOPadd.HWLesson7oopAdd.view.View;

public class Presenter {
    View view;
    Service service;

    public Presenter(View view, String path) {
        this.view = view;
        service = new Service(path);
    }
    public void initTree() {
        // service.newFamilyTree();
        service.saveToFile(service.newFamilyTree());
    }
    public FamilyTree takeTree() {
        return service.takeFromFile();
    }
    public void addPersonToTree(int gender, String sername, String firstname, int yearbirth) {
        service.addPersToTree(gender, sername, firstname, yearbirth);
    }
    public void delPersonFromTree(int id) {
        service.delPersFromTree(id);
    }
}
