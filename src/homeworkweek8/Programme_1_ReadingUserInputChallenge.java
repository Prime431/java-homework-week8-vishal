package homeworkweek8;
/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */

import java.util.Scanner;

public class Programme_1_ReadingUserInputChallenge {

    public static void main(String[] args) { //Main method
        Scanner scanner = new Scanner(System.in); // Scanner has introduce
        int total = addTenNumbers(scanner);
        scanner.close(); // closing scanner
        System.out.println("The total number of 10 number is " +total);
    }
      public static int addTenNumbers(Scanner scanner){ // static method
        int total = 0; //declaring integer
        int count = 0;

        while(count<10){ // using while loop
            System.out.println("Enter number" +(count + 1) + ": ");
            if(scanner.hasNextInt()){
                total += scanner.nextInt();
                count++;
            }else{
                System.out.println("Invalid input. please enter valid number");
                scanner.next();
            }
        }
        return  total;
      }
      
}
