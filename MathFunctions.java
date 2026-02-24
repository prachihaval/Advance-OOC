package MathOperations;

class MathFunctions {

    double floorValue(double num) {
        return Math.floor(num);
    }

    double ceilValue(double num) {
        return Math.ceil(num);
    }

    long roundValue(double num) {
        return Math.round(num);
    }
}

public class MathDemo {
    public static void main(String[] args) {

        MathFunctions m = new MathFunctions();
        double num = 12.67;

        System.out.println("Original Number: " + num);
        System.out.println("Floor Value: " + m.floorValue(num));
        System.out.println("Ceil Value: " + m.ceilValue(num));
        System.out.println("Round Value: " + m.roundValue(num));
    }
}