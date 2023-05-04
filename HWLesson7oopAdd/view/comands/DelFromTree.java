package HomeworksAdd.HWOOPadd.HWLesson7oopAdd.view.comands;

import HomeworksAdd.HWOOPadd.HWLesson7oopAdd.view.ConsoleView;

public class DelFromTree implements Comand {

    @Override
    public void execute(ConsoleView console) {
        console.delFromTree();
    }
    
    @Override
    public String toString() {
        return "Удаление человека из дерева";
    }

   
    
}
