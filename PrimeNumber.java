import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int number) {
        boolean isPrime = true;
        switch (number) {
            case 1:
                isPrime = false;
                break;
            case 2:
                isPrime = true;
                break;
            default:
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                break;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int number;
        try (Scanner userInput = new Scanner(System.in)) {
            number = userInput.nextInt();
        }
        boolean result = isPrime(number);
        if (result) {
            System.out.println("prime");
        } else {
            System.out.println("not a prime");
        }
    }
}
