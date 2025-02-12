import java.util.Scanner;;

public class CountDigits {
    static int countDigitInNumber(int number) {
        int originalNumber = number;
        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit != 0 && originalNumber % digit == 0) {
                count++;
                number /= 10;
            } else {
                number /= 10;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int number;
        try (Scanner userInput = new Scanner(System.in)) {
            number = userInput.nextInt();
            System.out.println("The Number is: " + number);
        }
        int result = countDigitInNumber(number);
        System.out.println(result);
    }
}
