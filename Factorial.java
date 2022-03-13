/*
* This is Factorial  program.
*
* @author  Abdul Basit Butt
* @version 1.0
* @since   2022-02-15
* Class Factorial.
*/

import java.util.Scanner;

/**
* This is factorial program.
*/
final class Factorial {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    *
    */
    private Factorial() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting boardCalculator() function.
    *
    * @param denominator is a number
    *
    * @return factorial of number
    */
    public static int factorial(final int denominator) {
        final int returnValue;
        if (denominator == 0) {
            returnValue = 1;
        } else if (denominator > 0) {
            returnValue = denominator * factorial(denominator - 1);
        } else {
            returnValue = denominator * factorial(denominator + 1);
        }
        return returnValue;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer:");
        final String input = scanner.nextLine();

        try {
            final int inputInt = Integer.valueOf(input);
            final int result = factorial(inputInt);
            System.out.println(
                "The factorial of " + input + " is " + result + ".");
        } catch (java.lang.NumberFormatException error) {
            System.out.println(error);
        }

        System.out.println("\nDone.");
    }
}
