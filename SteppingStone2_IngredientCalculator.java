/**
*
* @author Andrew Robinson
*/

package SteppingStones;
import java.util.Scanner;

/**
 * The main method of the class.
 * It uses an if-else branch to validate the user input.
 * It uses a nested if-else branch to give the user a second chance to enter a valid number.
 */
public class SteppingStone2_IngredientCalculator {
    /**
     * The main method of the class.
     * It uses a Scanner to get user input.
     * It uses a try-finally block to ensure that the Scanner is closed.
     * It calculates the total calories by multiplying the number of cups by the calories per cup.
     *
     * @param args command-line arguments (not used)
     */

    public static void main(String[] args) {
    String nameOfIngredient;                    // Name of the ingredient
    double numberOfCups = 0.0;                  // Number of cups
    int numberCaloriesPerCup = 0;               // Number of calories per cup
    double totalCalories = 0.0;                 // Total calories
    Ingredient ingredient = new Ingredient();   // Create a new ingredient object
    Scanner scnr = new Scanner(System.in);      // Create a Scanner object

    try {
        System.out.println("Please enter the name of the ingredient: ");
        nameOfIngredient = scnr.next();
        ingredient.setIngredientName(nameOfIngredient);

        System.out.println("Please enter the number of cups of " + nameOfIngredient + " we'll need: ");
        numberOfCups = scnr.nextDouble();
        ingredient.setIngredientAmount(numberOfCups);
        
        System.out.println("Please enter the number of calories per cup: ");
        numberCaloriesPerCup = scnr.nextInt();
        ingredient.setNumberOfCalories(numberCaloriesPerCup);
    } 
    finally {
        scnr.close();
    }

    totalCalories = numberOfCups * numberCaloriesPerCup;

    System.out.println(nameOfIngredient + " uses " + numberOfCups
    + " cups and has " + totalCalories + " calories.");
    }
}
