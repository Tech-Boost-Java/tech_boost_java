package AdditionalTasks_P1;

public class EncapsulationDemo{
    private int number;
    private String stringValue;
    private Object anObject;

    public int getNumber() {
        return this.number;
    }
    public String getStringValue() {
        return this.stringValue;
    }
    public Object getAnObject() {
        return this.anObject;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }

    EncapsulationDemo() {}

    EncapsulationDemo(int number, String stringValue, Object anObject) {
        this.number = number;
        this.stringValue = stringValue;
        this.anObject = anObject;
    }

}