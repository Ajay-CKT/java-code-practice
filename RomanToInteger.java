public class RomanToInteger {
    static int value(char i) {
        switch (i) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String str = "MCMXCIV";
        int size = str.length();
        int val = value(str.charAt(size - 1));
        for (int i = size - 2; i >= 0; i--) {
            if (value(str.charAt(i)) < value(str.charAt(i + 1))) {
                val -= value(str.charAt(i));
            } else {
                val += value(str.charAt(i));
            }
        }
        System.out.println(val);
    }
}
/*
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 */