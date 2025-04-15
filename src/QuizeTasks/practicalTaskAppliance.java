package QuizeTasks;

public class practicalTaskAppliance {

    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine("LG","TWINWash",15);
        Refrigerator refrigerator = new Refrigerator("Samsung","Family Hub",600);
        washingMachine.displayInfo();
        System.out.println();
        refrigerator.displayInfo();

    }


}
abstract  class Appliance{
    protected String brand,model;
    public Appliance(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
    public abstract void displayInfo();
}
 class WashingMachine extends Appliance{
    protected int loadCapacity;
    public WashingMachine(String brand,String model,int loadCapacity){
        super(brand,model);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void displayInfo(){
        System.out.println("Washing Machine - " + "Brand: " + brand+", Model: " +model +", Load Capacity: " + loadCapacity+" kg" );
    }

}
 class Refrigerator extends Appliance{
    protected int capacity;
    public Refrigerator (String brand,String model,int capacity){
        super(brand,model);
        this.capacity = capacity;
    }
    @Override
    public void displayInfo(){
        System.out.println("Refrigerator - " + "Brand: " + brand+", Model: " +model +", Capacity: " + capacity+" liters" );
    }

}

