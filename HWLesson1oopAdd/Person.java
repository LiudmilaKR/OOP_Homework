package HomeworksAdd.HWOOPadd.HWLesson1oopAdd;

public class Person {
    private String lastName;
    private String firstName;
    private int yearBithday;
    private Gender gender;
    private Person father;
    private Person mother;
    // List<Person> shild; мое мнение - это лишнее, и достаточно папы-мамы

    public Person(String lastName, String firstName, int yearBithday, Gender gender, Person father, Person mother) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.yearBithday = yearBithday;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public Person getFather() {
        return father;
    }
    public String getParents() {
        if (father == null || mother == null) return firstName + " " + lastName + " => родители неизвестны";
        else return firstName + " " + lastName + " - родители: отец " + father.lastName + " " + father.firstName + 
        ", мать " + mother.lastName + " " + mother.firstName + mother.firstName;
    }
    public String putGender() {
        if (gender == Gender.Male) return "пол мужской";
        else return "пол женский"; 
    }
    @Override
    public String toString() {
        if (father == null || mother == null) return "Person => [" + lastName + " " + firstName + " " + yearBithday + ", " + putGender() + "]";
        else return "Person => [" + lastName + " " + firstName + " " + yearBithday + ", " + putGender() + ", родители: отец " + 
                    father.lastName + " " + father.firstName + ", мать " + mother.lastName + " " + 
                mother.firstName + "]\n";
    }
}
