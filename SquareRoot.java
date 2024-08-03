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
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        userInput.close();
        int result = SqRootForPerfectSquares(number);
        System.out.printf("The floor value of square root of %d is %d", number, result);
    }
}
