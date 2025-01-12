/*
* @author Andrew Robinson
*/

package SteppingStones;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * This class demonstrates the use of loops in Java.
 * It prompts the user to enter a recipe name and a list of ingredients.
 * The user can choose to add more ingredients or stop.
 * Finally, it prints out the recipe name and the list of ingredients.
 */
public class SteppingStone4_Loops {
    
    /**
     * The main method of the class.
     * It uses a do-while loop to prompt the user to enter ingredients.
     * It uses a for loop to print out the list of ingredients.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String recipeName = "";
    ArrayList<String> ingredientList = new ArrayList<String>();
    String newIngredient = "";
    boolean addMoreIngredients = true;
    
    System.out.println("Please enter the recipe name: ");
    recipeName = scnr.nextLine();
       
       do {           
           System.out.println("Would you like to enter an ingredient: (y or n)");
           String reply = scnr.next().toLowerCase();

            if (reply.equals("y")) {
                System.out.println("Please enter the ingredient name: ");
                newIngredient = scnr.next();
                ingredientList.add(newIngredient);
            }
            else if (reply.equals("n")) {
                addMoreIngredients = false;
            }
            else {
                System.out.println("Please enter a \"y\" or \"n\"");
            }
            
       } while (addMoreIngredients);

       scnr.close();

       System.out.println("The recipe for " + recipeName + " requires:");

       for (int i = 0; i < ingredientList.size(); i++) {
		   String ingredient = ingredientList.get(i);
           System.out.println(ingredient);
       }
    }
}