package SteppingStones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class represents a recipe box containing a list of recipes.
 */
public class SteppingStone6_RecipeBox {
	
	/**
     * A list of recipes in this recipe box.
     */
	private ArrayList<SteppingStone5_Recipe> listOfRecipes;
    
	/**
     * Returns the list of recipes in this recipe box.
     *
     * @return the list of recipes
     */
	public ArrayList<SteppingStone5_Recipe> getListOfRecipes() {
		return listOfRecipes;
	}

	/**
     * Sets the list of recipes in this recipe box.
     *
     * @param listOfRecipes the new list of recipes
     */
	public void setListOfRecipes(ArrayList<SteppingStone5_Recipe> listOfRecipes) {
		this.listOfRecipes = listOfRecipes;
	}

	/**
     * Creates a new recipe box with an empty list of recipes.
     */

	// Default constructor
	public SteppingStone6_RecipeBox() {
		listOfRecipes = new ArrayList<SteppingStone5_Recipe>();
	}

	/**
     * Creates a new recipe box with the specified list of recipes.
     *
     * @param listOfRecipes the list of recipes
     */

	// Constructor with parameters
	public SteppingStone6_RecipeBox(ArrayList<SteppingStone5_Recipe> listOfRecipes) {
		this.listOfRecipes = listOfRecipes;
	}

	/**
	 * Prints the details of the selected recipe.
	 *
	 * @param selectedRecipe the name of the recipe to print
	 */

	// Method to print all recipe details
	public void printAllRecipeDetails(String selectedRecipe) {
		for (SteppingStone5_Recipe recipe : listOfRecipes) {
			if (recipe.getRecipeName().equals(selectedRecipe)) {
				recipe.printRecipe();
				break;
			}
		}
	}

	/**
	 * Prints the names of all recipes in this recipe box.
	 */

	// Method to print all recipe names
	public void printAllRecipeNames() {
		for (int i = 0; i < listOfRecipes.size(); i++) {
			System.out.println(listOfRecipes.get(i).getRecipeName());
		}
	}

	/**
	 * Adds a new recipe to this recipe box.
	 *
	 * @param tmpRecipe the recipe to add
	 */

	// Method to add recipe
	public void addNewRecipe(SteppingStone5_Recipe tmpRecipe) {
		listOfRecipes.add(tmpRecipe);
	}

	/**
	 * Creates a new recipe and adds it to this recipe box.
	 * The user is prompted to enter the recipe name, number of servings, and ingredients.
	 */

	// Method to create a new recipe
	public void newRecipe() {
		ArrayList<Ingredient> recipeIngredients = new ArrayList<Ingredient>();
		double totalRecipeCalories = 0.0;

		Scanner scnr = new Scanner(System.in);	

		System.out.println("Please enter the recipe name: ");
		String recipeName = scnr.nextLine();
		
		System.out.println("Please enter the number of servings: ");
		int servings = scnr.nextInt();

		System.out.println("Please enter the ingredient name: ");
		String ingredientName = scnr.next();

		System.out.println("Please enter the ingredient amount: ");
		float ingredientAmount = scnr.nextFloat();

		System.out.println("Please enter the ingredient unit of measurement: ");
		String unitMeasurement = scnr.next();

		System.out.println("Please enter the ingredient Calories: ");
		int ingredientCalories = scnr.nextInt();

		System.out.println();

		Ingredient newIngredient = new Ingredient(ingredientName, ingredientAmount, unitMeasurement, ingredientCalories);

		recipeIngredients.add(newIngredient);

		totalRecipeCalories += (ingredientCalories * ingredientAmount);

		SteppingStone5_Recipe tmpRecipe = new SteppingStone5_Recipe(recipeName, servings, recipeIngredients, totalRecipeCalories);

		addNewRecipe(tmpRecipe);
	}
	
	/**
	 * Prints a menu of options for the user to select from.
	 * 
	 * @param args command-line arguments (not used)
	 */

	// Method to print the menu
	public static void main(String[] args) {
    	// Create a Recipe Box
    		
		SteppingStone6_RecipeBox myRecipeBox = new SteppingStone6_RecipeBox(); //Uncomment for main method
        Scanner menuScnr = new Scanner(System.in);
		boolean continueProcess = true;
		boolean addMoreRecipes = true;

		
		/**
		* Print a menu for the user to select one of the three options:
		*
		*/
		while (continueProcess) {
			System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "4. Other Options" + "\n \nPlease select a menu item:");
			

			while (addMoreRecipes) {	
				int input = menuScnr.nextInt();
				if (input == 1) {
					myRecipeBox.newRecipe();
					break;
				} 
				else if (input == 2) {
					System.out.println("Which recipe?");
					String selectedRecipeName = menuScnr.next();
					System.out.println();
					myRecipeBox.printAllRecipeDetails(selectedRecipeName);
					
					while (true) {
						System.out.println("Would you like to print another recipe? (y or n)");
						String reply = menuScnr.next().toLowerCase();
						if (reply.equals("y")) {
							System.out.println("Which recipe?\n");
							selectedRecipeName = menuScnr.next();
							myRecipeBox.printAllRecipeDetails(selectedRecipeName);
						} 
						else if (reply.equals("n")) {
							break;
						}
					}
					break;
				} 
				else if (input == 3) {		
					System.out.println();
					System.out.println("List of Recipes: ");
					myRecipeBox.printAllRecipeNames();
					System.out.println();
					break;
				} 
				else if (input == 4) {
					System.out.println("\nMenu\n" + "1. Exit the program\n" + "\nPlease select a menu item:");
					
					int input2 = menuScnr.nextInt();
					
					if (input2 == 1) {
						continueProcess = false;
						break;
					}
				}
			}
		}
		menuScnr.close();
	}
}
