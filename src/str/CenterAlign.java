package str;

/**
 * CenterAlign
 * This class demonstrates how to center-align a string within a specified width.
 * It calculates the necessary padding on both sides of the string to achieve the desired alignment.
 *
 */
public class CenterAlign {
    public static void main(String[] args) {
        int width = 12;
        System.out.printf("|%s|%s|%s|%n",
                centerText("Title", width),
                centerText("Counts", width),
                centerText("Price", width));
        System.out.println("-".repeat(width * 3 + 4));

        String[] items = {"Milk", "Bread", "Eggs"};
        int[] counts = {1, 2, 3};
        double[] prices = {10.50, 15.50, 20.00};

        for (int i = 0; i < items.length; i++) {
            System.out.printf("|%s|%s|%s|%n",
                    centerText(items[i], width),
                    centerText(String.valueOf(counts[i]), width),
                    centerText(String.format("%.2f", prices[i]), width));
        }
    }

    public static String centerText(String text, int width) {
        if (text.length() >= width) return text;
        int padding = (width - text.length()) / 2;
        int extra = (width - text.length()) % 2;
        return " ".repeat(padding) + text + " ".repeat(padding + extra);
    }
}