import java.util.Scanner;

public class PalindromeCheckerApp {
    public static boolean checkPalindromeBasic(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }
    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("     WELCOME TO PALINDROME APP  ");
        System.out.println("================================");

    }
}