package HomeworksAdd.HWOOPadd.HWLesson7oopAdd.view.comands;

import HomeworksAdd.HWOOPadd.HWLesson7oopAdd.view.ConsoleView;

public class InitTree implements Comand {

    @Override
    public void execute(ConsoleView console) {
        console.initialTree();
    }
    
    @Override
    public String toString() {
        return "Инициация изначального дерева";
    }

    
}
