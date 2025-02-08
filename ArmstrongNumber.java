import java.util.Scanner;

public class ArmstrongNumber {
    static int isArmstrong(int number) {
        int armstrong = 0;
        while (number > 0) {
            int digit = number % 10;
            digit = (int) Math.pow(digit, 3);
            armstrong += digit;
            number /= 10;
        }
        return armstrong;
    }

    public static void main(String[] args) {
        int number;
        try (Scanner userInput = new Scanner(System.in)) {
            number = userInput.nextInt();
        }
        int result = isArmstrong(number);
        if (number == result) {
            System.out.println("It's an armstrong number");
        } else {
            System.out.println("not an armstrong number");
        }
    }
}
