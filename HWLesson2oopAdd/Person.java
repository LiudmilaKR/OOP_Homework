package HomeworksAdd.HWOOPadd.HWLesson2oopAdd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable{
    private String lastName;
    private String firstName;
    private int yearBithday;
    private Gender gender;
    private Person father;
    private Person mother;
    List<Person> child;
        
    // public List<Person> getChild() {
    //     if (child.isEmpty()) return null;
    //     else return child;
    // }
    public String getChild() {
        StringBuilder sb = new StringBuilder();
        if (child.isEmpty()) sb.append(", детей нет");
        else {
            if (child.size() == 1) sb.append(", ребенок " + firstName + " " + lastName + " " + yearBithday);
            else {
                sb.append(", дети:");
                for (Person pers : child) {
                    sb.append(" " + pers.firstName + " " + pers.lastName + " " + pers.yearBithday + ",");
                }
            }
        }
        return sb.toString();
    }
    public Person getFather() {
        return father;
    }
    public Person getMother() {
        return mother;
    }
    public Person(String lastName, String firstName, int yearBithday, Gender gender, Person father, Person mother) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.yearBithday = yearBithday;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        this.child = new ArrayList<>();
    }
    public void addChild(Person person) {
        child.add(person);
    }
    public String putGender() {
        if (gender == Gender.Male) return "пол мужской";
        else return "пол женский"; 
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person => [" + lastName + " " + firstName + " " + yearBithday + ", " + putGender());
        if (father == null && mother == null) sb.append("");
        else {
            if (father == null) {
                sb.append(", родители: отец отсутствует, мать " + mother.lastName + " " + mother.firstName);
            } else {
                if (mother == null) {
                    sb.append(", родители: отец " + father.lastName + " " + father.firstName + ", мать отсутствует");
                }
                else sb.append(", родители: отец " + father.lastName + " " + father.firstName + ", мать " + 
                        mother.lastName + " " + mother.firstName);
            }
        }
        sb.append(getChild());
        sb.append("]\n");
        return sb.toString();
        
    }
}
