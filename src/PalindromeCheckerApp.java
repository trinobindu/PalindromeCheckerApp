
import java.util.Scanner;

public class PalindromeCheckerApp {

    // UC10: Case-Insensitive & Space-Ignored Palindrome Check
    public static boolean checkPalindromeNormalized(String input) {

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        // Two-pointer comparison
        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      PALINDROME CHECKER APP    ");
        System.out.println(" UC10: Case-Insensitive Method  ");
        System.out.println("================================");

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean result = checkPalindromeNormalized(input);

        if (result) {
            System.out.println("\"" + input + "\" is a Palindrome");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome");
        }

        scanner.close();
    }
}
