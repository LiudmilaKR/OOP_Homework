package HomeworksAdd.HWOOPadd.HWLesson4oopAdd.service;

import java.util.Comparator;

import HomeworksAdd.HWOOPadd.HWLesson4oopAdd.family.Person;

public class PersonComparatorByYearBirsday implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getYearBithday(), o2.getYearBithday());
    }
    
}
