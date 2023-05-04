package HomeworksAdd.HWOOPadd.HWLesson7oopAdd.view;

import java.util.ArrayList;
import java.util.List;

import HomeworksAdd.HWOOPadd.HWLesson7oopAdd.view.comands.AddToTree;
import HomeworksAdd.HWOOPadd.HWLesson7oopAdd.view.comands.Comand;
import HomeworksAdd.HWOOPadd.HWLesson7oopAdd.view.comands.DelFromTree;
import HomeworksAdd.HWOOPadd.HWLesson7oopAdd.view.comands.ShowTree;
import HomeworksAdd.HWOOPadd.HWLesson7oopAdd.view.comands.InitTree;

public class Menu {
    private List<Comand> comandList;

    public Menu() {
        comandList = new ArrayList<>();
        comandList.add(new InitTree());
        comandList.add(new ShowTree());
        comandList.add(new AddToTree());
        comandList.add(new DelFromTree());
    }
    public int getMenuSize() {
        return comandList.size();
    }
    public void perform(int num, ConsoleView console) {
        Comand com = comandList.get(num - 1);
        System.out.println(com);
        com.execute(console);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Выберите действие:\n");
        int i = 1;
        for (Comand item : comandList) {
            sb.append(i++);
            sb.append(".");
            sb.append(item);
            sb.append("\n");
        }
        sb.append(i + ".Выход");
        return sb.toString();
    }
}
