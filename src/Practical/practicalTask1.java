package Practical;

public class practicalTask1 {
    static abstract class Device {
        protected String brand;
        protected String model;
        protected boolean powerStatus ;

        public Device(String brand,String model,boolean powerStatus){
            this.brand = brand;
            this.model = model;
            this.powerStatus = powerStatus;
        }
        public void turnOn(){
            powerStatus=true;
            System.out.println("The device is now ON.");

        }
        public void turnOff(){
            powerStatus=false;
            System.out.println("The device is now OFF.");

        }
        public abstract void displayInfo();
    }
    public static class smartphone extends Device{
        public smartphone(String brand,String model,boolean powerStatus){
            super(brand,model,powerStatus);
        }
        @Override
        public void displayInfo(){
            System.out.println("Device Info:");
            System.out.println("  Brand: " + brand);
            System.out.println("  Model: " + model);
            System.out.println("  Power ON: " + powerStatus);
        }

    }


    public static void main(String[] args) {

        smartphone mySmartphone = new smartphone("Iphone","iphone 13",true);
        mySmartphone.displayInfo();
        mySmartphone.turnOff();
        mySmartphone.displayInfo();
    }
}
