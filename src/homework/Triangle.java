package homework;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public boolean isValidSide(){
        int[] sides = {side1, side2, side3};
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                int sum = sides[i] + sides[j];
                for (int k = 0; k < 3; k++) {
                    if (k != i && k != j && sum <= sides[k]) {
                        return false;
                    }
                }
            }
        }
        return  true;
    }



    public double calculateArea() {
        if (isValidSide()) {
            double p = (double) (side1 + side2 + side3) / 2;
            return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        } else {
            throw new IllegalArgumentException("This triangle can`t exist.");
        }
    }


    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }
}