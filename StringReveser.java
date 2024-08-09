import java.util.Scanner;

public class StringReveser {
    static String reverseString(String str) {
        if (str.isEmpty())
            return str;
        return reverseString(str.substring(1) + str.charAt(0));
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String str = userInput.next();
        System.out.println(reverseString(str));
        userInput.close();
    }
}
