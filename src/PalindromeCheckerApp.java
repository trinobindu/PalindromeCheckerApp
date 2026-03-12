
import java.util.Scanner;
import java.util.Stack;

// Palindrome service class (Encapsulation)
class PalindromeChecker {

    // Method to check palindrome using Stack
    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Compare with original string
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker(); // object creation

        System.out.println("================================");
        System.out.println("      PALINDROME CHECKER APP    ");
        System.out.println("   UC11: Object-Oriented Method ");
        System.out.println("================================");

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        scanner.close();
    }
}