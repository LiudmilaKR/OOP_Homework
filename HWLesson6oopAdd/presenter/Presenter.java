package HomeworksAdd.HWOOPadd.HWLesson6oopAdd.presenter;

import HomeworksAdd.HWOOPadd.HWLesson6oopAdd.model.FamilyTree;
import HomeworksAdd.HWOOPadd.HWLesson6oopAdd.model.Service;
import HomeworksAdd.HWOOPadd.HWLesson6oopAdd.view.View;

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
    public void addPersonToTree(int g, String sn, String fn, int yb) {
        service.addPersToTree(g, sn, fn, yb);
    }
    public void delPersonFromTree(int id) {
        service.delPersFromTree(id);
    }
}
