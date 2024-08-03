import java.util.Scanner;

public class PalindromeInNumber {
    static boolean isPalindrome(int number) {
        boolean isPalindrome = true;
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        System.out.println(reversedNumber);
        if (reversedNumber == originalNumber) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        userInput.close();
        boolean result = isPalindrome(number);
        if (result) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}
