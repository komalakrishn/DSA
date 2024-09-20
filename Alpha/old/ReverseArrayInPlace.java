public class ReverseArrayInPlace {
    public static void main(String[] args) {
        
        if (args.length != 10) {
            System.out.println("Please provide exactly 10 integer values as command-line arguments.");
            return;
        }

        // Create an integer array to store the values
        int[] numbers = new int[10];

        // Parse the command-line arguments and store them in the array
        try {
            for (int i = 0; i < 10; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please provide only integer values.");
            return;
        }

        // Reverse the array in place using two pointers
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            // Swap the elements at the left and right indices
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            // Move the pointers towards each other
            left++;
            right--;
        }

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}