package homework_streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static homework_streamAPI.Product.inputProductDetails;

public class DemoProduct {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(20);
        System.out.println("Enter 20 products:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 20; i++) {
            System.out.println("\nProduct " + i + ":");
            products.add(inputProductDetails(scanner));
        }




    }
}
