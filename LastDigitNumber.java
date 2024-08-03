import java.util.Scanner;
import java.lang.Math;

//Find Last Digit Of a^b for Large Numbers
public class LastDigitNumber {
    static int lastDigit(int numberA, int numberB) {
        int output = (int) Math.pow(numberA, numberB);
        output %= 10;
        return output;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int numberA = userInput.nextInt();
        int numberB = userInput.nextInt();
        userInput.close();
        int result = lastDigit(numberA, numberB);
        System.out.println(result);
    }
}
