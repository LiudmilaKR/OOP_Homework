package HomeworksAdd.HWOOPadd.HWLesson7oopAdd.view.comands;

import HomeworksAdd.HWOOPadd.HWLesson7oopAdd.view.ConsoleView;

public class ShowTree implements Comand {

    @Override
    public void execute(ConsoleView console) {
        console.printTree();
    }

    @Override
    public String toString() {
        return "Вывод текущего дерева на консоль";
    }
    
}
