import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("   WELCOME TO PALINDROME APP   ");
        System.out.println("================================");

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
uc5StackPalindrome(word);

        String cleaned = word.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";

        for(int i = cleaned.length() - 1; i >= 0; i--) {
            reversed = reversed + cleaned.charAt(i);
        }

        if(cleaned.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

        scanner.close();
    }
public static void uc5StackPalindrome(String input) {

    Stack<Character> stack = new Stack<>();

    // Push characters into stack
    for (char ch : input.toCharArray()) {
        stack.push(ch);
    }

    boolean isPalindrome = true;

    // Pop and compare
    for (char ch : input.toCharArray()) {
        if (ch != stack.pop()) {
            isPalindrome = false;
            break;
        }
    }

    if (isPalindrome) {
        System.out.println("UC5 Result: Palindrome");
    } else {
        System.out.println("UC5 Result: Not Palindrome");
    }
}
}