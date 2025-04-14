package Git_homework_6;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
    private String category;
    private LocalDate dateOfmanufacture;
    private double price;
    public Product(String category, LocalDate dateOfmanufacture, double price) {
        this.category = category;
        this.dateOfmanufacture = dateOfmanufacture;
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public LocalDate getDateOfmanufacture() {
        return dateOfmanufacture;
    }
    public double getPrice() {
        return price;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDateOfmanufacture(LocalDate dateOfmanufacture) {
        this.dateOfmanufacture = dateOfmanufacture;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Category: " + category + ", Date of Manufacture: " + dateOfmanufacture + ", Price: " + price;
    }
}

class Employee{
    private String name;
    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}



public class FirstTask {

    static LocalDate randomDateGenerator(){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    // Define bounds
    LocalDate startDate = LocalDate.of(1950, 1, 1);
    LocalDate endDate = LocalDate.of(2025, 12, 31);

    // Generate random date
    long startEpochDay = startDate.toEpochDay();
    long endEpochDay = endDate.toEpochDay();
    long randomDay = ThreadLocalRandom.current().nextLong(startEpochDay, endEpochDay);

    return LocalDate.ofEpochDay(randomDay);
    }
    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .collect(Collectors.groupingBy(
                        Employee::getName,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        String[] categories = {"Phone", "Tablet", "Laptop", "Refrigerator", "Food", "Car", "Clothes"};
        Random rand = new Random();
        List<Product> products = new ArrayList<>();
        for (int i = 0; i <20; ++i){
            double price = BigDecimal.valueOf(rand.nextDouble(10000)).setScale(2, RoundingMode.HALF_UP).doubleValue();

            String category = categories[rand.nextInt(categories.length)];

            products.add(new Product(category, randomDateGenerator(), price));
        }

        System.out.println(products);

        List<Product> sorted = products.stream()
                .filter(product -> product.getCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> LocalDate.now().getYear() - product.getDateOfmanufacture().getYear() > 1)
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();
        System.out.println("Sorted products by price:");
        System.out.println(sorted);
        Stream<Employee> employees = Stream.of(new Employee("Bob"),  new Employee("John"),   new Employee("David"),   new Employee("Bob"));
        System.out.println(mostPopularName(employees));
   }
}
