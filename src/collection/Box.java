package collection;

public class Box<T> {
    private T t;
   // static T i;//Compile error
    public Box() {
       // t = new T();//Compile error

    }
    public Box(T t) {
        this.t = t;
    }
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}
class BoxDemo{
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setT("12");
        System.out.println("Box contains: " + box.getT());
        box.setT("World");
        System.out.println("Box contains: " + box.getT());


        Box<Integer> intBox = new Box<>(123);
        System.out.println("Box contains: " + intBox.getT());
        intBox.setT(456);
        System.out.println("Box contains: " + intBox.getT());

        Box<Number> numBox = new Box<>();

        numBox.setT(12.34);
        double d = numBox.getT().doubleValue();
        System.out.println(d);

        System.out.println("Box contains: " + numBox.getT() + " of type: " + numBox.getT().getClass().getName());
        numBox.setT(123);
        System.out.println("Box contains: " + numBox.getT() + " of type: " + numBox.getT().getClass().getName());
        numBox.setT(12.34f);
        System.out.println("Box contains: " + numBox.getT() + " of type: " + numBox.getT().getClass().getName());

    }
}

class NumericBox<T extends Number> {
    private T t;
    public NumericBox() {

    }
    public NumericBox(T t) {
        this.t = t;
    }
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}
class NumericBoxDemo{
    public static void main(String[] args) {
        NumericBox<Integer> intBox = new NumericBox<>(123);
        System.out.println("Box contains: " + intBox.getT());
        intBox.setT(456);
        System.out.println("Box contains: " + intBox.getT());

        NumericBox<Double> doubleBox = new NumericBox<>(12.34);
        System.out.println("Box contains: " + doubleBox.getT());
        doubleBox.setT(56.78);
        System.out.println("Box contains: " + doubleBox.getT());

       // NumericBox<String> numBox = new NumericBox<>();//Compile error
    }

}

//class Example{
//    public static void main(String[] args) {
//        Integer i = null;
//        Integer j = null;
//
//        System.out.println(i == j);
//     //   System.out.println(i.equals(j));
//    }
//}