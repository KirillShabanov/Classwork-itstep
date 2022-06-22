package com.company;

enum BasilSort {
    GREEN;
}

public class Basil extends Vegetable{
    private BasilSort sort;

    public Basil(BasilSort sort) {
        super();
        this.name = "Basil";
        this.sort = sort;
        this.calorieContent = 21.6;
        this.ingredientWeight = 80;
        this.carbohydrates = 3.44;
    }

    public BasilSort getSort() {
        return sort;
    }

    public String toString() {
        String result = String.format("[Vegetable: %s, sort: %s, calories: %.2f kKal, carbohydrates: %.2f gr., ingredient weight: %.2f gr.]%n",
                getName(), getSort().toString(), getCalorieContent(),
                getCarbohydrates(), getIngredientWeight());
        return result;
    }
}
