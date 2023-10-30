package homeworkweek8;
/**
 * AndMaxInputChallenge.
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

import java.util.Scanner;

public class Programme_3_VowelConsonant {
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // declaring scanner
        String input = scanner.next();
        if (input.length() != 1) { //condition for identifying the one character
            System.out.println("Error : Please provide one letter");
        } else {
            char ch = input.charAt(0);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) { // if condition for vowel
                switch (ch) { //using switch for identifying th vowel
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':

                        System.out.println("Input letter is Vowel"); //printing statement
                        break;
                    default:
                        System.out.println("input letter is consonant");
                }
            } else {
                System.out.println("Error: Please enter a valid letter between a to z or A to Z"); // Error message
            }
        }

    }
}
