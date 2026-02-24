import java.util.ArrayList;
import java.util.List;

// Base Class
abstract class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public abstract double calculateBonus();
    public abstract String generatePerformanceReport();

    @Override
    public String toString() {
        return "Name: " + name + ", Title: " + jobTitle + ", Salary: $" + salary;
    }
}

// Subclass 1: Manager
class Manager extends Employee {
    private List<String> projects;

    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
        this.projects = new ArrayList<>();
    }

    @Override
    public double calculateBonus() {
        // Manager bonus is 10% of salary plus $500 per project managed
        return (salary * 0.10) + (projects.size() * 500);
    }

    @Override
    public String generatePerformanceReport() {
        return "Manager " + name + " performance: Met all goals. Managing " + projects.size() + " projects.";
    }

    public void addProject(String project) {
        this.projects.add(project);
    }

    public void manageProjects() {
        System.out.println(name + " is managing projects: " + String.join(", ", projects));
    }
}

// Subclass 2: Developer
class Developer extends Employee {
    private String primaryLanguage;

    public Developer(String name, String address, double salary, String primaryLanguage) {
        super(name, address, salary, "Developer");
        this.primaryLanguage = primaryLanguage;
    }

    @Override
    public double calculateBonus() {
        // Developer bonus is 5% of salary
        return salary * 0.05;
    }

    @Override
    public String generatePerformanceReport() {
        return "Developer " + name + " performance: Exceeded expectations in " + primaryLanguage + " development.";
    }

    public void manageProjects() {
        System.out.println(name + " is actively coding on assigned projects.");
    }
}

// Subclass 3: Programmer
class Programmer extends Employee {
    private List<String> skills;

    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
        this.skills = new ArrayList<>();
    }

    @Override
    public double calculateBonus() {
        // Programmer bonus is 6% of salary plus $100 per skill
        return (salary * 0.06) + (skills.size() * 100);
    }

    @Override
    public String generatePerformanceReport() {
        return "Programmer " + name + " performance: Strong skill set. " + skills.size() + " skills listed.";
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    public void manageProjects() {
        System.out.println(name + " is working on various programming tasks using skills: " + String.join(", ", skills));
    }
}

// Main class to demonstrate the hierarchy
public class CompanyHierarchyDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice Smith", "123 Main St", 90000);
        manager.addProject("Project A");
        manager.addProject("Project B");

        Developer developer = new Developer("Bob Johnson", "456 Oak Ave", 75000, "Java");

        Programmer programmer = new Programmer("Charlie Brown", "789 Pine Ln", 70000);
        programmer.addSkill("Python");
        programmer.addSkill("SQL");
        programmer.addSkill("JavaScript");

        // Display information and results
        System.out.println("--- Employee Details ---");
        System.out.println(manager);
        System.out.println(developer);
        System.out.println(programmer);
        System.out.println("\n--------------------------\n");

        System.out.println("--- Performance and Bonuses ---");
        System.out.println(manager.generatePerformanceReport());
        System.out.printf("Bonus: $%.2f%n", manager.calculateBonus());
        manager.manageProjects();
        System.out.println("\n");

        System.out.println(developer.generatePerformanceReport());
        System.out.printf("Bonus: $%.2f%n", developer.calculateBonus());
        developer.manageProjects();
        System.out.println("\n");

        System.out.println(programmer.generatePerformanceReport());
        System.out.printf("Bonus: $%.2f%n", programmer.calculateBonus());
        programmer.manageProjects();
    }
}