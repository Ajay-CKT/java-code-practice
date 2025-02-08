import java.util.Scanner;

public class DivisorsOfNumber {
    static void allDivisorOfNumber(int number) {
        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int number;
        try (Scanner userInput = new Scanner(System.in)) {
            number = userInput.nextInt();
        }
        allDivisorOfNumber(number);
    }
}
