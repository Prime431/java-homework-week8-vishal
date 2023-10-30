package homeworkweek8;

import java.util.Scanner;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8_Triangle_nested {
    public static void main(String[] args) {
        triangle();
    }

    public static void triangle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the row number ");
        int row = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= row; ++i) {
            for (int j = 1; j <= i; ++j) {
                //  System.out.println(i);

                System.out.print(" @ ");

            }
            System.out.println("");
        }

    }
}