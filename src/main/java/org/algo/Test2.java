package org.algo;

import java.util.Scanner;

import static java.lang.Thread.*;

public class Test2 {

    public static int sumOfDigits(int number) {

        // Base case: when number reduces to 0, return 0
        if (number == 0) {
            return 0;
        }

        // Get the last digit and make a recursive call with the remaining digits
        return (number % 10) + sumOfDigits(number / 10);

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Enter a single positive number of any size (or enter any anything else to quit):");

            input = s.next();  // Read the input as a string

            // Check if the input is an integer and convert it
            try {

                int number = Integer.parseInt(input);

                // If the input number is less than 1, exit the loop
                if (number < 1) {

                    System.out.println("Exiting the program.");
                    break;

                }

                // Calculate and print the sum of digits
                System.out.println("The sum of digits is: " + sumOfDigits(number));

            } catch (NumberFormatException e) {

                // Break the loop and exit the program
                break;

            }

        }

        s.close();  // Close the scanner

    }
}
