import java.util.Scanner;
import java.lang.Math;

public class PowerOfNumber {
    static int power(int a, int b) {
        int output = (int) Math.pow(a, b);
        return output;
    }

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
        userInput.close();
        int reversedNumber = reverse(number);
        int aPowerReversedA = power(number, reversedNumber);
        System.out.printf("The power of %d and its reversed number %d is: %d", number, reversedNumber, aPowerReversedA);
    }
}
