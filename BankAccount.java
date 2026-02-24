import java.text.DecimalFormat;

// Base class representing a Bank Account
class BankAccount {
    protected double balance; // Use protected for subclass access

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        System.out.println("New BankAccount created with initial balance of $" + formatCurrency(balance));
    }

    // Method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + formatCurrency(amount) + ". New balance: $" + formatCurrency(balance));
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw funds (intended to be overridden)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + formatCurrency(amount) + ". New balance: $" + formatCurrency(balance));
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Helper method for formatting currency
    protected String formatCurrency(double amount) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(amount);
    }
}

// Subclass SavingsAccount with specific withdrawal rules
class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 100.0;

    // Constructor chains to superclass constructor
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
        System.out.println("This is a SavingsAccount. Minimum balance required: $" + formatCurrency(MINIMUM_BALANCE));
    }

    // Overrides the withdraw method to enforce the minimum balance rule
    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance - amount >= MINIMUM_BALANCE) {
                balance -= amount;
                System.out.println("Withdrew $" + formatCurrency(amount) + " from Savings. New balance: $" + formatCurrency(balance));
            } else {
                System.out.println("Withdrawal denied. Cannot withdraw $" + formatCurrency(amount) + " as the balance would fall below the minimum required of $" + formatCurrency(MINIMUM_BALANCE));
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

// Main class to demonstrate the functionality
public class BankDemo {
    public static void main(String[] args) {
        // Create a Savings Account instance
        SavingsAccount mySavings = new SavingsAccount(500.00);

        System.out.println("\n--- Testing Valid Withdrawal ---");
        // Attempt a valid withdrawal (500 - 200 = 300, which is >= 100)
        mySavings.withdraw(200.00); 

        System.out.println("\n--- Testing Deposit ---");
        mySavings.deposit(50.00);

        System.out.println("\n--- Testing Invalid Withdrawal ---");
        // Attempt an invalid withdrawal (350 - 300 = 50, which is < 100)
        mySavings.withdraw(300.00); 

        System.out.println("\n--- Testing Full Withdrawal from Base Class ---");
        BankAccount myChecking = new BankAccount(150.00);
        // Base class withdraw allows balance to go to 0
        myChecking.withdraw(150.00); 
    }
}