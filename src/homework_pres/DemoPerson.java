package homework_pres;

public class DemoPerson {
    public static void main (String[] args){
    Person person1 = new Person();
    person1.input();
    person1.output(person1.getFirstName(), person1.getLastName(), person1.getAge(person1.getBirthYear()));

    Person person2 = new Person();
    Person person3 = new Person("Anna", "Grin");
    Person person4 = new Person("Mycola", "Grin");
    Person person5 = new Person("Ivan", "Krin");
    }
}
