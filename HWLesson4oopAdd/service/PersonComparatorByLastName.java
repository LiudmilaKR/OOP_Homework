package HomeworksAdd.HWOOPadd.HWLesson4oopAdd.service;

import java.util.Comparator;

import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.family.Person;

public class PersonComparatorByLastName implements Comparator <Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return (o1.getLastName() + o1.getFirstName()).compareTo(o2.getLastName() + o2.getFirstName());
    }
    
}
