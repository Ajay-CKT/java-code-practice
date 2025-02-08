import java.util.Scanner;

public class StringReveser {
    static String reverseString(String str) {
        return str;
    }

    public static void main(String[] args) {
        try (Scanner userInput = new Scanner(System.in)) {
            String str = userInput.next();
            System.out.println(reverseString(str));
        }
    }
}
