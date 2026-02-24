import java.util.Scanner;

class import java.util.Scanner;

class Student {
    int roll_no;

    public void get_roll_no() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        roll_no = scan.nextInt();
    }
}
class Test extends Student {
    int sub1, sub2;

    public void get_marks() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter marks for Subject 1: ");
        sub1 = scan.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        sub2 = scan.nextInt();
    }
}
class Result extends Test {
    int total;

    public void display_result() {
        total = sub1 + sub2;
        System.out.println("\n--- Student Result ---");
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
        System.out.println("Total Marks: " + total);
    }
}
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Result studentResult = new Result();
        studentResult.get_roll_no();
        studentResult.get_marks();
        studentResult.display_result();
    }
}{
    int roll_no;

    public void get_roll_no() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        roll_no = scan.nextInt();
    }
}
class Test extends Student {
    int sub1, sub2;

    public void get_marks() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter marks for Subject 1: ");
        sub1 = scan.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        sub2 = scan.nextInt();
    }
}
class Result extends Test {
    int total;

    public void display_result() {
        total = sub1 + sub2;
        System.out.println("\n--- Student Result ---");
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
        System.out.println("Total Marks: " + total);
    }
}
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Result studentResult = new Result();
        studentResult.get_roll_no();
        studentResult.get_marks();
        studentResult.display_result();
    }
}