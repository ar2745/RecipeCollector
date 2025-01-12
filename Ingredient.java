/**
* @author Andrew Robinson
*/

package SteppingStones;

/**
 * This class represents an ingredient, with a name, amount, unit of measurement, and number of calories.
 * 
*/

// Public class for Ingredient
public class Ingredient {
    private static String ingredientName;      // String for ingredient name
    private static double ingredientAmount;     // Float for ingredient amount
    private static String unitMeasurement;     // String for unit of measurement
    private static double numberOfCalories;    // Double for number of calories

    /**
     * Default constructor that initializes the ingredient with default values.
     */

    // Default constructor
    public Ingredient() {
        ingredientName = "Unknown";
        ingredientAmount = 0.0;
        unitMeasurement = "Unknown";
        numberOfCalories = 0.0;
    }

    /**
     * Constructor that initializes the ingredient with the provided values.
     *
     * @param ingredientName the name of the ingredient
     * @param ingredientAmount the amount of the ingredient
     * @param unitMeasurement the unit of measurement for the ingredient
     * @param numberOfCalories the number of calories in the ingredient
     */

    // Constructor with parameters
    public Ingredient(String ingredientName, double ingredientAmount, String unitMeasurement, double numberOfCalories) {
        Ingredient.ingredientName = ingredientName;
        Ingredient.ingredientAmount = ingredientAmount;
        Ingredient.unitMeasurement = unitMeasurement;
        Ingredient.numberOfCalories = numberOfCalories;
    }

    /**
     * Returns a string representation of the ingredient.
     *
     * @return a string representation of the ingredient
     */

    @Override
    public String toString() {
        return ingredientAmount + " " + unitMeasurement + " " + ingredientName;
    }

    /**
     * Sets the name of the ingredient.
     * If the name is null, empty, or contains non-alphabetical characters, an error message is printed.
     *
     * @param ingredientName the new name of the ingredient
     */

    public void setIngredientName(String ingredientName) {
        if (ingredientName != null && !ingredientName.isEmpty() && ingredientName.matches("[a-zA-Z ]+")) {
            Ingredient.ingredientName = ingredientName;
        } else {
            System.out.println("Invalid ingredient name.");
        }
    }
    
    /**
     * Sets the amount of the ingredient.
     * If the amount is less than 0, an error message is printed.
     *
     * @param ingredientAmount the new amount of the ingredient
     */

    // Method to set the ingredient amount
    public void setIngredientAmount(double ingredientAmount) {
        if (ingredientAmount >= 0) {
            Ingredient.ingredientAmount = ingredientAmount;
        } else {
            System.out.println("Invalid ingredient amount.");
        }
    }

    /**
     * Sets the unit of measurement for the ingredient.
     * If the unit of measurement is null, empty, or contains non-alphabetical characters, an error message is printed.
     *
     * @param unitMeasurement the new unit of measurement
     */

    // Method to set the unit of measurement
    public void setUnitMeasurement(String unitMeasurement) {
        if (unitMeasurement != null && !unitMeasurement.isEmpty() && unitMeasurement.matches("[a-zA-Z]+")) {
            Ingredient.unitMeasurement = unitMeasurement;
        } else {
            System.out.println("Invalid unit of measurement.");
        }
    }

    /**
     * Sets the number of calories in the ingredient.
     * If the number of calories is less than 0, an error message is printed.
     *
     * @param numberOfCalories the new number of calories
     */
    
    // Method to set the number of calories
    public void setNumberOfCalories(double numberOfCalories) {
        if (numberOfCalories >= 0) {
            Ingredient.numberOfCalories = numberOfCalories;
        } else {
            System.out.println("Invalid number of calories.");
        }
    }

    /**
     * Returns the name of the ingredient.
     *
     * @return the name of the ingredient
     */

    // Method to get the ingredient name
    public String getIngredientName() {
        return ingredientName;
    }

    /**
     * Returns the amount of the ingredient.
     *
     * @return the amount of the ingredient
     */

    // Method to get the ingredient amount
    public double getIngredientAmount() {
        return ingredientAmount;
    }

    /**
     * Returns the unit of measurement for the ingredient.
     *
     * @return the unit of measurement
     */

    // Method to get the unit of measurement
    public String getUnitMeasurement() {
        return unitMeasurement;
    }

    /**
     * Returns the number of calories in the ingredient.
     *
     * @return the number of calories
     */

    // Method to get the number of calories
    public double getNumberOfCalories() {
        return numberOfCalories;
    }

    /**
     * Adds a new ingredient with the provided values.
     *
     * @param ingredientName the name of the ingredient
     * @param ingredientAmount the amount of the ingredient
     * @param unitMeasurement the unit of measurement for the ingredient
     * @param numberOfCalories the number of calories in the ingredient
     * @return the new ingredient
     */

    // Method to add the ingredient
    public Ingredient addNewIngredient(String ingredientName, double ingredientAmount, String unitMeasurement, double numberOfCalories) {
        Ingredient newIngredient = new Ingredient();
        newIngredient.setIngredientName(ingredientName);
        newIngredient.setIngredientAmount(ingredientAmount);
        newIngredient.setUnitMeasurement(unitMeasurement);
        newIngredient.setNumberOfCalories(numberOfCalories);
        return this;
    }
}
