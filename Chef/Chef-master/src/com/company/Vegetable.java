package com.company;

public class Vegetable implements Comparable<Vegetable> {
    public String name = "";
    public double calorieContent;
    public double carbohydrates;
    public double ingredientWeight;

    public Vegetable() {
        this.calorieContent = calorieContent;
        this.carbohydrates = carbohydrates;
        this.ingredientWeight = ingredientWeight;
    }

    public int compareTo (Vegetable vegetable){
        double carbohydrates1 = getCarbohydrates();
        double carbohydrates2 = vegetable.getCarbohydrates();
        double sCarbohydrates1 = carbohydrates1;
        double sCarbohydrates2 = carbohydrates2;
        return Double.compare(sCarbohydrates1,sCarbohydrates2);
    }

    public String getName() {
        return name;
    }

    public double getCalorieContent() {
        return calorieContent;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getIngredientWeight() {
        return ingredientWeight;
    }
}
