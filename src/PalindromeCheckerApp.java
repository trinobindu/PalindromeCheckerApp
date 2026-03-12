
import java.util.Scanner;

public class PalindromeCheckerApp {

    // UC9: Recursive Palindrome Check
    public static boolean checkPalindromeRecursive(String str, int start, int end) {

        // Base condition (middle reached)
        if (start >= end) {
            return true;
        }

        // Compare characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return checkPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      PALINDROME CHECKER APP    ");
        System.out.println("      UC9: Recursive Method     ");
        System.out.println("================================");

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        boolean result = checkPalindromeRecursive(input, 0, input.length() - 1);

        if (result) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        scanner.close();
    }
}
