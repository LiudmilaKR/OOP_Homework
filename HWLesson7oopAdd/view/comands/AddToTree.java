package HomeworksAdd.HWOOPadd.HWLesson7oopAdd.view.comands;

import HomeworksAdd.HWOOPadd.HWLesson7oopAdd.view.ConsoleView;

public class AddToTree implements Comand {

    @Override
    public void execute(ConsoleView console) {
        console.addToTree();
    }

    @Override
    public String toString() {
        return "Добавление человека в дерево";
    }
    
}
