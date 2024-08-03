import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int number) {
        boolean isPrime = true;
        if (number == 1) {
            isPrime = false;
        } else if (number == 2) {
            isPrime = true;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        userInput.close();
        boolean result = isPrime(number);
        if (result) {
            System.out.println("prime");
        } else {
            System.out.println("not a prime");
        }
    }
}
