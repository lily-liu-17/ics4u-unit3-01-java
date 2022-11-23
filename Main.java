/*
 * This program reverse
 *
 * @author  Lily Liu
 * @version 1.0
 * @since   2022-11-17
 */

import java.util.Scanner;

/**
 * Main class.
 */
final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The reverseString function.
     *
     * @param str string that reverses.
     * @return String reversed.
     */
    public static String reverseString(String str) {
        final String returnString;

        if (str.length() == 1) {
            returnString = str;
        } else {
            returnString = reverseString(str.substring(1)) + str.charAt(0);
        }

        return returnString;
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        final String stringInput = scan.nextLine();
        System.out.printf("\nThe reversed string is: "
            + reverseString(stringInput));

        System.out.println("\nDone.");
    }
}
