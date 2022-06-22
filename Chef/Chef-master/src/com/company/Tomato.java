package com.company;

enum TomatoSort{
    RED;
}

public class Tomato extends Vegetable{
    private TomatoSort sort;


    public Tomato(TomatoSort sort) {
        super();
        this.name = "Tomato";
        this.sort = sort;
        this.calorieContent = 30;
        this.ingredientWeight = 150;
        this.carbohydrates = 5.55;
    }

    public TomatoSort getSort() {
        return sort;
    }

    public String toString(){
        String result = String.format("[Vegetable: %s, sort: %s, calories: %.2f kKal, carbohydrates: %.2f gr., ingredient weight: %.2f gr.]%n",
                getName(), getSort().toString(), getCalorieContent() ,
                getCarbohydrates(), getIngredientWeight());
        return result;
    }
}
