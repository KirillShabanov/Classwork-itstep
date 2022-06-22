package com.company;

enum ItalianBreadSort{
    CIABATTA;
}
enum BaguetteSort{
    TRADITIONAL;
}
enum OilSort{
    OLIVIA;
}
enum VinegarSort{
    BALSAMIC;
}


public class SaladDressing extends Vegetable{
    private ItalianBreadSort italianBreadsort;
    private BaguetteSort baguetteSort;
    private OilSort oilSort;
    private VinegarSort vinegarSort;

    public SaladDressing(ItalianBreadSort sort) {
        super();
        this.name = "Italian bread";
        this.italianBreadsort = sort;
        this.calorieContent = 655;
        this.ingredientWeight = 250;
        this.carbohydrates = 119.50;
    }

    public SaladDressing(BaguetteSort sort) {
        super();
        this.name = "Baguette";
        this.baguetteSort = sort;
        this.calorieContent = 655;
        this.ingredientWeight = 250;
        this.carbohydrates = 124.1;
    }

    public SaladDressing(OilSort sort) {
        super();
        this.name = "Olivia oil";
        this.oilSort = sort;
        this.calorieContent = 538.8;
        this.ingredientWeight = 60;
        this.carbohydrates = 0;
    }

    public SaladDressing(VinegarSort sort) {
        super();
        this.name = "Balsamic vinegar";
        this.vinegarSort = sort;
        this.calorieContent = 26.4;
        this.ingredientWeight = 27.5;
        this.carbohydrates = 5.225;
    }



    public String toString() {
        String result = String.format("[Vegetable: %s, calories: %.2f kKal, carbohydrates: %.2f gr., ingredient weight: %.2f gr.]%n",
                getName(), getCalorieContent(),
                getCarbohydrates(), getIngredientWeight());
        return result;
    }
}
