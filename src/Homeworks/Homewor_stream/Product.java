package Homeworks.Homewor_stream;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

enum Category {
    PHONE,
    LAPTOP,
    TABLET,
    TV,
    HEADPHONES
}

public class Product {
    private String manufacture;
    private Category category;
    private LocalDate manufactureDate;
    private double price;

    public Product(String manufacture, Category category, LocalDate manufactureDate, double price) {
        this.manufacture = manufacture;
        this.category = category;
        this.manufactureDate = manufactureDate;
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public Category getCategory() {
        return category;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public double getPrice() {
        return price;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufacture='" + manufacture + '\'' +
                ", category=" + category +
                ", manufactureDate=" + manufactureDate +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;

        if (Double.compare(product.price, price) != 0) return false;
        if (!manufacture.equals(product.manufacture)) return false;
        if (category != product.category) return false;
        return manufactureDate.equals(product.manufactureDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacture, category, manufactureDate, price);
    }
}

class productDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        LocalDate currentDate = LocalDate.now();

        products.add(new Product("Apple", Category.PHONE, currentDate.minusMonths(6), 4500.0));
        products.add(new Product("Samsung", Category.PHONE, currentDate.minusMonths(18), 3500.0));
        products.add(new Product("Xiaomi", Category.PHONE, currentDate.minusMonths(24), 2500.0));
        products.add(new Product("Google", Category.PHONE, currentDate.minusMonths(15), 3800.0));
        products.add(new Product("OnePlus", Category.PHONE, currentDate.minusMonths(20), 3200.0));
        products.add(new Product("Apple", Category.LAPTOP, currentDate.minusMonths(8), 5500.0));
        products.add(new Product("Dell", Category.LAPTOP, currentDate.minusMonths(14), 4200.0));
        products.add(new Product("HP", Category.LAPTOP, currentDate.minusMonths(22), 3800.0));
        products.add(new Product("Lenovo", Category.LAPTOP, currentDate.minusMonths(19), 3300.0));
        products.add(new Product("Asus", Category.LAPTOP, currentDate.minusMonths(11), 3700.0));
        products.add(new Product("Apple", Category.TABLET, currentDate.minusMonths(9), 3200.0));
        products.add(new Product("Samsung", Category.TABLET, currentDate.minusMonths(16), 2800.0));
        products.add(new Product("Huawei", Category.TABLET, currentDate.minusMonths(21), 2200.0));
        products.add(new Product("Microsoft", Category.TABLET, currentDate.minusMonths(5), 4100.0));
        products.add(new Product("Sony", Category.TV, currentDate.minusMonths(17), 5200.0));
        products.add(new Product("LG", Category.TV, currentDate.minusMonths(23), 4700.0));
        products.add(new Product("Samsung", Category.TV, currentDate.minusMonths(13), 3900.0));
        products.add(new Product("Sony", Category.HEADPHONES, currentDate.minusMonths(7), 850.0));
        products.add(new Product("Bose", Category.HEADPHONES, currentDate.minusMonths(25), 1200.0));
        products.add(new Product("JBL", Category.HEADPHONES, currentDate.minusMonths(10), 750.0));

        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getCategory() == Category.PHONE)
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> Period.between(p.getManufactureDate(), currentDate).getYears() >= 1)
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());

        System.out.println("Filtered and sorted products:");
        filteredProducts.forEach(System.out::println);

    }
}