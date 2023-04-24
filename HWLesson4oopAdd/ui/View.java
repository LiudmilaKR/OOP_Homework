package HomeworksAdd.HWOOPadd.HWLesson4oopAdd.ui;

import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.family.FamilyTree;
import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.family.Person;
import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.presenter.Presenter;

public interface View {
    void start();
    void setPresenter(Presenter presenter);
    void printFamilyTree(FamilyTree<Person> ft);
    void printFamlyTreeThrowIterator(FamilyTree<Person> ft);
//     void print(String text);
}
