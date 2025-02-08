import java.util.Scanner;

public class PalindromeInNumber {
    static boolean isPalindrome(int number) {
        boolean isPalindrome;
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        isPalindrome = reversedNumber == originalNumber;
        return isPalindrome;
    }

    public static void main(String[] args) {
        int number;
        try (Scanner userInput = new Scanner(System.in)) {
            number = userInput.nextInt();
        }
        boolean result = isPalindrome(number);
        if (result) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}
