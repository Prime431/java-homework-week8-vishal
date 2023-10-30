package homeworkweek8;
/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Programme_2_MinAndMaxInputChallenge {

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); //declaring scanner

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean firstNumber = true;

        while (true) {
            System.out.println("Enter the number: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (firstNumber) {
                    min = number;
                    max = number;
                    firstNumber = false;
                } else {
                    if (number < min) {
                        min = number;
                    }
                    if (number > max) {
                        max = number;
                    }
                }
            } else {
                break; // Exit the loop if the input is invalid
            }
            scanner.nextLine(); //Handle the end of line
        }
        if (!firstNumber) {
            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);
        } else {
            System.out.println("No valid numbers entered. ");
        }
        scanner.close();
    }
}