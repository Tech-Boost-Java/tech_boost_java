package Practical5;

import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) { this.name = name; this.age = age; }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

class PersonMerger {

    public static List<Person> mergeAndSortPersons(List<Person> list1, List<Person> list2) {
        // Handle null lists by treating them as empty
        List<Person> firstList = list1 != null ? list1 : Collections.emptyList();
        List<Person> secondList = list2 != null ? list2 : Collections.emptyList();

        // Use a Set to eliminate duplicates
        Set<Person> personSet = new HashSet<>();
        personSet.addAll(firstList);
        personSet.addAll(secondList);

        // Convert to list and sort by age
        List<Person> result = new ArrayList<>(personSet);
        result.sort(Comparator.comparingInt(Person::getAge));

        return result;
    }

    public static List<Person> filterByMinimumAge(List<Person> persons, int minAge) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() >= minAge) {
                result.add(person);
            }
        }
        return result;
    }

    public static double calculateAverageAge(List<Person> persons) {
        double sum = 0;
        for (Person person : persons) {
            sum += person.getAge();
        }
        return sum / persons.size() ;
    }
}