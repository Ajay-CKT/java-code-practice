import java.util.Scanner;

public class PerfectNumber {
    static boolean isPerfectNumber(int number) {
        boolean isPerfect;
        int OriginalNumber = number;
        int factorCount = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factorCount += i;
            }
        }
        isPerfect = factorCount == OriginalNumber;
        return isPerfect;
    }

    public static void main(String[] args) {
        int number;
        try (Scanner userInput = new Scanner(System.in)) {
            number = userInput.nextInt();
        }
        boolean result = isPerfectNumber(number);
        if (result) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}
