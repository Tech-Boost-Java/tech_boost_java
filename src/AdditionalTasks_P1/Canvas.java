package AdditionalTasks_P1;

import java.util.LinkedList;
import java.util.Queue;

class Canvas {
    private String canva = "";
    private final int width;
    private final int height;

    public Canvas(int width, int height) {
        if (width < 0 || height < 0 ) throw new IllegalArgumentException();

        canva += "-".repeat(width + 2) + "\n";
        for (int i = 0; i < height; i++) {
            canva += "|" + " ".repeat(width) + "|\n";
        }
        canva += "-".repeat(width + 2);

        this.width = width;
        this.height = height;
    }

    public Canvas draw(int x1, int y1, int x2, int y2) {
        if (x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0) throw new IllegalArgumentException();

        if (x1 + y1 > x2 + y2) {
            int tmp = x1;
            x1 = x2;
            x2 = tmp;

            tmp = y1;
            y1 = y2;
            y2 = tmp;
        }

        int landslide1 = width + 4 + x1 + y1 * (width + 3);
        int landslide2 = width + 4 + x2 + y2 * (width + 3);

        try {
            if (y1 == y2) {
                while (landslide1 <= landslide2) {
                    this.canva = replaceCharAt(canva, landslide1, 'x');
                    landslide1++;
                }
            } else if (x1 == x2) {
                while (landslide1 <= landslide2) {
                    this.canva = replaceCharAt(canva, landslide1, 'x');
                    landslide1 += width + 3;
                }
            } else {
                landslide1 = zone(x1, x2, y1, y2, landslide1, 1);
                landslide1 = zone(x1, x2, y1, y2, landslide1, -1);
            }
        }
        catch (java.lang.AssertionError e) {throw new IllegalArgumentException();}

        return this;
    }

    private int zone(int x1, int x2, int y1, int y2, int landslide1, int e) {
        for (int i = 0; i < x2 - x1; i++) {
            this.canva = replaceCharAt(canva, landslide1, 'x');
            landslide1 += e;
        }

        for (int i = 0; i < y2 - y1; i++) {
            this.canva = replaceCharAt(canva, landslide1, 'x');
            landslide1 += (width + 3) * e;
        }

        return landslide1;
    }

    public Canvas fill(int x, int y, char ch) {
        if (x < 0 || y < 0 || width <= x || height <= y) throw new IllegalArgumentException();

        int startPoint = width + 4 + x + y * (width + 3);
        if (canva.charAt(startPoint) != ' ') throw new IllegalArgumentException();

        char target = canva.charAt(startPoint);
        if (target == ch || target == 'x' || target == '|' || target == '-') return this;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(startPoint);

        while (!queue.isEmpty()) {
            int point = queue.poll();
            if (canva.charAt(point) == target) {
                this.canva = replaceCharAt(canva, point, ch);
                queue.add(point - 1);
                queue.add(point + 1);
                queue.add(point - (width + 3));
                queue.add(point + (width + 3));
            }
        }

        return this;
    }
    
    public String drawCanvas() {
        return canva;
    }

    private String replaceCharAt(String str, int index, char newChar) {
        if (index < 0 || index >= str.length()) {
            return str; // Уникаємо виходу за межі
        }
        return str.substring(0, index) + newChar + str.substring(index + 1);
    }
}
