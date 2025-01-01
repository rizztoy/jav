import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class FileHandlingDmo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 1. File Creation
            System.out.println("=== File Creation ===");
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // 2. Writing to a File
            System.out.println("\n=== Writing to File ===");
            FileWriter writer = new FileWriter(file);
            writer.write("This is the first line.\nThis is the second line.");
            writer.close();
            System.out.println("Data written to file.");

            // 3. Reading from a File
            System.out.println("\n=== Reading from File ===");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

            // 4. Appending to a File
            System.out.println("\n=== Appending to File ===");
            FileWriter appendWriter = new FileWriter(file, true);
            appendWriter.write("\nThis is an appended line.");
            appendWriter.close();
            System.out.println("Data appended to file.");

            // 5. File Deletion
            System.out.println("\n=== File Deletion ===");
            System.out.print("Do you want to delete the file? (yes/no): ");
            String deleteChoice = scanner.nextLine();
            if (deleteChoice.equalsIgnoreCase("yes") && file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("File not deleted.");
            }

            // 6. Directory Creation
            System.out.println("\n=== Directory Creation ===");
            File directory = new File("exampleDir");
            if (directory.mkdir()) {
                System.out.println("Directory created: " + directory.getName());
            } else {
                System.out.println("Directory already exists.");
            }

            // 7. Listing Directory Contents
            System.out.println("\n=== Listing Directory Contents ===");
            File currentDir = new File(".");
            String[] files = currentDir.list();
            if (files != null) {
                for (String f : files) {
                    System.out.println(f);
                }
            } else {
                System.out.println("No files found.");
            }

            // 8. Copying Files
            System.out.println("\n=== Copying File ===");
            File sourceFile = new File("source.txt");
            File destinationFile = new File("destination.txt");
            if (sourceFile.createNewFile()) {
                FileWriter sourceWriter = new FileWriter(sourceFile);
                sourceWriter.write("This is the content of the source file.");
                sourceWriter.close();
            }
            Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied to destination.txt.");

            // 9. Exception Handling Example
            System.out.println("\n=== Exception Handling ===");
            try {
                File invalidFile = new File("/invalidPath/example.txt");
                FileWriter invalidWriter = new FileWriter(invalidFile);
                invalidWriter.write("This will throw an exception.");
                invalidWriter.close();
            } catch (IOException e) {
                System.out.println("Caught exception: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("\nProgram completed.");
    }
}
