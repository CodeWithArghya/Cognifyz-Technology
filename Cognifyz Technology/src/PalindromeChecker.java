//Task-2 Palindrome Checker [Level-2]

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String select;

        do {
            System.out.println("Enter a string to check if it's a palindrome:");
            String input = scanner.nextLine();

            if (isPalindrome(input)) {
                System.out.println("The entered string is a palindrome.");
            } else {
                System.out.println("The entered string is not a palindrome.");
            }

            System.out.println("Want to Continue? Press 'yes' to continue, else press 'no' to exit.. ");
            select = scanner.next();
            scanner.nextLine(); // Consume the newline character

        } while (!select.equals("no"));

        scanner.close();
    }

    private static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = cleanedStr.length();

        for (int i = 0; i < length / 2; i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
