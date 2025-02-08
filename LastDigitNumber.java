import java.util.Scanner;

//Find Last Digit Of a^b for Large Numbers
public class LastDigitNumber {
    static int lastDigit(int numberA, int numberB) {
        int output = (int) Math.pow(numberA, numberB);
        output %= 10;
        return output;
    }

    public static void main(String[] args) {
        int numberA;
        int numberB;
        try (Scanner userInput = new Scanner(System.in)) {
            numberA = userInput.nextInt();
            numberB = userInput.nextInt();
        }
        int result = lastDigit(numberA, numberB);
        System.out.println(result);
    }
}
