import java.util.Scanner;

public class FindGCD {
    static int gcdOfTwoNumbers(int a, int b) { // gcdOfTwoNumbers(a -> b, b -> r)
        if (b == 0) {
            return a;
        } else {
            return gcdOfTwoNumbers(b, a % b); // gcdOfTwoNumbers(b, r)
        }

    }

    public static void main(String[] args) {
        int numberA;
        int numberB;
        try (Scanner userInput = new Scanner(System.in)) {
            numberA = userInput.nextInt();
            numberB = userInput.nextInt();
        }
        int result = gcdOfTwoNumbers(numberA, numberB);
        System.out.printf("The GCD of %d and %d is: %d", numberA, numberB, result);
    }
}
