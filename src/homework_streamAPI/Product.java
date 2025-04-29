package homework_streamAPI;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Product {
    private String category;
    private int date;
    private int price;

    public Product(String category, int date, int price) {
        this.category = category;
        this.date = date;
        this.price = price;
    }
    public static Product inputProductDetails(Scanner scanner)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Enter product category:");
        String category = scanner.nextLine();
        System.out.println("Enter product date:");
        int date = scanner.nextInt();
        System.out.println("Enter product price:");
        int price = scanner.nextInt();
        return new Product(category, date, price);
    }
    public String getCategory() {
        return category;
    }

    public int getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
