package homeworkweek8;

/**
 * Write a program to input any number and check if it Armstrong number or not
 */

import java.util.Scanner;

public class Programme_10_ArmstrongNumber {
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // using scanner
        System.out.println("Please enter the number");
        int number = scanner.nextInt(); // storing scanner value in number
        scanner.close(); // closing scanner

        if (isArmstrong(number)) {  //using if condition for declaring armstrong number
            System.out.println(number + " is an Armstrong number. ");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) { // using boolean method

        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;

        }
        return originalNumber == sum;

    }
}



