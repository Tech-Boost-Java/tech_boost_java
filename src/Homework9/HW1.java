package Homework9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HW1 {
    static class Product{
        private String category;
        private LocalDate date;
        private double price;

        public Product(String Category, LocalDate date, double price){
            this.category = Category;
            this.date = date;
            this.price = price;
        }
        public String getCategory() {
            return category;
        }
        public LocalDate getDate() {
            return date;
        }
        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Product - " + "Category = " + category + ", production date = " + date + ", price = " + price;
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Додавання 20 об'єктів
        products.add(new Product("Phone", LocalDate.of(2022, 3, 15), 3500));
        products.add(new Product("Phone", LocalDate.of(2021, 6, 10), 4200));
        products.add(new Product("Laptop", LocalDate.of(2023, 1, 5), 9000));
        products.add(new Product("TV", LocalDate.of(2020, 8, 20), 6000));
        products.add(new Product("Phone", LocalDate.of(2022, 9, 1), 2500));
        products.add(new Product("Tablet", LocalDate.of(2021, 12, 11), 3200));
        products.add(new Product("Phone", LocalDate.of(2023, 2, 25), 5100));
        products.add(new Product("Phone", LocalDate.of(2021, 4, 17), 3700));
        products.add(new Product("Camera", LocalDate.of(2020, 5, 22), 4500));
        products.add(new Product("TV", LocalDate.of(2023, 3, 30), 7000));
        products.add(new Product("Laptop", LocalDate.of(2022, 11, 8), 8400));
        products.add(new Product("Phone", LocalDate.of(2021, 7, 6), 2800));
        products.add(new Product("Smartwatch", LocalDate.of(2022, 10, 15), 2200));
        products.add(new Product("Tablet", LocalDate.of(2023, 1, 2), 2900));
        products.add(new Product("Phone", LocalDate.of(2020, 9, 3), 4700));
        products.add(new Product("Laptop", LocalDate.of(2023, 4, 18), 9100));
        products.add(new Product("Phone", LocalDate.of(2021, 11, 14), 3600));
        products.add(new Product("Camera", LocalDate.of(2023, 3, 19), 4000));
        products.add(new Product("Phone", LocalDate.of(2022, 7, 21), 3800));
        products.add(new Product("Tablet", LocalDate.of(2020, 12, 25), 3100));

        List<Product> filtered = products.stream()
                .filter(product -> product.getCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDate().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());
        filtered.forEach(System.out::println);
    }
}




