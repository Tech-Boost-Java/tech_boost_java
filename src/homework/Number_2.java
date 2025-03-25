package homework;

public class Number_2 {
    private double number1;
    private double number2;
    private double number3;
    public Number_2() {
    }
    public double getNumber1() {
        return number1;
    }
    public double getNumber2() {
        return number2;
    }
    public double getNumber3() {
        return number3;
    }
    public void setNumber1(double number1) {
        this.number1 = number1;
    }
    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    public void setNumber3(double number3) {
    }
    public double compare(double number1, double number2, double number3){
        double min = number1; // Припустимо, що a найменше

        if (number2 < min) {
            min = number2; // Якщо b менше, оновлюємо min
        }
        if (number3 < min) {
            min = number3; // Якщо c менше, оновлюємо min
        }
        return min;
    }
}
