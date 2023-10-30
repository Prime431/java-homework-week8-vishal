package homeworkweek8;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class Programme_13_SharedDigit {
    public static void main(String[] args) { // main method
        System.out.println(hasSharedDigit(10, 10));
    }
    public static boolean hasSharedDigit(int i, int j) {
        if ((i < 9 || i > 100) || (j < 9 || j > 100)) { //if condition for i and j between 9 to 100
            return false;
        }
        int num1Digit1 = i % 10;
        int num1Digit2 = i / 10;
        int num2Digit1 = j % 10;
        int num2Digit2 = j / 10;

        return (num1Digit1 == num2Digit1 || num1Digit1 == num2Digit2 || num1Digit2 == num2Digit1 || num1Digit2 == num2Digit2);

    }
}