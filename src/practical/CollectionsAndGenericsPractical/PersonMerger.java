package practical.CollectionsAndGenericsPractical;

import java.util.*;

public class PersonMerger {
    public static List<Person> mergeAndSortLists(List<Person> list1, List<Person> list2) {
        if (list1 == null) {
            list1 = new ArrayList<>();
        }
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        List<Person> res = new ArrayList<>();
        for (Person p : list1) {
            if (!list2.contains(p) && !res.contains(p)) {
                res.add(p);
            }
        }
        for (Person p : list2) {
            if (!res.contains(p)) {
                res.add(p);
            }
        }
        Collections.sort(res, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        return res;
    }


    public static List<Person> filterByMinimumAge(List<Person> persons, int minAge) {
        if (persons == null || persons.isEmpty()) {
            return new ArrayList<>();
        }
        List<Person> res = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() >= minAge) {
                res.add(person);
            }
        }
        return res;
    }

    public static double calculateAverageAge(List<Person> persons) {
        if (persons == null || persons.isEmpty()) {
            return 0;
        }
        double res = 0;
        for (Person person : persons) {
            res += person.getAge();
        }
        return res / persons.size();
    }
}

class Person {
    String name;
    int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{name='" + this.name + "', age=" + this.age + "}";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
