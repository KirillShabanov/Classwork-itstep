package com.company;

enum ThymeSort {
    GREEN;
}

public class Thyme extends Vegetable{
    private ThymeSort sort;

    public Thyme(ThymeSort sort) {
        super();
        this.name = "Sprig of thyme";
        this.sort = sort;
        this.calorieContent = 25.25;
        this.ingredientWeight = 25;
        this.carbohydrates = 2.625;
    }

    public ThymeSort getSort() {
        return sort;
    }

    public String toString() {
        String result = String.format("[Vegetable: %s, sort: %s, calories: %.2f kKal, carbohydrates: %.2f gr., ingredient weight: %.2f gr.]%n",
                getName(), getSort().toString(), getCalorieContent(),
                getCarbohydrates(), getIngredientWeight());
        return result;
    }
}
