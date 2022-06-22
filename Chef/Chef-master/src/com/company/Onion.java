package com.company;

enum OnionSort {
    GREEN;
}

public class Onion extends Vegetable {
        private OnionSort sort;

        public Onion(OnionSort sort) {
            super();
            this.name = "Onion";
            this.sort = sort;
            this.calorieContent = 70.5;
            this.ingredientWeight = 150;
            this.carbohydrates = 15.6;
        }

        public OnionSort getSort() {
            return sort;
        }

        public String toString() {
            String result = String.format("[Vegetable: %s, sort: %s, calories: %.2f kKal, carbohydrates: %.2f gr., ingredient weight: %.2f gr.]%n",
                    getName(), getSort().toString(), getCalorieContent(),
                    getCarbohydrates(), getIngredientWeight());
            return result;
        }
    }

