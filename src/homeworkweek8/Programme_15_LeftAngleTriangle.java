package homeworkweek8;

import java.util.Scanner;

/**
 * 15. Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Programme_15_LeftAngleTriangle {
    public static void main(String[] args) { //main method
        Scanner scanner = new Scanner(System.in);// Declaring scanner
        System.out.print("Enter the number of rows  ");
        int numRows = scanner.nextInt();
        scanner.close(); // closing scanner
        printleftTraingle(numRows);
    }

    public static void printleftTraingle(int numRows) {
        for (int i = 1; i <= numRows; i++) { //for loop, for number of row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

