import java.util.Scanner;

public class IsOddOrEven {
    static String oddOrEven(int number) {
        String output = "";
        if (number <= 0) {
            output = "Enter a number > 0";
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
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        System.out.println("The Number to find odd or even is: " + number);
        userInput.close();
        String result = oddOrEven(number);
        System.out.printf("The number %d is %s", number, result);
    }
}
