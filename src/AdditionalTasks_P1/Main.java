package AdditionalTasks_P1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Canvas cnv = new Canvas(20, 4);
        System.out.println(cnv.drawCanvas());

        for (int i = 0; i < 3; i++) {
            String[] coord = sc.nextLine().split(" ");

            cnv.draw(Integer.parseInt(coord[0]), Integer.parseInt(coord[1]), Integer.parseInt(coord[2]), Integer.parseInt(coord[3]));
            System.out.println(cnv.drawCanvas());
        }

        String[] coord = sc.nextLine().split(" ");
        cnv.fill(Integer.parseInt(coord[0]), Integer.parseInt(coord[1]), coord[2].charAt(0));
        System.out.println(cnv.drawCanvas());
    }
}
