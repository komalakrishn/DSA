import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Result {  // Class name changed to 'Result'
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of subjects
        int n = scanner.nextInt();

        // Input answered questions
        List<Integer> answered = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            answered.add(scanner.nextInt());
        }

        // Input needed questions
        List<Integer> needed = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            needed.add(scanner.nextInt());
        }

        // Input q (additional questions)
        int q = scanner.nextInt();

        // Call the function and output the result
        int result = maxSubjectsNumber(answered, needed, q);
        System.out.println(result);

        scanner.close();
    }

    public static int maxSubjectsNumber(List<Integer> answered, List<Integer> needed, int q) {
        int n = answered.size();
        
        // Step 1: Modify the 'needed' list to store the remaining questions needed for each subject
        for (int i = 0; i < n; i++) {
            needed.set(i, needed.get(i) - answered.get(i));  // Overwriting 'needed' to store remaining
        }
        
        // Step 2: Sort the 'needed' list in ascending order (remaining questions required)
        Collections.sort(needed);
        
        // Step 3: Try to use the available 'q' questions to pass as many subjects as possible
        int subjectsPassed = 0;
        for (int i = 0; i < n; i++) {
            if (needed.get(i) <= q) {
                q -= needed.get(i);  // Use questions to pass this subject
                subjectsPassed++;    // Increment subjects passed
            } else {
                break;  // Stop if we can't pass the current subject
            }
        }
        
        return subjectsPassed;  // Return the maximum number of subjects passed
    }
}
