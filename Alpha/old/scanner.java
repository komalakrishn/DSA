import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        // Read a line of text (including spaces)
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Enter your age:");
        // Read an integer value
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        // Closing the scanner
        scanner.close();
    }
}
