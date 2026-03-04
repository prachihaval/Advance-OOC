import java.io.*;
import java.util.*;

public class FileStatistics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full path of text file: ");
        String path = sc.nextLine();

        int vowelCount = 0;
        int wordCount = 0;
        int aCount = 0;

        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {

                // Count words
                String[] words = line.trim().split("\\s+");
                if (line.trim().length() != 0) {
                    wordCount += words.length;
                }

                // Convert to lowercase for easy checking
                line = line.toLowerCase();

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);

                    // Count vowels
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    }

                    // Count character 'a'
                    if (ch == 'a') {
                        aCount++;
                    }
                }
            }

            br.close();
            fr.close();

            // Display Results
            System.out.println("\n----- File Statistics -----");
            System.out.println("Total Vowels: " + vowelCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Number of times 'a' appears: " + aCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}