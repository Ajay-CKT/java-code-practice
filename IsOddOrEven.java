import java.util.Scanner;

public class IsOddOrEven {
    static String oddOrEven(int number) {
        String output;
        if (number <= 0) {
            output = "🔴Enter a number > 0";
        } else {
            if (number % 2 == 0) {
                output = "even";
            } else {
                output = "odd";
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int number;
        try (Scanner userInput = new Scanner(System.in)) {
            number = userInput.nextInt();
            System.out.println("The Number to find odd or even is: " + number);
        }
        String result = oddOrEven(number);
        System.out.printf("The number %d is %s", number, result);
    }
}
