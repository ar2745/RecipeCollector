/**
* @author Andrew Robinson
*/

package SteppingStones;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /**
 * This class is used to test the SteppingStone5_Recipe class.
 * It creates a recipe object, adds ingredients to it, and then prints out the recipe.
 * It also prompts the user to create a new recipe.
 */ 
public class SteppingStone5_RecipeTest {

	/**
     * The main method of the class.
     * It creates a recipe object, adds ingredients to it, and then prints out the recipe.
     * It also prompts the user to create a new recipe.
     * It uses a while loop to keep asking the user to create a new recipe until the user chooses to stop.
     *
     * @param args command-line arguments (not used)
     */
	public static void main(String[] args) {
		// Create two recipe objects first
		ArrayList<Ingredient> recipeIngredientsOne = new ArrayList<Ingredient>(); 
		//ArrayList<Ingredient> recipeIngredientsTwo = new ArrayList<Ingredient>();
      
		// Initialize first recipe
		SteppingStone5_Recipe myFirstRecipe = new SteppingStone5_Recipe();

		String ingredientName = "Noodles";												// Initialize ingredient name
		double ingredientAmount = 1.0;													// Initialize ingredient amount
		String unitMeasurement = "oz";													// Initialize unit of measurement
		double numberOfCalories = 100.0;												// Initialize number of calories

		// Create new ingredient object
		Ingredient tempIngredient = new Ingredient().addNewIngredient(ingredientName, ingredientAmount, unitMeasurement, numberOfCalories); 		// Initialize ingredient object
		
		// Add ingredient name to recipeIngredientsOne
		recipeIngredientsOne.add(tempIngredient);										

		// Initialize first recipe
		myFirstRecipe.setRecipeName("Ramen");
    	myFirstRecipe.setServings(2);
    	myFirstRecipe.setRecipeIngredients(recipeIngredientsOne);
    	myFirstRecipe.setTotalRecipeCalories(150);

		// String ingredientNameOne = "PizzaDough";											// Initialize ingredient name
		// String ingredientNameTwo = "MarinaraSauce";										// Initialize ingredient name
		// String ingredientNameThree = "Cheese";											// Initialize ingredient name
		// String ingredientNameFour = "GrilledChicken";									// Initialize ingredient name
		// String ingredientNameFive = "Pineapple";											// Initialize ingredient name
		// double ingredientAmountTwo = 1.0;												// Initialize ingredient amount
		// String unitMeasurementTwo = "oz";												// Initialize unit of measurement
		// double numberOfCaloriesTwo = 50.0;												// Initialize number of calories

		// // Create new ingredient object
		// Ingredient tempIngredientOne = new Ingredient().addNewIngredient(ingredientNameOne, ingredientAmountTwo, unitMeasurementTwo, numberOfCaloriesTwo);
		// Ingredient tempIngredientTwo = new Ingredient().addNewIngredient(ingredientNameTwo, ingredientAmountTwo, unitMeasurementTwo, numberOfCaloriesTwo);
		// Ingredient tempIngredientThree = new Ingredient().addNewIngredient(ingredientNameThree, ingredientAmountTwo, unitMeasurementTwo, numberOfCaloriesTwo);
		// Ingredient tempIngredientFour = new Ingredient().addNewIngredient(ingredientNameFour, ingredientAmountTwo, unitMeasurementTwo, numberOfCaloriesTwo);
		// Ingredient tempIngredientFive = new Ingredient().addNewIngredient(ingredientNameFive, ingredientAmountTwo, unitMeasurementTwo, numberOfCaloriesTwo);

		// recipeIngredientsTwo.add(tempIngredientOne);										// Add ingredient name to recipeIngredientsTwo
		// recipeIngredientsTwo.add(tempIngredientTwo);										// Add ingredient name to recipeIngredientsTwo
		// recipeIngredientsTwo.add(tempIngredientThree);									// Add ingredient name to recipeIngredientsTwo
		// recipeIngredientsTwo.add(tempIngredientFour);									// Add ingredient name to recipeIngredientsTwo
		// recipeIngredientsTwo.add(tempIngredientFive);									// Add ingredient name to recipeIngredientsTwo

		// // Initialize second recipe
    	// SteppingStone5_Recipe mySecondRecipe = new SteppingStone5_Recipe("Pizza", 2, recipeIngredientsTwo, 300.0);
   	 
    	// // Print details of both recipes
    	//myFirstRecipe.printRecipe();
    	//mySecondRecipe.printRecipe();

		// Create new recipe
		SteppingStone5_Recipe myNewRecipe = new SteppingStone5_Recipe();
		Scanner scnr = new Scanner(System.in);

		while (true) {
			System.out.println("Would you like to create a new recipe? (y or n)");
			String reply = scnr.next().toLowerCase();

			if (reply.equals("y")) {
				myNewRecipe.createNewRecipe();
				break;
			}
			else if (reply.equals("n")) {
				System.out.println("Goodbye!");
				break;
			}
			else {
				System.out.println("Please enter a \"y\" or \"n\"");
			}
		}
		scnr.close();
	}
}
