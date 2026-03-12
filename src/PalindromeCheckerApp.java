
import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    // UC7: Deque-Based Palindrome Check
    public static boolean checkPalindromeDeque(String input) {

        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        // Compare front and rear characters
        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      PALINDROME CHECKER APP    ");
        System.out.println("       UC7: Deque Method        ");
        System.out.println("================================");

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        boolean result = checkPalindromeDeque(input);

        if (result) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        scanner.close();
    }
}
