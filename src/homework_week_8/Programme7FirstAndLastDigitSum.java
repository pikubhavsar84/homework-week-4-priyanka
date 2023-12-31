package homework_week_8;

import java.util.Scanner;

/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

public class Programme7FirstAndLastDigitSum {
    public static void main(String[] args) {
        //scanner used
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int result = sumFirstAndLastDigit(number);
            //Nested if else used
            if (result != -1) {
                System.out.println("Sum of the first and last digit: " + result);
            } else {
                System.out.println("Parameter is negative and needs to be positive : " + result);
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close(); // scanner closed
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;

        while (number >= 10) {
            number /= 10;
        }

        int firstDigit = number;

        return firstDigit + lastDigit;
    }
}
