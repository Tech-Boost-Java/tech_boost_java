package homework.homework3;

public class Main {
    public static void main(String[] args) {
        int length = 5;
        Person[] persons = new Person[length];
        for (int i = 0; i < length; i++){
            persons[i] = new Person();
            persons[i].input();
            persons[i].output();
        }
    }
}
