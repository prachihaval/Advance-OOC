import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadExternalFile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask user to enter full file path
        System.out.print("Enter full path of the file: ");
        String path = input.nextLine();

        try {
            File file = new File(path);

            // Check if file exists
            if (!file.exists()) {
                System.out.println("File does not exist!");
                return;
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("\nReading data from file:\n");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        input.close();
    }
}