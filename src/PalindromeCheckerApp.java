import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    // UC1 - Basic Reverse Using Loop
    public static boolean checkPalindromeBasic(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }

    // UC2 - Reverse Using For Loop (Forward)
    public static boolean checkPalindromeForward(String input) {
        String reversed = "";
        for (int i = 0; i < input.length(); i++) {
            reversed = input.charAt(i) + reversed;
        }
        return input.equals(reversed);
    }

    // UC3 - Two Pointer Method
    public static boolean checkPalindromeTwoPointer(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // UC4 - Using StringBuilder
    public static boolean checkPalindromeStringBuilder(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // UC5 - Using Stack
    public static boolean checkPalindromeStack(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return input.equals(reversed);
    }

    // UC6 - Using Recursion
    public static boolean checkPalindromeRecursion(String input) {
        if (input.length() <= 1) {
            return true;
        }
        if (input.charAt(0) != input.charAt(input.length() - 1)) {
            return false;
        }
        return checkPalindromeRecursion(input.substring(1, input.length() - 1));
    }

    // UC7 - Ignore Case
    public static boolean checkPalindromeIgnoreCase(String input) {
        input = input.toLowerCase();
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // UC8 - Ignore Case and Spaces
    public static boolean checkPalindromeIgnoreCaseAndSpaces(String input) {
        input = input.toLowerCase().replaceAll("\\s+", "");
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     WELCOME TO PALINDROME APP  ");
        System.out.println("================================");

        System.out.print("Enter a word or sentence: ");
        String word = scanner.nextLine();

        System.out.println("\n----- RESULTS -----");

        System.out.println("UC1: " + (checkPalindromeBasic(word) ? "Palindrome" : "Not Palindrome"));
        System.out.println("UC2: " + (checkPalindromeForward(word) ? "Palindrome" : "Not Palindrome"));
        System.out.println("UC3: " + (checkPalindromeTwoPointer(word) ? "Palindrome" : "Not Palindrome"));
        System.out.println("UC4: " + (checkPalindromeStringBuilder(word) ? "Palindrome" : "Not Palindrome"));
        System.out.println("UC5: " + (checkPalindromeStack(word) ? "Palindrome" : "Not Palindrome"));
        System.out.println("UC6: " + (checkPalindromeRecursion(word) ? "Palindrome" : "Not Palindrome"));
        System.out.println("UC7 (Ignore Case): " + (checkPalindromeIgnoreCase(word) ? "Palindrome" : "Not Palindrome"));
        System.out.println("UC8 (Ignore Case & Spaces): " + (checkPalindromeIgnoreCaseAndSpaces(word) ? "Palindrome" : "Not Palindrome"));

        scanner.close();
    }
}