import java.util.Scanner;

public class SquareRoot {
    static int SqRootForPerfectSquares(int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        int i = 1, result = 1;
        while (result <= number) {
            i++;
            result = i * i;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        int number;
        try (Scanner userInput = new Scanner(System.in)) {
            number = userInput.nextInt();
        }
        int result = SqRootForPerfectSquares(number);
        System.out.printf("The floor value of square root of %d is %d", number, result);
    }
}
