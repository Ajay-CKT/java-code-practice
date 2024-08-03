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
        Scanner userInput = new Scanner(System.in);
        int numberA = userInput.nextInt();
        int numberB = userInput.nextInt();
        userInput.close();
        int result = gcdOfTwoNumbers(numberA, numberB);
        System.out.printf("The GCD of %d and %d is: %d", numberA, numberB, result);
    }
}
