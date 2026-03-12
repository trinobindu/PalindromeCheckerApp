
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    // UC5: Palindrome Check using Stack
    public static boolean checkPalindromeStack(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters and compare
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      PALINDROME CHECKER APP    ");
        System.out.println("      UC5: Stack Method         ");
        System.out.println("================================");

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        boolean result = checkPalindromeStack(input);

        if (result) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        scanner.close();
    }
}
