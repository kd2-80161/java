import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int wordCount = countWords(input);
        System.out.println("Number of words in the string: " + wordCount);
    }

    public static int countWords(String input) {
        // Remove leading and trailing spaces using trim()
        input = input.trim();

        // Check if the input is an empty string
        if (input.isEmpty()) {
            return 0;
        }

        // Split the input string into words using spaces as a delimiter
        String[] words = input.split("\\s+");

        // Return the number of words in the string
        return words.length;
    }
}
