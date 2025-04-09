package Practical4;
// Customer class
class Customer {
    // Attributes
    protected String name;
    protected String email;
    protected int[] purchaseHistory;
    protected int purchaseCount;

    // Constructor
    public Customer(String name, String email, int maxPurchases) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new int[maxPurchases];
        this.purchaseCount = 0;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Methods
    public void addPurchase(int amount) {
        if (purchaseCount < purchaseHistory.length) {
            purchaseHistory[purchaseCount] = amount;
            purchaseCount++;
        } else {
            System.out.println("Purchase history is full. Cannot add more purchases.");
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
        System.out.println("Purchase History for " + name + " (" + email + "):");
        if (purchaseCount == 0) {
            System.out.println("No purchases made yet.");
        } else {
            for (int i = 0; i < purchaseCount; i++) {
                System.out.println("Purchase " + (i + 1) + ": $" + purchaseHistory[i]);
            }
            System.out.println("Total Expenditure: $" + calculateTotalExpenditure());
        }
    }
}

// PreferredCustomer subclass
class PreferredCustomer extends Customer {
    // Additional attribute
    private double discountRate;

    // Constructor
    public PreferredCustomer(String name, String email, int maxPurchases, double discountRate) {
        super(name, email, maxPurchases);
        this.discountRate = discountRate;
    }

    // Getter method
    public double getDiscountRate() {
        return discountRate;
    }

    // Methods
    public int applyDiscount(int amount) {
        double rate = discountRate / 100.0;
        return (int)(amount * (1 - rate));
    }

    @Override
    public void addPurchase(int amount) {
        int discountedAmount = applyDiscount(amount);
        System.out.println("Adding purchase with discount: Original: $" + amount + ", After Discount: $" + discountedAmount);

        if (purchaseCount < purchaseHistory.length) {
            purchaseHistory[purchaseCount] = discountedAmount;
            purchaseCount++;
        } else {
            System.out.println("Purchase history is full. Cannot add more purchases.");
        }
    }

    @Override
    public void displayPurchaseHistory() {
        System.out.println("Purchase History for Preferred Customer " + name + " (" + email + "):");
        System.out.println("Discount Rate: " + discountRate + "%");
        if (purchaseCount == 0) {
            System.out.println("No purchases made yet.");
        } else {
            for (int i = 0; i < purchaseCount; i++) {
                System.out.println("Purchase " + (i + 1) + ": $" + purchaseHistory[i] + " (after discount)");
            }
            System.out.println("Total Expenditure (after discounts): $" + calculateTotalExpenditure());
        }
    }
}

// Test class
class CustomerDemo {
    public static void main(String[] args) {
        // Create a regular customer
        Customer regularCustomer = new Customer("John Doe", "john@example.com", 5);
        regularCustomer.addPurchase(100);
        regularCustomer.addPurchase(150);
        regularCustomer.addPurchase(75);
        regularCustomer.displayPurchaseHistory();

        System.out.println("\n------------------------------\n");

        // Create a preferred customer with 10% discount
        PreferredCustomer preferredCustomer = new PreferredCustomer("Jane Smith", "jane@example.com", 5, 10.0);
        preferredCustomer.addPurchase(100);  // Will be stored as 90 after 10% discount
        preferredCustomer.addPurchase(150);  // Will be stored as 135 after 10% discount
        preferredCustomer.addPurchase(75);   // Will be stored as 67 or 68 after 10% discount (depending on rounding)
        preferredCustomer.displayPurchaseHistory();
    }
}