/**
* @author Andrew Robinson
*/

package SteppingStones;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Creates a new recipe and adds it to this recipe box.
 * The user is prompted to enter the recipe name, number of servings, and ingredients.
 */
public class SteppingStone5_Recipe {

    /**
     * Add three variables:
     * 
     * 1. a variable 'servings' to store how many people the recipe will feed;
     *
     * 2. an ArrayList variable 'recipeIngredients' to store the text for the
     *      names (recipeName) each recipe ingredient added
     *
     * 3. a variable totalRecipeCalories 
     * 
     */ 
    
    private String recipeName;
    private int servings; 
    private ArrayList<Ingredient> recipeIngredients;
    private double totalRecipeCalories;
    private static ArrayList<SteppingStone5_Recipe> listOfRecipes = new ArrayList<SteppingStone5_Recipe>();
    
    /**
     * Returns the name of the recipe.
     *
     * @return the name of the recipe
     */

    // Getter and Setter for recipeName
    public String getRecipeName() {
        return recipeName;
    }

    /**
     * Sets the name of the recipe.
     *
     * @param recipeName the new name of the recipe
     */
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    /**
     * Returns the number of servings.
     *
     * @return the number of servings
     */

    // Getter and Setter for servings
    public int getServings() {
        return servings;
    }

    /**
     * Sets the number of servings.
     * If the number of servings is less than or equal to 0, an error message is printed.
     *
     * @param servings the new number of servings
     */

    public void setServings(int servings) {
        if (servings > 0) {
            this.servings = servings;
        } else {
            System.out.println("Invalid number of servings.");
        }
    }

    /**
     * Returns the list of ingredients for the recipe.
     *
     * @return the list of ingredients
     */

    // Getter and Setter for recipeIngredients
    public ArrayList<Ingredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    /**
     * Sets the list of ingredients for the recipe.
     * If the list of ingredients is null or empty, an error message is printed.
     *
     * @param recipeIngredients the new list of ingredients
     */
    public void setRecipeIngredients(ArrayList<Ingredient> recipeIngredients) {
        if (recipeIngredients != null && !recipeIngredients.isEmpty()) {
            this.recipeIngredients = recipeIngredients;
        } else {
            System.out.println("Invalid recipe ingredients.");
        }
    }

    /**
     * Returns the total calories for the recipe.
     *
     * @return the total calories
     */

    // Getter and Setter for totalRecipeCalories
    public double getTotalRecipeCalories() {
        return totalRecipeCalories;
    }

    /**
     * Sets the total calories for the recipe.
     * If the total calories is less than 0, an error message is printed.
     *
     * @param totalRecipeCalories the new total calories
     */ 
    public void setTotalRecipeCalories(double totalRecipeCalories) {
        if (totalRecipeCalories >= 0) {
            this.totalRecipeCalories = totalRecipeCalories;
        } else {
            System.out.println("Invalid total recipe calories.");
        }
    }
    
    // Default constructor
    public SteppingStone5_Recipe() {
        this.recipeName = "";
        this.servings = 0; //<--- assign 0 to servings
        this.recipeIngredients = new ArrayList<>(); //<-- create an empty ArrayList
        this.totalRecipeCalories = 0;
    }

    /**
     * Constructor that initializes the recipe with the provided values.
     *
     * @param recipeName the name of the recipe
     * @param servings the number of servings
     * @param recipeIngredients the list of ingredients
     * @param totalRecipeCalories the total calories
     */

    // Constructor with parameters
    public SteppingStone5_Recipe(String recipeName, int servings, ArrayList<Ingredient> recipeIngredients, double totalRecipeCalories) {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = totalRecipeCalories;
    }

    /**
     * Adds a recipe to the list of recipes.
     *
     * @param tmpRecipe the recipe to add
     */

    // Method to add recipe to listOfRecipes
    public void addRecipe(SteppingStone5_Recipe tmpRecipe) {
        listOfRecipes.add(tmpRecipe);
    }
    
    /**
     * Prints the recipe, including the name, servings, ingredients, and calories per serving.
     */

    // Method to print recipe
    public void printRecipe() {
        int singleServingCalories = (int) (totalRecipeCalories / servings);

        System.out.println("Recipe: " + recipeName);
        System.out.println("Serves: " + servings);
        System.out.println("Ingredients: ");
        
        for (int i = 0; i < recipeIngredients.size(); i++) {
            Ingredient ingredient = recipeIngredients.get(i);
            System.out.println(ingredient);
        }

        System.out.println("Each serving has " + singleServingCalories + " Calories.");
    }

    /**
     * Returns the conversion factor from the given unit to metric units.
     * The conversion factor depends on the unit of measurement.
     * If the unit is not recognized, it returns 1.
     *
     * @param unit the unit of measurement
     * @return the conversion factor to metric units
     */
    public float getConversionFactor(String unit) {
        switch (unit.toLowerCase()) {
            case "teaspoon":
                return 4.92892f; // Conversion factor from teaspoons to milliliters
            case "tablespoon":
                return 14.7868f; // Conversion factor from tablespoons to milliliters
            case "cup":
                return 236.588f; // Conversion factor from cups to milliliters
            case "ounce":
                return 28.3495f; // Conversion factor from ounces to grams
            case "pound":
                return 453.592f; // Conversion factor from pounds to grams
            default:
                return 1f; // If the unit is not recognized, return 1
        }
    }

    /**
     * Converts the amounts of all ingredients in the recipe to metric units.
     * It uses the getConversionFactor method to get the conversion factor for each ingredient's unit of measurement.
     * It then multiplies the ingredient's amount by the conversion factor and sets the new amount.
     */
    public void convertIngredientAmountsToMetric() {
        for (Ingredient ingredient : recipeIngredients) {
            float conversionFactor = getConversionFactor(ingredient.getUnitMeasurement());
            double amountInMetric = ingredient.getIngredientAmount() * conversionFactor; // conversionFactor depends on the unit of measurement
            ingredient.setIngredientAmount(amountInMetric);
        }
    }
    
    /**
     * Creates a new recipe, prompting the user to enter the recipe details.
     */

    public void createNewRecipe() {
        double totalRecipeCalories = 0;
        ArrayList<Ingredient> recipeIngredients = new ArrayList<>();
        Ingredient ingredient = new Ingredient();
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();
        
        System.out.println("Please enter the number of servings: ");
        
        //correct data type & Scanner assignment method for servings variable
        int servings = scnr.nextInt();
        
        while (true) {
            /**
            * Add the ingredient name to recipeIngredients
            * 
            */                 
            System.out.println("Please enter the ingredient name: ");
            ingredient.setIngredientName(scnr.next());
            
            System.out.println("Please enter the ingredient amount: ");
            ingredient.setIngredientAmount(scnr.nextDouble());

            System.out.println("Please enter the ingredient unit of measurement: ");
            ingredient.setUnitMeasurement(scnr.next());
        
            System.out.println("Please enter the ingredient Calories: ");
            ingredient.setNumberOfCalories(scnr.nextDouble());

            Ingredient newIngredient = new Ingredient(ingredient.getIngredientName(), ingredient.getIngredientAmount(), ingredient.getUnitMeasurement(), ingredient.getNumberOfCalories());

            recipeIngredients.add(newIngredient);
            
            // Add the total Calories from this ingredient
            // (ingredientCalories * ingredientAmount)
            // to the totalRecipeCalories
            
            totalRecipeCalories += (ingredient.getNumberOfCalories() * ingredient.getIngredientAmount());
            System.out.println("Would you like to enter another ingredient? (y or n)");
            String reply = scnr.next().toLowerCase();

            if (reply.equals("n")) {
                break;
            }
            else if (!reply.equals("y")) {
                System.out.println("Please enter a \"y\" or \"n\"");
                if (reply.equals("y")) {
                    continue;
                }
                else if (reply.equals("n")) {
                    break;
                }
            }
        }

        scnr.close();
        
        SteppingStone5_Recipe recipe1 = new SteppingStone5_Recipe(recipeName, 
            servings, recipeIngredients, totalRecipeCalories);
        // recipe1.addRecipe(recipe1);
        recipe1.printRecipe();
    }
}
