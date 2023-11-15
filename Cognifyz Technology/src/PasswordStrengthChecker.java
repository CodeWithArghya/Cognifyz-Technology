//Level-2  Task-2-> Password Strength Checker in Java

import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        String select;
        do {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your password:");
            String password = scanner.nextLine();

            if (isStrongPassword(password)) {
                System.out.println("Password is strong.");
            } else {
                System.out.println("Password is weak. Please follow the password guidelines.");
            }
            System.out.println("Press Yes to Continue else press No to Close");
            select = scanner.next();
        }while (!select.equals("no"));

    }


    private static boolean isStrongPassword(String password) {

        return password.length() >= 8 &&
                containsUppercase(password) &&
                containsLowercase(password) &&
                containsDigit(password) &&
                containsSpecialCharacter(password);
    }

    private static boolean containsUppercase(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsLowercase(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsDigit(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsSpecialCharacter(String password) {
        String specialCharacters = "!@#$%^&*()-_+=<>?/[]{},.";
        for (char ch : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(ch))) {
                return true;
            }
        }
        return false;
    }
}
