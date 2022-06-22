package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
        Шеф-повар. Определить иерархию овощей. Сделать салат. Подсчитать ка-
        лорийность. Провести сортировку овощей для салата на основе одного из
        параметров (содержание углеводов). Найти овощи в салате, соответствующие заданному диапазону
        калорийности.
         **/
public class Chef {

    public static void main(String[] args) {
	Salad salad = new Salad();
    salad.addVegetable(new Tomato(TomatoSort.RED));
    salad.addVegetable(new CloveOfGarlic(GarlicSort.ORDINARY));
    salad.addVegetable(new Cucumber(CucumberSort.GREEN));
    salad.addVegetable(new Onion(OnionSort.GREEN));
    salad.addVegetable(new Basil(BasilSort.GREEN));
    salad.addVegetable(new Thyme(ThymeSort.GREEN));
    salad.addVegetable(new SaladDressing(ItalianBreadSort.CIABATTA));
    salad.addVegetable(new SaladDressing(OilSort.OLIVIA));
    salad.addVegetable(new SaladDressing(VinegarSort.BALSAMIC));
    salad.sort();
        System.out.println(salad.toString());
        System.out.println("Total calories: " + salad.getCalorieContent());
        System.out.println();

        ArrayList<Vegetable> vegetablesBetweenCalorieContent = salad.getVegetablesBetweenCalorieContent(5,10);
        for (Vegetable vegetable : vegetablesBetweenCalorieContent)
            System.out.println(vegetablesBetweenCalorieContent.toString());
    }
}

class Salad{
    private double calorieContent;
    private List<Vegetable> vegetables = new ArrayList<>();

    public void addVegetable (Vegetable vegetable){
        vegetables.add(vegetable);
    }
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Light Italian salad: \n");
        for (Vegetable vegetable : vegetables) {
            String sVegetable = vegetable.toString();
            stringBuilder.append(sVegetable);
        }
        return stringBuilder.toString();
    }

    public double getCalorieContent() {
        double sum = 0;
        for (Vegetable vegetable : vegetables)
            sum += vegetable.getCalorieContent();
        return sum;
    }
    public void sort() {
        Collections.sort(vegetables);
    }

    public ArrayList<Vegetable> getVegetablesBetweenCalorieContent(double minCalorieContent, double maxCalorieContent){
        ArrayList<Vegetable> vegetablesBetweenCalorieContent = new ArrayList<>();
        for (Vegetable vegetable : vegetables)
            if (vegetable.getCalorieContent()>=minCalorieContent&&vegetable.getCalorieContent()<=maxCalorieContent)
                vegetablesBetweenCalorieContent.add(vegetable);
        return vegetablesBetweenCalorieContent;
    }
}
