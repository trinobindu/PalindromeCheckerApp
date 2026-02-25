import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("   WELCOME TO PALINDROME APP   ");
        System.out.println("================================");

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

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
}