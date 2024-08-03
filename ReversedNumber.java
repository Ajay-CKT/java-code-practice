import java.util.Scanner;

public class ReversedNumber {
    static int reverse(int number) {
        int reversedNumber = 0;
        int remainder;
        while (number > 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        System.out.println("The original number is: " + number);
        userInput.close();
        int result = reverse(number);
        System.out.println("The reversed number is: " + result);
    }
}