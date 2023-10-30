package homeworkweek8;
//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
import java.util.Scanner;
public class Programme_9_Fibonaccinumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the ending number ");
        int number = scanner.nextInt();
        scanner.close();
        if (number <= 0) {
            System.out.println("po nu");
        } else {
            System.out.println(number);
            fibonacciNumber(number);
        }
    }
    public static void fibonacciNumber(int number) {
        int first = 0, second = 1;
        for (int i = 0; i < number; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
