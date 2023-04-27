package HomeworksAdd.HWOOPadd.HWLesson5oopAdd.view;

import java.util.Scanner;

import HomeworksAdd.HWOOPadd.HWLesson5oopAdd.model.Person;
import HomeworksAdd.HWOOPadd.HWLesson5oopAdd.model.Service;
import HomeworksAdd.HWOOPadd.HWLesson5oopAdd.presenter.Presenter;

public class ConsoleView implements View {
    private Scanner scan;
    private boolean work;
    Presenter presenter;

    public ConsoleView() {
        scan = new Scanner(System.in, "Cp866");
    }
    @Override
    public void start() {
        System.out.println("Начало работы.");
        Service service = new Service("HomeworksAdd/HWOOPadd/HWLesson5oopAdd/model/Tree.out");
        // HomeworksAdd\HWOOPadd\HWLesson5oopAdd\model\Tree.out
        presenter = new Presenter(this, service);
        work = true;
        int point = 0;
        while (work) {
            System.out.println("Выбрите действие:\n1.Инициация изначального дерева\n" + 
                        "2.Вывод текущего дерева на консоль\n" + "3.Выход");
            point = scan.nextInt();
            switch (point) {
                case (1):
                    initialTree();
                break;
                case (2):
                    printTree();
                    break;
                case (3):
                    exit();
                    break;
                default:
                    System.out.println("Выбор некорректен. Попробуйте ещё раз!");
                    break;
            }
        }
    }
    private void initialTree() {
        presenter.initTree();
        System.out.println("Дерево инициализировано, для просмотра дерева выберите пункт 2.");
        System.out.println();
    }
    private void printTree() {
        // System.out.println(presenter.takeTree());
        System.out.println("Текущее дерево =>");
        for (Person pers : presenter.takeTree()) {
            System.out.println(pers);
        }
    }
    private void exit(){
        System.out.println("Завершение работы.");
        // scan.close();
        work = false;
    }
}
