package homework.hw6_StreamAPI;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class task1 {

    static class Product  {
        private String manufacture;
        private String category;
        private LocalDate date;
        private double price;

        public Product(String manufacture, String category, LocalDate date, double price) {
            this.manufacture = manufacture;
            this.category = category;
            this.date = date;
            this.price = price;
        }
        public String getManufacture() {
            return manufacture;
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
            return "Product{" + "manufacture='" + manufacture + '\'' + ", category='" + category + '\'' + ", dateOfManufacture=" + date + ", price=" + price + '}';
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Samsung", "Phone", LocalDate.of(2022, 3, 1), 4500));
        products.add(new Product("Apple", "Phone", LocalDate.of(2023, 5, 10), 5000));
        products.add(new Product("Xiaomi", "Phone", LocalDate.of(2021, 11, 15), 3200));
        products.add(new Product("Dell", "Laptop", LocalDate.of(2022, 1, 10), 6000));
        products.add(new Product("Sony", "Phone", LocalDate.of(2020, 9, 1), 3900));
        products.add(new Product("HP", "Laptop", LocalDate.of(2023, 2, 20), 7000));
        products.add(new Product("LG", "Phone", LocalDate.of(2022, 2, 15), 2800));
        products.add(new Product("Nokia", "Phone", LocalDate.of(2021, 3, 5), 3100));
        products.add(new Product("Asus", "Tablet", LocalDate.of(2022, 6, 30), 2700));
        products.add(new Product("Motorola", "Phone", LocalDate.of(2020, 1, 1), 3300));
        products.add(new Product("Google", "Phone", LocalDate.of(2021, 12, 12), 4100));
        products.add(new Product("Lenovo", "Tablet", LocalDate.of(2022, 8, 8), 2500));
        products.add(new Product("Huawei", "Phone", LocalDate.of(2022, 4, 1), 3400));
        products.add(new Product("HTC", "Phone", LocalDate.of(2019, 10, 10), 3600));
        products.add(new Product("ZTE", "Phone", LocalDate.of(2022, 1, 20), 2900));
        products.add(new Product("Alcatel", "Phone", LocalDate.of(2020, 5, 25), 3100));
        products.add(new Product("TCL", "Phone", LocalDate.of(2021, 6, 15), 3050));
        products.add(new Product("Realme", "Phone", LocalDate.of(2023, 3, 5), 2800));
        products.add(new Product("OnePlus", "Phone", LocalDate.of(2022, 2, 28), 3700));
        products.add(new Product("Microsoft", "Tablet", LocalDate.of(2021, 11, 30), 4200));

        List<Product> filteredSorted = getFilteredSortedPhones(products);

        filteredSorted.forEach(System.out::println);
    }

    public static List<Product> getFilteredSortedPhones(@NotNull List<Product> products) {
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);

        return products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDate().isBefore(oneYearAgo))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());
    }
}