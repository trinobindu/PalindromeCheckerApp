
import java.util.Scanner;

public class PalindromeCheckerApp {

    // Node class for Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Convert string to linked list
    public static Node createList(String input) {
        Node head = null;
        Node tail = null;

        for (char ch : input.toCharArray()) {
            Node newNode = new Node(ch);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    // Reverse linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // Palindrome check using linked list
    public static boolean checkPalindromeLinkedList(String input) {

        Node head = createList(input);

        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        // Find middle using fast & slow pointer
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow.next);

        Node firstHalf = head;
        Node tempSecond = secondHalf;

        // Compare halves
        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      PALINDROME CHECKER APP    ");
        System.out.println("      UC8: Linked List Method   ");
        System.out.println("================================");

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        boolean result = checkPalindromeLinkedList(input);

        if (result) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        scanner.close();
    }
}