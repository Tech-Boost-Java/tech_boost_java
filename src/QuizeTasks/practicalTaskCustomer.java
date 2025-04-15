package QuizeTasks;

class Customer{
    protected String name,email;
    protected int[] purchaseHistory;
    protected int purchaseCount;
    public Customer(String name,String email, int maxPurchases){
        this.name=name;
        this.email=email;
        this.purchaseHistory = new int[maxPurchases];
        this.purchaseCount = 0;
    }
    public void addPurchase(int amount){
        if (purchaseCount < purchaseHistory.length) {
            purchaseHistory[purchaseCount] = amount;
            purchaseCount++;

        }
        else {
            System.out.println("Purchase history is full for " + name + ". Cannot add purchase of " + amount + ".");
        }
    }
    public int calculateTotalExpenditure() {
        int total = 0;
        for (int i = 0; i < purchaseCount; i++) {
            total += purchaseHistory[i];
        }
        return total;
    }
    public void displayPurchaseHistory() {
        System.out.println("\n--- Purchase History for " + name + " (" + email + ") ---");
        if (purchaseCount == 0) {
            System.out.println("No purchases recorded yet.");
        } else {
            for (int i = 0; i < purchaseCount; i++) {
                System.out.println("Purchase " + (i + 1) + ": " + purchaseHistory[i]);
            }
        }
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
class PreferredCustomer extends Customer {

    private double discountRate;

    public PreferredCustomer(String name, String email, int maxPurchases, double discountRate) {

        super(name, email, maxPurchases);
        this.discountRate = discountRate;

    }
    public int applyDiscount(int amount) {
        double discounted = amount * (1.0 - this.discountRate);
        return (int)discounted;
    }


    @Override
    public void addPurchase(int amount) {
        int discountedAmount = applyDiscount(amount);
        super.addPurchase(discountedAmount);
        System.out.println("Applying " + (discountRate * 100) + "% discount to purchase of " + amount + ". Discounted amount: " + discountedAmount);
    }

    @Override
    public void displayPurchaseHistory() {
        System.out.println("\n--- Purchase History for PREFERRED Customer " + name + " (" + email + ") ---");
        System.out.println("--- Discount Rate: " + (discountRate * 100) + "% ---");
        if (purchaseCount == 0) {
            System.out.println("No purchases recorded yet.");
        } else {

            for (int i = 0; i < purchaseCount; i++) {
                System.out.println("Purchase " + (i + 1) + " (discounted): " + purchaseHistory[i]);
            }
        }
        System.out.println("-------------------------------------------------------");
    }

    // Getter for discount rate (optional)
    public double getDiscountRate() {
        return discountRate;
    }
}
public class practicalTaskCustomer {
    public static void main(String[] args) {
        Customer regularCustomer = new Customer("John Doe", "john.doe@email.com", 5);

        regularCustomer.addPurchase(100);
        regularCustomer.addPurchase(50);
        regularCustomer.addPurchase(200);
        regularCustomer.displayPurchaseHistory();
        System.out.println("Total Expenditure for " + ": " + regularCustomer.calculateTotalExpenditure());

        System.out.println("\n===========================================\n");

        // Create a preferred customer with a 15% discount
        PreferredCustomer preferredCustomer = new PreferredCustomer("Jane Smith", "jane.smith@email.com", 7, 0.15);
        System.out.println("Created preferred customer: " + " with " + (preferredCustomer.getDiscountRate()*100) + "% discount.");

        preferredCustomer.addPurchase(100);
        preferredCustomer.addPurchase(50);
        preferredCustomer.addPurchase(200);
        preferredCustomer.addPurchase(30);
        preferredCustomer.addPurchase(10);
        preferredCustomer.addPurchase(500);
        preferredCustomer.addPurchase(75);
        preferredCustomer.addPurchase(20);
        preferredCustomer.displayPurchaseHistory();

        System.out.println("Total Expenditure for " + preferredCustomer.name+ ": " + preferredCustomer.calculateTotalExpenditure());

    }
}



