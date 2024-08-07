import java.util.Scanner;

public class MinMaxInArray {
    static int minVal(int[] arr, int size) {
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int maxVal(int[] arr, int size) {
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int size = userInput.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = userInput.nextInt();
        }
        userInput.close();
        int min = minVal(arr, size);
        int max = maxVal(arr, size);
        System.out.println("Minimum value is: " + min + ", and maximum value is: " + max);
    }
}