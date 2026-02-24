// Employee.java
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor that initializes the three instance variables
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        // Ensure salary is positive, otherwise set to 0.0
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Getter method for first name
    public String getFirstName() {
        return firstName;
    }

    // Setter method for first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter method for last name
    public String getLastName() {
        return lastName;
    }

    // Setter method for last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter method for monthly salary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Setter method for monthly salary
    public void setMonthlySalary(double monthlySalary) {
        // Ensure salary is positive, otherwise ignore the update (or set to 0.0)
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to apply a raise (percentage as a decimal, e.g., 0.10 for 10%)
    public void applyRaise(double percentage) {
        if (percentage > 0.0) {
            monthlySalary += monthlySalary * percentage;
        }
    }
}
// EmployeeTest.java
public class EmployeeTest {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee emp1 = new Employee("John", "Doe", 5000.00);
        Employee emp2 = new Employee("Jane", "Smith", 6000.00);

        // Display each object's yearly salary
        System.out.println("Initial Yearly Salaries:");
        System.out.printf("%s %s: $%.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("%s %s: $%.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());

        // Give each Employee a 10% raise (0.10)
        emp1.applyRaise(0.10);
        emp2.applyRaise(0.10);

        // Display each Employee's yearly salary again
        System.out.println("\nYearly Salaries After 10% Raise:");
        System.out.printf("%s %s: $%.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("%s %s: $%.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());
    }
}