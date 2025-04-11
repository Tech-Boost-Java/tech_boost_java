package practical.OopPractical;

public class Customer {
    String name;
    String email;
    int [] purchaseHistory;
    int purchaseCount;

    public Customer (String name, String email, int maxPurchases) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new int[maxPurchases];
        this.purchaseCount = 0;
    }

    public void addPurchase (int amount) {
        if (purchaseHistory.length < 10) {
            purchaseHistory[purchaseCount] = amount;
            purchaseCount++;
        }
        else {
            System.out.println("Array is full");
        }
    }

    public int calculateTotalExpenditure () {
        int sum = 0;
        for (int i : purchaseHistory) {
            sum += i;
        }
        return sum;
    }

    public void displayPurchaseHistory () {
        for (int i : purchaseHistory) {
            System.out.println(i);
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
    double discountRate;

    public PreferredCustomer (String name, String email, int maxPurchases, double discountRate) {
        super(name, email, maxPurchases);
        this.discountRate = discountRate;
    }

    public int applyDiscount(int amount) {
        double discountedAmount = amount * (1 - discountRate);
        return (int) Math.round(discountedAmount);
    }

    @Override
    public void addPurchase(int amount) {
        super.addPurchase(applyDiscount(amount));
    }

    @Override
    public void displayPurchaseHistory() {
        super.displayPurchaseHistory();
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
