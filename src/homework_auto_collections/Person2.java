package homework_auto_collections;

import java.util.*;

public class Person2{
        private String firstName;
        private int age;

        public String getFirstName() {
            return firstName;
        }
        public int getAge() {
            return age;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return getAge() == person2.getAge() && Objects.equals(getFirstName(), person2.getFirstName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getAge());
    }

    @Override
        public String toString() {
            return "Person2{" +
                    "firstName='" + firstName + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    class PersonMerger {
        public static List<Person2> mergeAndSortPersons(List<Person2> list1, List<Person2> list2) {
            if (list1 == null) list1 = new ArrayList<>();
            if (list2 == null) list2 = new ArrayList<>();

            Set<Person2> mergedList = new HashSet<>(list1);
            mergedList.addAll(list2);
            List<Person2> sortedList = new ArrayList<>(mergedList);
            Collections.sort(sortedList, new Comparator<Person2>() {
                @Override
                public int compare(Person2 p1, Person2 p2) {
                    return Integer.compare(p1.getAge(), p2.getAge());
                }
            });

            return null;
        }

        public static List<Person2> filterByMinimumAge(List<Person2> persons, int minAge) {
            if (persons == null) return new ArrayList<>();
            List<Person2> filteredPersons = new ArrayList<>();
            for (Person2 p : persons) {
                if (p.getAge() >= minAge) {
                    persons.add(p);
                }
            }
            return filteredPersons;
        }

        public static double calculateAverageAge(List<Person2> persons) {
            if (persons == null || persons.isEmpty()) return 0;
            int sum = 0;
            for (Person2 p : persons) {
                sum += p.getAge();
            }
            double average = (double)sum / persons.size();
            return average;
        }
    }

