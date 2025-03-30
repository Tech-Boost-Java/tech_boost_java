import java.util.Scanner;

public class AreaOfATriangle {
    int[] triangle = new int[3];

    public void inputSide() {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (!this.isTriangleValid()) {
            if (flag) {
                System.out.println("Please enter the right triangle sides!.");
            }
            for (int i = 0; i < 3; i++) {
                boolean isChecked = false;
                while (!isChecked) {
                    try {
                        System.out.print("Input Side " + (i + 1) + ": ");
                        int value = sc.nextInt();
                        if (value <= 0) {
                            throw new NumberFormatException("Please enter a positive number greater than 0");
                        }
                        this.triangle[i] = value;
                        isChecked = true;
                    } catch (Exception e) {
                        if (e.getClass() == NumberFormatException.class) {
                            System.out.println(e.getMessage());
                        } else {
                            System.out.println("Please enter a valid number");
                        }
                        sc.nextLine();
                    }
                }
            }
            flag = true;
        }

        sc.close();
    }

    private boolean isTriangleValid() {
        int len = this.triangle.length;
        if (this.triangle[0] == 0 || this.triangle[1] == 0 || this.triangle[2] == 0) {
            return false;
        }
        int maxSideIdx = 0;
        for (int i = 0; i < len; i++) {
            int max = Math.max(this.triangle[i], this.triangle[maxSideIdx]);
            if (max != this.triangle[maxSideIdx]) {
                maxSideIdx = i;
            }
        }
        int start = 0;
        int end = len - 1;
        while (start < end) {
            if (start == maxSideIdx) {
                start++;
            } else if (end == maxSideIdx) {
                end--;
            }
            if (this.triangle[start] + this.triangle[end] < this.triangle[maxSideIdx]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public void printResult() {
        double p = this.calculateHalfOfPerimeter();
        double area = this.calculateArea(p);

        System.out.println("The area of the triangle is " + area);
    }

    private double calculateHalfOfPerimeter() {
        double p = 0;
        for (int j : this.triangle) {
            p += j;
        }
        p /= 2;
        return p;
    }

    private double calculateArea(double p) {
        double area = p;
        for (int side : this.triangle) {
            area *= (p - side);
        }
        area = Math.sqrt(area);
        return area;
    }
}