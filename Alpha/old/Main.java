
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            int number = Integer.parseInt(input); // Converts the string to an integer
            System.out.println("The number is: " + number); // Optional: Print the number to verify
        } catch (IOException e) {
            e.printStackTrace(); // Handle the IOException
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage()); // Handle invalid input
        }
    }
}
