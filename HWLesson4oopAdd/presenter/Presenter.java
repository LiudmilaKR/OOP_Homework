package HomeworksAdd.HWOOPadd.HWLesson4oopAdd.presenter;

import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.family.FamilyTree;
import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.family.Person;
import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.service.Service;
import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.ui.View;

public class Presenter {
    private Service service;
    private View view;

    public Presenter(Service service, View view) {
        this.service = service;
        this.view = view;
        view.setPresenter(this);
    }

    public void printTree() {
        FamilyTree<Person> ft = service.newFamilyTree();
        // view.printFamilyTree(ft);
        view.printFamlyTreeThrowIterator(ft);
    }

    public void printTreeSorted() { // тоже х... какая-то, но по-другому не знаю, как сделать
        FamilyTree<Person> ft = service.newFamilyTree();
        Service serv = new Service(ft);
        serv.sortByLastName();
        view.printFamlyTreeThrowIterator(ft);
        serv.sortByYearBirsday();
        view.printFamlyTreeThrowIterator(ft);
    }
}
