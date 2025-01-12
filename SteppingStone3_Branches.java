/*
* @author Andrew Robinson
*/

package SteppingStones;
import java.util.Scanner;

/**
 * This class demonstrates the use of branches in Java.
 * It prompts the user to enter the number of cups.
 * The user input is validated to be an integer and within the range of 1 to 100.
 * If the input is invalid, the user is given another chance to enter a valid number.
 * If the second input is also invalid, an error message is printed.
 */ 
public class SteppingStone3_Branches {
    
    /**
     * The main method of the class.
     * It uses an if-else branch to validate the user input.
     * It uses a nested if-else branch to give the user a second chance to enter a valid number.
     *
     * @param args command-line arguments (not used)
     */

    public static void main(String[] args) {
    int numberCups = -1;                        // Initialize number of cups to an invalid value
    final int MAX_CUPS = 100;                   // Maximum number of cups
    Scanner scnr = new Scanner(System.in);      // Create a Scanner object

    System.out.println("Please enter the number of cups (between 1 and 100): ");
       if (scnr.hasNextInt()) {
           numberCups = scnr.nextInt();

           scnr.close();

           if (numberCups <= MAX_CUPS) {
               System.out.println(numberCups + " is a valid number of cups!");
           } 
           else {
               System.out.println(numberCups + " is not a valid number of cups!");
               System.out.println("Please enter another number of cups between 1 and 100: ");
               numberCups = scnr.nextInt();
               
               if (numberCups <= MAX_CUPS) {
                   System.out.println(numberCups + " is a valid number of cups!");
               } 
               else if (numberCups < 1) {
                   System.out.println(numberCups + " is less than 1. Sorry you are out of attempts.");
               } 
               else if (numberCups > 100) {
                   System.out.println(numberCups + " is greater than 100. Sorry you are out of attempts.");
               } 
            }
        } 
        else {
           System.out.println("Error: That is not a number. Try again.");
       }
    }
}
