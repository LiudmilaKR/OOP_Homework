package HomeworksAdd.HWOOPadd.HWLesson5oopAdd.presenter;

import HomeworksAdd.HWOOPadd.HWLesson5oopAdd.model.FamilyTree;
import HomeworksAdd.HWOOPadd.HWLesson5oopAdd.model.Service;
import HomeworksAdd.HWOOPadd.HWLesson5oopAdd.view.View;

public class Presenter {
    View view;
    Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
    }
    public void initTree() {
        service.newFamilyTree();
        service.saveToFile();
    }
    public FamilyTree takeTree() {
        return service.takeFromFile();
    }
    public void addPersonToTree(int g, String sn, String fn, int yb) {
        service.addPersToTree(g, sn, fn, yb);
    }
    public void delPersonFromTree(String sn, int yb) {
        service.delPersFromTree(sn, yb);
    }
}
