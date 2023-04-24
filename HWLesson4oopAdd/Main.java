package HomeworksAdd.HWOOPadd.HWLesson4oopAdd;


import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.presenter.Presenter;
import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.service.Service;
import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.ui.ConsoleView;
import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.ui.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleView();
        Service service = new Service();
        new Presenter(service, view);
        view.start();   
        
    }
}
