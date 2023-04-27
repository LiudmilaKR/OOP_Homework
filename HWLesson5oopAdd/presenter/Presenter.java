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
        // return service.newFamilyTree();
    }
    public FamilyTree takeTree() {
        return service.takeFromFile();
    }
}
