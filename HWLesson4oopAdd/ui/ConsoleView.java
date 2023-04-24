package HomeworksAdd.HWOOPadd.HWLesson4oopAdd.ui;

import java.util.Scanner;

import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.family.FamilyTree;
import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.family.Person;
import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.presenter.Presenter;


public class ConsoleView implements View {
    private Presenter presenter;
    private Scanner scan;
    
    public ConsoleView() {
        scan = new Scanner(System.in);
    }

    
    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
    @Override
    public void start() {
        System.out.println("Начало работы.");
        int point = 0;
        while (point != 3) {
            System.out.println("Выбрите действие:\n1.Вывод текущего дерева\n" + 
                        "2.Сортированное дерево\n" + "3.Выход");
            point = scan.nextInt();
            switch (point) {
                case (1):
                    System.out.println("Family Tree:");
                    this.presenter.printTree();
                    break;
                case (2):
                    System.out.println("Сортировка по фамилии и имени.");
                    this.presenter.printTreeSorted();
                    System.out.println("Сортировка по дате рождения.");
                    break;
                default:
                    if (point == 3) System.out.println("Выход.");
                    else System.out.println("Выбор некорректен. Попробуйте ещё раз!");
                    break;
            }
        }
        System.out.println("Завершение работы.");

    }
    @Override
    public void printFamilyTree(FamilyTree<Person> ft) {
        System.out.println(ft);
    }
    public void printFamlyTreeThrowIterator(FamilyTree<Person> ft) {
        for (Person person : ft) {
            System.out.println(person);
        }
        System.out.println();
    }
}
