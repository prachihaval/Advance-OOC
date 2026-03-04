import java.io.*;
import java.util.Scanner;

public class StudentFileData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Accept Student Information
            System.out.println("Enter Student Details");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Weight (kg): ");
            double weight = sc.nextDouble();

            System.out.print("Height (cm): ");
            double height = sc.nextDouble();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();   // consume leftover newline

            System.out.print("City: ");
            String city = sc.nextLine();

            System.out.print("Phone Number: ");
            long phone = sc.nextLong();

            // Store data using DataOutputStream
            FileOutputStream fos = new FileOutputStream("student.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF(name);
            dos.writeDouble(weight);
            dos.writeDouble(height);
            dos.writeInt(age);
            dos.writeUTF(city);
            dos.writeLong(phone);

            dos.close();
            fos.close();

            System.out.println("\nData Stored Successfully!\n");

            // Retrieve data using DataInputStream
            FileInputStream fis = new FileInputStream("student.dat");
            DataInputStream dis = new DataInputStream(fis);

            String rName = dis.readUTF();
            double rWeight = dis.readDouble();
            double rHeight = dis.readDouble();
            int rAge = dis.readInt();
            String rCity = dis.readUTF();
            long rPhone = dis.readLong();

            dis.close();
            fis.close();

            // Display Retrieved Data
            System.out.println("Retrieved Student Details:");
            System.out.println("Name: " + rName);
            System.out.println("Weight: " + rWeight + " kg");
            System.out.println("Height: " + rHeight + " cm");
            System.out.println("Age: " + rAge);
            System.out.println("City: " + rCity);
            System.out.println("Phone Number: " + rPhone);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}