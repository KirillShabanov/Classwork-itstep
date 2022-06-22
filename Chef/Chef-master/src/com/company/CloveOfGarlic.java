package com.company;

enum GarlicSort {
    ORDINARY;
}
public class CloveOfGarlic extends Vegetable{
    private GarlicSort sort;


    public CloveOfGarlic(GarlicSort sort) {
        super();
        this.name = "Clove of garlic";
        this.sort = sort;
        this.calorieContent = 8.49;
        this.ingredientWeight = 6;
        this.carbohydrates = 1.8576;
    }

    public GarlicSort getSort() {
        return sort;
    }

    public String toString(){
        String result = String.format("[Vegetable: %s, sort: %s, calories: %.2f kKal, carbohydrates: %.2f gr., ingredient weight: %.2f gr.]%n",
                getName(), getSort().toString(), getCalorieContent() ,
                getCarbohydrates(), getIngredientWeight());
        return result;
    }
}
