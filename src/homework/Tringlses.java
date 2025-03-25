package homework;

public class Tringlses {
    private int side1;
    private int side2;
    private int side3;
    public Tringlses() {
    }
    public int getSide1() {
        return side1;
    }
    public int getSide2() {
        return side2;
    }
    public int getSide3() {
        return side3;
    }
    public void setSide1(int side1) {
        if (side1 > 0) {
            this.side1 = side1;
        }else {
            throw new IllegalArgumentException("Side 1 must be greater than 0");
        }
    }
    public void setSide2(int side2) {
        if (side2 > 0) {
            this.side2 = side2;
        }else {
            throw new IllegalArgumentException("Side 2 must be greater than 0");
        }
    }
    public void setSide3(int side3) {
        if (side3 > 0) {
            this.side3 = side3;
        }else {
            throw new IllegalArgumentException("Side 3 must be greater than 0");
        }
    }

    public double findSquare(){
        if(comparisonSide(side1, side2, side3)) {
            double halfSquare = (side1 + side2 + side3) / 2.0;
            double square = Math.sqrt(halfSquare * (halfSquare - side1) * (halfSquare - side2) * (halfSquare - side3));
            return square;
        } else {
            throw new IllegalArgumentException("The given sides do not form a valid triangle.");
        }
    }

    public boolean comparisonSide(double side1, double side2, double side3) {
        if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            return true;
        }else {
            return false;
        }
    }
}
