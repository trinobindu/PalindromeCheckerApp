
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase13PalindromeCheckerApp {

    // Stack Algorithm
    public static boolean stackPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Deque Algorithm
    public static boolean dequePalindrome(String input) {

        Deque<Character> deque = new LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "level";

        // Stack Performance
        long startStack = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long endStack = System.nanoTime();

        // Deque Performance
        long startDeque = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        long endDeque = System.nanoTime();

        System.out.println("Input : " + input);

        System.out.println("\nStack Algorithm");
        System.out.println("Is Palindrome : " + stackResult);
        System.out.println("Execution Time : " + (endStack - startStack) + " ns");

        System.out.println("\nDeque Algorithm");
        System.out.println("Is Palindrome : " + dequeResult);
        System.out.println("Execution Time : " + (endDeque - startDeque) + " ns");
    }
}
