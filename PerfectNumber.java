import java.util.Scanner;

public class PerfectNumber {
    static boolean isPerfectNumber(int number) {
        boolean isPerfect = true;
        int OriginalNumber = number;
        int factorCount = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factorCount += i;
            }
        }
        if (factorCount == OriginalNumber) {
            isPerfect = true;
        } else {
            isPerfect = false;
        }
        return isPerfect;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        userInput.close();
        boolean result = isPerfectNumber(number);
        if (result) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}
