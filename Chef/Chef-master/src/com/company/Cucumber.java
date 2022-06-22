package com.company;

enum CucumberSort {
    GREEN;
}
public class Cucumber extends Vegetable {
    private CucumberSort sort;

    public Cucumber(CucumberSort sort) {
        super();
        this.name = "Cucumber";
        this.sort = sort;
        this.calorieContent = 18.2;
        this.ingredientWeight = 130;
        this.carbohydrates = 3.25;
    }

    public CucumberSort getSort() {
        return sort;
    }

    public String toString(){
        String result = String.format("[Vegetable: %s, sort: %s, calories: %.2f kKal, carbohydrates: %.2f gr., ingredient weight: %.2f gr.]%n",
                getName(), getSort().toString(), getCalorieContent() ,
                getCarbohydrates(), getIngredientWeight());
        return result;
    }
}
