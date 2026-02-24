public class StaticDemonstration {

    // 1. Static Variable: Shared across all instances of the class.
    private static int staticCounter = 0;

    // Instance variable: Unique to each instance of the class.
    private int instanceId;

    // 2. Static Block: Executed only once when the class is first loaded into memory.
    static {
        System.out.println("--- Inside Static Block ---");
        staticCounter = 10; // Can initialize static variables here.
        System.out.println("Initialized staticCounter to: " + staticCounter);
        System.out.println("---------------------------\n");
    }

    // Constructor to demonstrate the usage of static variables with instances.
    public StaticDemonstration(int id) {
        this.instanceId = id;
        // Accessing the static variable: incrementing it every time a new object is created.
        staticCounter++;
        System.out.println("Instance " + instanceId + " created. staticCounter is now: " + staticCounter);
    }

    // 3. Static Method: Can be called without creating an instance of the class.
    public static int getStaticCounter() {
        // A static method can only access static variables/methods directly.
        // It cannot access the 'instanceId' variable or the 'displayInstanceInfo()' instance method directly.
        return staticCounter;
    }

    // Instance Method: Belongs to an object of the class.
    public void displayInstanceInfo() {
        // An instance method can access both instance and static variables.
        System.out.println("Instance ID: " + this.instanceId + ", Current staticCounter value: " + staticCounter);
    }

    public static void main(String[] args) {
        System.out.println("--- Starting Main Method ---");

        // Accessing a static method and variable directly using the class name.
        System.out.println("Initial staticCounter via static method: " + StaticDemonstration.getStaticCounter() + "\n");

        // Creating instances of the class.
        StaticDemonstration obj1 = new StaticDemonstration(1);
        StaticDemonstration obj2 = new StaticDemonstration(2);
        StaticDemonstration obj3 = new StaticDemonstration(3);

        System.out.println("\n--- Displaying instance information ---");
        obj1.displayInstanceInfo();
        obj2.displayInstanceInfo();
        obj3.displayInstanceInfo();

        // Demonstrating that all instances share the same staticCounter value.
        System.out.println("\n--- Verifying shared static variable ---");
        System.out.println("Value from obj1 reference: " + obj1.getStaticCounter());
        System.out.println("Value from obj2 reference: " + obj2.getStaticCounter());
        System.out.println("Value from class name: " + StaticDemonstration.getStaticCounter());

        System.out.println("--- Main Method Finished ---");
    }
}