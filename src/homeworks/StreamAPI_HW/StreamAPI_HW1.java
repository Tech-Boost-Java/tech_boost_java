package homeworks.StreamAPI_HW;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI_HW1 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Phone", LocalDate.of(2022, 1, 15), 8299.99));
        products.add(new Product("Furniture", LocalDate.of(2022, 11, 5), 499.50));
        products.add(new Product("Clothing", LocalDate.of(2024, 3, 10), 59.99));
        products.add(new Product("Food", LocalDate.of(2025, 2, 1), 12.75));
        products.add(new Product("Phone", LocalDate.of(2021, 8, 20), 3004.60));
        products.add(new Product("Books", LocalDate.of(2021, 5, 12), 19.95));
        products.add(new Product("Tools", LocalDate.of(2024, 9, 18), 89.40));
        products.add(new Product("Sports", LocalDate.of(2022, 4, 30), 129.99));
        products.add(new Product("Automotive", LocalDate.of(2023, 7, 22), 220.00));
        products.add(new Product("Health", LocalDate.of(2022, 2, 14), 45.50));
        products.add(new Product("Beauty", LocalDate.of(2023, 6, 9), 29.95));
        products.add(new Product("Garden", LocalDate.of(2021, 10, 25), 75.20));
        products.add(new Product("Kitchen", LocalDate.of(2024, 12, 3), 149.99));
        products.add(new Product("Office", LocalDate.of(2022, 1, 8), 60.00));
        products.add(new Product("Pet Supplies", LocalDate.of(2023, 11, 19), 25.30));
        products.add(new Product("Baby", LocalDate.of(2024, 5, 4), 38.99));
        products.add(new Product("Music", LocalDate.of(2022, 7, 11), 22.49));
        products.add(new Product("Video Games", LocalDate.of(2023, 3, 27), 59.99));
        products.add(new Product("Jewelry", LocalDate.of(2021, 9, 16), 199.95));
        products.add(new Product("Shoes", LocalDate.of(2024, 10, 6), 89.00));

        List<Product> sortedList = products.stream().sorted((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()))
                .filter(product -> product.getManufactureCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .toList();

        System.out.println(sortedList);


        List<Employee> emps = List.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );

        Optional<String> result = mostPopularName(emps.stream());
        result.ifPresent(System.out::println);
    }

    public static Optional<String> mostPopularName (Stream<Employee> employees) {
        return employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}

class Product {
    private String manufactureCategory;
    private LocalDate dateOfManufacture;
    private double price;

    public Product (String manufactureCategory, LocalDate dateOfManufacture, double price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product {" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }
}

class Employee {
    private String name;

    public Employee (String name) {this.name = name;};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


/*
Create class Product with fields  manufacture category, date of manufacture and price. Add all needed methods
Create list Product with 20 objects
Obtain a sorted by the price list of products belong to category Phone with price > 3000, and the date of manufacture was more then 1 year ago.
Realize method
	static Optional<String> mostPopularName(Stream< Employee> employees) {
         		return null;     }
For given a stream with objects of Employee class, return the optional, containing the most popular name. If this stream is empty, Optional.empty should be returned. For example:
	empl1.name = “Bob”, empl2.name = “Din”,
	empl3.name = “Sam”, empl4.name = “Sam”
“Sam” should be returned.

 */